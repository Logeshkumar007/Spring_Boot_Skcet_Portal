package com.modelexample.modelexa.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.modelexample.modelexa.model.addressModel;

@RestController
public class ApiController {
    @RequestMapping("/pathe")
    public addressModel getdetail() {
        return new addressModel("pranav", 16, "dont knpw", 638656, "teriyathu", "tup", "tn", "in");
    }

}

// @RestController
// public class StudentController {
// @RequestMapping("/student")
// public List<Student> answer()
// {
// List<Student> list = new ArrayList<>();
// Student p = new Student("John", "Welcome, John!");
// list.add(p);
// Student q = new Student(null, null);
// list.add(q);
// return list;

// }

// }
