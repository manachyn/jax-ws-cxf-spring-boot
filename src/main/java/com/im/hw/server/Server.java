package com.im.hw.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

public class Server {

    protected Server() throws Exception {
        System.out.println("Starting Server");
        HelloWorldImpl implementor = new HelloWorldImpl();
        String address = "http://localhost:9000/helloWorld";
        Endpoint.publish(address, implementor);

//        HelloWorldImpl implementor = new HelloWorldImpl();
//        JaxWsServerFactoryBean svrFactory = new JaxWsServerFactoryBean();
//        svrFactory.setServiceClass(HelloWorld.class);
//        svrFactory.setAddress("http://localhost:9000/helloWorld");
//        svrFactory.setServiceBean(implementor);
//        svrFactory.getInInterceptors().add(new LoggingInInterceptor());
//        svrFactory.getOutInterceptors().add(new LoggingOutInterceptor());
//        svrFactory.create();
    }

    public static void main(String args[]) throws Exception {
        new Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}