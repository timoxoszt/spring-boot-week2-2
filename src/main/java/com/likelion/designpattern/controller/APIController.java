package com.likelion.designpattern.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {
    // DEPARTMENT
    @GetMapping(value = "/deparments")
    public String listDepartment(){
        return null;
    }

    // EMPLOYEE
    @GetMapping(value = "/employees")
    public String listEmployee(){
        return null;
    }

}
