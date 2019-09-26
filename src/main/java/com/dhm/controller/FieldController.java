package com.dhm.controller;

import com.dhm.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldController {
//    @Value("${username}")
//    private String username;
//    @Value("${age}")
//    private int age;


//    @RequestMapping("/hello")
//    public String hello(){
//    return username+"哈哈哈"+age;
//}
@Autowired
private Author author;
    @RequestMapping("/hello")
    public String hello(){
        return author.getName()+"哈哈哈"+author.getAges();
    }
}
