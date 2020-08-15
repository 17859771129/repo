package com.ylz.hf.write.tool;

import com.xmltool.impl.XmlLoader;
import org.apache.commons.io.IOUtils;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;

public class XmlUtil {

    private static final Logger log = LoggerFactory.getLogger(XmlUtil.class);

    public static boolean setBeans(Object obect, String xml) {
        InputStream inputStream = null;
        try {
            xml = xml.replace("\n", "");
            final XmlLoader xmlLoader = new XmlLoader();
            xmlLoader.setBeans(obect);
            inputStream = IOUtils.toInputStream(xml, "UTF-8");
            xmlLoader.load(inputStream);
            return true;
        } catch (DocumentException e) {
            log.error("读取xml过程出现错误，{}，{}", e.getMessage(), e);
        } catch (IOException e) {
            log.error("xml读取到Bean中出错，{}，{}", e.getMessage(), e);
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
        return false;
    }


}
