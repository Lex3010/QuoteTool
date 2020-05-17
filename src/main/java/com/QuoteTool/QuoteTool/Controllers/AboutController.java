package com.QuoteTool.QuoteTool.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping(path = "/over-ons")
    public String aboutUs() {
        return "about_us/about_us";
    }
}
