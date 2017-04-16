package com.agussuhardi.sig.controller;

import com.agussuhardi.sig.dao.DepartementDao;
import com.agussuhardi.sig.entity.DepartementModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by agussuhardi on 05/12/16.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "api/departement")
public class DepartementController {

    @Autowired
    private DepartementDao dao;

    //get all item
    @RequestMapping(value = "gets", method = RequestMethod.GET)
    public Iterable<DepartementModel> gets() {
        return dao.findAll();
    }

    //get item by Id
    @RequestMapping(value = "get", method = RequestMethod.GET)
    public DepartementModel get(
            @RequestParam String code
    ) {
        return dao.findOne(code);
    }

    //save item
    @RequestMapping(value = "save", method = RequestMethod.PUT)
    public void saveCampus(
            @RequestBody DepartementModel d
    ) {
        dao.save(d);
    }
}