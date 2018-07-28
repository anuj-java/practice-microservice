package com.sample.ms.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.ms.application.model.Song;
import com.sample.ms.application.service.SongService;


@RestController
public class SongController {

    /**
     * Below is an example of using Dependency Injection, calling via interface name
     * and implementation class is automatically detected which is annotated with @Service
     *
     * This is D of SOLID
     */
    @Autowired
    private SongService songService;

    /**
     * This method is a GET and retrieves customer details.
     * @param id
     * @return
     */
    @RequestMapping(path = "/songs/{id}", method =  RequestMethod.GET)
    public Song getCustomerDetails(@PathVariable Integer id){

        return songService.getSongForId(id);
    }

}
