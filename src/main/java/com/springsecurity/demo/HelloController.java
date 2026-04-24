package com.springsecurity.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloController {
    @GetMapping("/public")
    public String publicApi(){
        return "This is public request";
    }
    @GetMapping("/private")
    public String privateApi(){
        return "This is private";
    }

}
