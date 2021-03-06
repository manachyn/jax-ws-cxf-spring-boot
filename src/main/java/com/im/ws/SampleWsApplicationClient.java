package com.im.ws;

import java.io.StringReader;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class SampleWsApplicationClient {

    public static void main(String[] args) {
        String address = "http://localhost:8080/Service/Hello";
        // final String request =
        // "<q0:sayHello xmlns:q0=\"http://service.ws.sample\">Elan</q0:sayHello>";
        String request = "<q0:sayHello xmlns:q0=\"http://service.ws.sample/\"><myname>Elan</myname></q0:sayHello>";

        StreamSource source = new StreamSource(new StringReader(request));
        StreamResult result = new StreamResult(System.out);

        //assertThat(this.output.toString(),
        //           containsString("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
        //                          + "<ns2:sayHelloResponse xmlns:ns2=\"http://service.ws.sample/\">"
        //                          + "<return>Hello, Welcome to CXF Spring boot Elan!!!</return>"
        //                          + "</ns2:sayHelloResponse>"));
    }

}
