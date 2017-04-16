package com.agussuhardi.sig.controller;

import com.agussuhardi.sig.dao.CampusDao;
import com.agussuhardi.sig.entity.CampusModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by agussuhardi on 05/12/16.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "api/campus")
public class CampusController {

    @Autowired
    private CampusDao dao;

    //get all item
    @RequestMapping(value = "gets", method = RequestMethod.GET)
    public Iterable<CampusModel> gets(){
        Iterable<CampusModel> l = dao.findAll();
        return l;
    }
    //get item by Id
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public CampusModel get(
            @RequestParam String code
    ){
        return dao.findOne(code);
    }
    //save item
    @RequestMapping(value = "save", method = RequestMethod.PUT)
    public void save(
            @RequestBody CampusModel c
    ){
        dao.save(c);
    }

}