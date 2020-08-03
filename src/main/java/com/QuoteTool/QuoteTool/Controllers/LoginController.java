package com.QuoteTool.QuoteTool.Controllers;

import com.QuoteTool.QuoteTool.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/login")
    private String getLoginForm() {
        return "login";
    }
}
