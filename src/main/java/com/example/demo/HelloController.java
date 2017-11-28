package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by cjl on 2017/11/17.
 */
@RestController
//@Controller
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private GirlProperties girlProperties;

//    @RequestMapping(value = "/say",method = RequestMethod.GET)
    @RequestMapping(value = "/say")
    public String say(@RequestParam(value = "id",required = false, defaultValue = "0") Integer id){
        return "id: " + id;

    }
 }
