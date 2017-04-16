package com.agussuhardi.sig.controller;

import com.agussuhardi.sig.dao.LocationDao;
import com.agussuhardi.sig.entity.LocationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by agussuhardi on 05/12/16.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "api/location")
public class LocationController {


    @Autowired
    private LocationDao dao;

    //get all item
    @RequestMapping(value = "gets", method = RequestMethod.GET)
    public Iterable<LocationModel> gets(){
        return dao.findAll();
    }
    //get item by Id
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public LocationModel get(
            @RequestParam String id
    ){
        return dao.findOne(Integer.valueOf(id));
    }
    //save item
    @RequestMapping(value = "save", method = RequestMethod.PUT)
    public void save(
            @RequestBody LocationModel c
    ){
        dao.save(c);
    }

}