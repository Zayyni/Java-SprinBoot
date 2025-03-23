package com.zayyni.springbootinputmediatype.rest;

import com.zayyni.springbootinputmediatype.model.Student;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentRestController {

    @PostMapping("/data")
    public String readData(
            @RequestBody Student student)
    {
        System.out.println(student);
        return "Data is "+ student;
    }
}
