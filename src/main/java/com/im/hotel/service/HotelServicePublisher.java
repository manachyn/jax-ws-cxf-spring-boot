package com.im.hotel.service;

import javax.xml.ws.Endpoint;

public class HotelServicePublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:3000/ws/hotel", new HotelServiceImpl());
        System.out.println("HotelService is published");
    }
}
