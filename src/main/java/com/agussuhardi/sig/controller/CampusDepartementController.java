package com.agussuhardi.sig.controller;

import com.agussuhardi.sig.dao.CampusDepartementDao;
import com.agussuhardi.sig.entity.CampusDepartementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by agussuhardi on 05/12/16.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "api/campus/departement")
public class CampusDepartementController {

    @Autowired
    private CampusDepartementDao dao;

    //get all item
    @RequestMapping(value = "gets", method = RequestMethod.GET)
    public Iterable<CampusDepartementModel> gets(){
        return dao.findAll();
    }
    //get item by Id
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public CampusDepartementModel get(
            @RequestParam String id
    ){
        return dao.findOne(Integer.valueOf(id));
    }
    //save item
    @RequestMapping(value = "save", method = RequestMethod.PUT)
    public void save(
            @RequestBody CampusDepartementModel c
    ){
        dao.save(c);
    }

}