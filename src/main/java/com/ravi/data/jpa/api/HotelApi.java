package com.ravi.data.jpa.api;

import com.ravi.data.jpa.domain.Hotel;
import com.ravi.data.jpa.service.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelApi {

    @Autowired
    HotelRepository hotelRepository;

    @RequestMapping(value = "/hotel/{hotelId}", method = RequestMethod.GET, produces = {"application/json"})
    public Hotel getHotel(@PathVariable Long hotelId) {
        return hotelRepository.getOne(hotelId);
    }
}
