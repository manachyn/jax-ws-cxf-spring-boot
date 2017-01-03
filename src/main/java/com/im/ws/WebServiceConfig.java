package com.im.ws;

import javax.xml.ws.Endpoint;

import com.im.ws.service.MyServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.im.ws.service.HelloPortImpl;

@Configuration
public class WebServiceConfig {

    @Autowired
    private Bus bus;

    @Bean
    public Endpoint endpoint() {
//        EndpointImpl endpoint = new EndpointImpl(bus, new HelloPortImpl());
//        endpoint.publish("/Hello");

        EndpointImpl endpoint = new EndpointImpl(bus, new MyServiceImpl());
        endpoint.publish("/MyService");

//        endpoint.getServer().getEndpoint().getInInterceptors().add(new LoggingInInterceptor());
//        endpoint.getServer().getEndpoint().getOutInterceptors().add(new LoggingOutInterceptor());

        return endpoint;
    }
}
