package com.example.controller;

/**
 * Created by Ali on 12/22/2016.
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Proudly handcrafted by " +
                "<a href='https://programming-in-java2.blogspot.in/2016/12/spring-data-jpa-using-springboot.html'>Ali</a> :)";
    }

}