package com.im.hotel.service;

import com.im.hotel.domain.Hotel;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HotelService {

    @WebMethod
    public String searchHotels(String name);

    @WebMethod
    public boolean addHotel(Hotel p);

    @WebMethod
    public boolean deleteHotel(int id);

    @WebMethod
    public Hotel getHotel(int id);

    @WebMethod
    public Hotel[] getAllHotels();
}
