package com.ylz.verify.tool;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXValidator;
import org.dom4j.io.XMLWriter;
import org.dom4j.util.XMLErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class VerifyTool {

    private static final Logger log = LoggerFactory.getLogger(VerifyTool.class);


    public static ResponseBean verifyData(String xsdPath, String fileContent) {
        ResponseBean responseBean = new ResponseBean();
        try {
            //创建默认的XML错误处理器
            XMLErrorHandler errorHandler = new XMLErrorHandler();
            //获取基于 SAX 的解析器的实例
            SAXParserFactory factory = SAXParserFactory.newInstance();
            //解析器在解析时验证 XML 内容。
            factory.setValidating(true);
            //指定由此代码生成的解析器将提供对 XML 名称空间的支持。
            factory.setNamespaceAware(true);
            //使用当前配置的工厂参数创建 SAXParser 的一个新实例。
            SAXParser parser = factory.newSAXParser();

            //设置 XMLReader 的基础实现中的特定属性。核心功能和属性列表可以在 [url]http://sax.sourceforge.net/?selected=get-set[/url] 中找到。
            parser.setProperty(
                    "http://java.sun.com/xml/jaxp/properties/schemaLanguage",
                    "http://www.w3.org/2001/XMLSchema");
            parser.setProperty(
                    "http://java.sun.com/xml/jaxp/properties/schemaSource",
                    "file:" + xsdPath);
            //创建一个SAXValidator校验工具，并设置校验工具的属性
            SAXValidator validator = new SAXValidator(parser.getXMLReader());
            //设置校验工具的错误处理器，当发生错误时，可以从处理器对象中得到错误信息。
            validator.setErrorHandler(errorHandler);

            //校验
            //获取要校验xml文档实例
            Document xmlDocument = DocumentHelper.parseText(fileContent);
            validator.validate(xmlDocument);

            XMLWriter writer = new XMLWriter(OutputFormat.createPrettyPrint());
            //如果错误信息不为空，说明校验失败，打印错误信息
            if (errorHandler.getErrors().hasContent()) {
                log.error("XML文件通过XSD文件校验失败,{}", errorHandler.getErrors().asXML());
                responseBean.setMessage(errorHandler.getErrors().asXML());
            } else {
                log.info("Good! XML文件通过XSD文件校验成功！");
                responseBean.setCode(Constants.SUCCESS_CODE);
            }
        } catch (Exception ex) {
            log.error("XML内容通过XSD文件:{}检验失败。/n原因： {}", ex.getMessage(), ex);
            responseBean.setMessage(ex.getMessage());
        }
        return responseBean;
    }

    public static ResponseBean verifyCdaData(String xsdPrefix, String fileContent) {
        fileContent = fileContent.replaceFirst("xmlns:mif=\"urn:hl7-org:v3/mif\"", "");
        fileContent = fileContent.replaceFirst("..\\\\sdschemas\\\\SDA.xsd", "../sdschemas/SDA.xsd");
        return verifyData(xsdPrefix + "/sdschemas/SDA.xsd", fileContent);
    }

    public static ResponseBean verifyRegisterData(String xsdPrefix, String fileContent) {
        return verifyData(xsdPrefix + "/multicacheschemas/ProvideAndRegisterDocumentSetRequest.xsd", fileContent);
    }
}
