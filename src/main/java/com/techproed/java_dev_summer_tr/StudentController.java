package com.techproed.java_dev_summer_tr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping(path = "/students")
    public String getStudents() {
        return "Ali Can, Veli Han,Kerem Tan";
    }

}
