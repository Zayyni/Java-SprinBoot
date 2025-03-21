package com.zayyni.sprinboot2restoutputmediatype.rest;

import com.zayyni.sprinboot2restoutputmediatype.model.Employee;
import com.zayyni.sprinboot2restoutputmediatype.model.Model;
import com.zayyni.sprinboot2restoutputmediatype.model.Product;
import com.zayyni.sprinboot2restoutputmediatype.model.Vendor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class EmployeeRestController {

    @GetMapping("/a")
    public String showA(){
        return "Hello";
    }

    @GetMapping("/b")
    public Employee showB(){
        return new Employee(10,"A");
    }

    @GetMapping("/c")
    public List<String> showC(){
        return Arrays.asList("A","B","C");
    }

    @GetMapping("/cc")
    public Set<String> showCC(){
        return Set.of("A","B","C");
    }

    @GetMapping("/d")
    public List<Employee> showD(){
        return Arrays.asList(
                new Employee(50,"E1"),
                new Employee(51,"E2"),
                new Employee(52,"E3")

        );
    }


    @GetMapping("/e")
    public Map<String,String> showE(){
        return Map.of("K1","V1","K2","V2");
    }

    @GetMapping("/f")
    public Product showF(){
        return new Product(555,"PEN",
                new Model(998,550.0,"RED",
                        new Vendor(8585,"NIT")));
    }
}
