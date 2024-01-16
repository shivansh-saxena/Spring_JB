package com.shiv.com.shiv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {
    @RequestMapping("/")
    public String defaultReq()
    {
        return "Default Page!!";
    }
}
