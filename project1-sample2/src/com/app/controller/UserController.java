package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dao.IUserDao;
import com.app.pojos.User;



@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {
@Autowired
private IUserDao dao;

@PostMapping
public ResponseEntity<?> getUser(@RequestBody User u)
{
return new ResponseEntity<>(dao.validateUser(u.getEmail(), u.getPassword()),HttpStatus.CREATED);
}

}
