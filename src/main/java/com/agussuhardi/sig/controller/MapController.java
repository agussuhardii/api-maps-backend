package com.agussuhardi.sig.controller;

import com.agussuhardi.sig.dao.*;
import com.agussuhardi.sig.entity.CampusDepartementModel;
import com.agussuhardi.sig.entity.CampusModel;
import com.agussuhardi.sig.entity.DepartementModel;
import com.agussuhardi.sig.entity.LocationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by agussuhardi on 07/12/16.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "api/map")
public class MapController {

    @Autowired
    LocationDao dao;

    @Autowired
    CampusDepartementDao campusDepartementDao;

    //get Location By
    @RequestMapping(value = "gets", method = RequestMethod.GET)
    public Iterable<LocationModel> getMap(
            @RequestParam(required = false) String departement,
            @RequestParam(required = false) String accreditation,
            @RequestParam(required = false) String level
    ) {

        if (departement != null && accreditation == null && level == null) {
            System.out.println("satu");//1
            return campusDepartementDao.findByDepartement(departement);

        } else if (departement == null && accreditation != null && level == null) {
            System.out.println("dua");//2
            return campusDepartementDao.findByAccreditation(accreditation);

        } else if (departement == null && accreditation == null && level != null) {
            System.out.println("tiga/");//3
            return campusDepartementDao.findByLevel(level);

        } else if (departement != null && accreditation != null && level == null) {
            System.out.println("empat");//4
            return campusDepartementDao.findByDepartementAndAccreditation(departement, accreditation);

        } else if (departement != null && accreditation == null && level != null) {
            System.out.println("lima");//5
            return campusDepartementDao.findByDepartementAndLevel(departement, level);

        } else if (departement == null && accreditation != null && level != null) {
            System.out.println("enam");//6
            return campusDepartementDao.findByAccreditationAndLevel(accreditation, level);

        } else {
            System.out.println("enam");//7
            return dao.findAll();
        }
    }


    @RequestMapping(value = "departement")
    Iterable<CampusDepartementModel> getDepartement(
            @RequestParam String campus
    ){
        return campusDepartementDao.findByCampus(campus);
    }

    @RequestMapping(value = "campus")
    Iterable<CampusDepartementModel> getLikeCampus(
            @RequestParam String name
    ){
        return campusDepartementDao.findLikeCampus("%"+name+"%");
    }




}
