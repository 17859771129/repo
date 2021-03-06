package com.ylz.cdr.write.conf;

import com.ylz.cdr.write.webservice.IWebService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {
    @Autowired
    private IWebService webService;

    @Autowired
    private Bus bus;

    /**
     * 站点服务
     *
     * @return
     */
    @Bean
    public Endpoint studentServiceEndpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, webService);
        endpoint.publish("/cda");
        return endpoint;
    }

    @Bean(name = "cxfServlet")
    public ServletRegistrationBean dispatcherServlet() {
        return new ServletRegistrationBean(new CXFServlet(), "/ws/*");
    }


}
