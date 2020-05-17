package com.QuoteTool.QuoteTool.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @GetMapping(path = "/offerte-tool/gebruikers")
    public static String userInformation() { return "user/user_information"; }

    @GetMapping(path = "/offerte-tool/gebruikers/nieuw")
    public static String getNewUserPage() {
        return "user/create_new_user";
    }
}
