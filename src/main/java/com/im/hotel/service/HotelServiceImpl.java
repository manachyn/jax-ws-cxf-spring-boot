package com.im.hotel.service;

import com.im.hotel.domain.Hotel;

import javax.jws.WebService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@WebService(endpointInterface = "com.im.hotel.service.HotelService")
public class HotelServiceImpl implements HotelService {

    private static Map<Integer, Hotel> hotels = new HashMap<Integer, Hotel>();

    public String searchHotels(String name) {
        try {
            Thread.sleep(1000 * 5);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "Hello " + name + "!";
    }

    public boolean addHotel(Hotel p) {
        if (hotels.get(p.getId()) != null) return false;
        hotels.put(p.getId(), p);
        return true;
    }

    public boolean deleteHotel(int id) {
        if (hotels.get(id) == null) return false;
        hotels.remove(id);
        return true;
    }

    public Hotel getHotel(int id) {
        return hotels.get(id);
    }

    public Hotel[] getAllHotels() {
        Set<Integer> ids = hotels.keySet();
        Hotel[] h = new Hotel[ids.size()];
        int i = 0;
        for (Integer id : ids) {
            h[i] = hotels.get(id);
            i++;
        }
        return h;
    }
}
