package com.zayyni.springboot2restfirstapp.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductRestController {

    @GetMapping("/all")
    public ResponseEntity<String> getAllProducts(){
        ResponseEntity<String> resp =   new ResponseEntity<String>("From ALL", HttpStatus.OK);
        return  resp;
    };

    @PostMapping("/save")
    public ResponseEntity<String> saveProduct(){
        ResponseEntity<String> resp = new ResponseEntity<String>("From Save",HttpStatus.CREATED);//201 created
        return resp;
    }

    @PutMapping("/update")
    public ResponseEntity<String> modifyProduct(){
//        ResponseEntity<String> resp = new ResponseEntity<String>("From Update",HttpStatus.RESET_CONTENT);//205 RESET_CONTENT
        ResponseEntity<String> resp = new ResponseEntity<String>("From Update",HttpStatus.OK);//205 RESET_CONTENT
        return resp;
    }

    @DeleteMapping("/remove")
    public ResponseEntity<String> removeData(){
        ResponseEntity<String> resp= new ResponseEntity<String>("REMOVED",HttpStatus.OK);
        return resp;
    }
}
