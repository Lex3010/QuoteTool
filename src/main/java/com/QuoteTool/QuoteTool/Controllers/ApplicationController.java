package com.QuoteTool.QuoteTool.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @GetMapping(path = "/")
    public static String quoteTool() {
        return "index";
    }


}
