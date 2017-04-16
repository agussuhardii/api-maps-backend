package com.agussuhardi.sig.controller;

import com.agussuhardi.sig.dao.UserDao;
import com.agussuhardi.sig.entity.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by agussuhardi on 11/12/16.
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "api/user")
public class UserController {

    @Autowired private UserDao dao;

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public UserModel get(
            @RequestParam String username,
            @RequestParam String password
    ){
        return dao.findUser(username, password);
    }

    @RequestMapping(value = "save", method = RequestMethod.PUT)
    public void save(
            @RequestBody UserModel u
    ){
        dao.save(u);
    }
}
