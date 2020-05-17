package com.QuoteTool.QuoteTool.Controllers.Admin;

import org.springframework.web.bind.annotation.GetMapping;

public class AdminController {

    @GetMapping(path = "/offerte-tool/gebruikers")
    public static String userInformation() { return "user/user_information"; }
}
