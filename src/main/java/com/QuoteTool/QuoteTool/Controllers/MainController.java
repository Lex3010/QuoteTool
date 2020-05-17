package com.QuoteTool.QuoteTool.Controllers;

import com.QuoteTool.QuoteTool.Enums.UserRole;
import com.QuoteTool.QuoteTool.Models.User;
import com.QuoteTool.QuoteTool.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path="/demo")
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "/add")
    public @ResponseBody
    String addNewUser(@RequestParam String companyName, @RequestParam String email, @RequestParam UserRole role) {
        User newUser = new User(companyName, email, role);
        userRepository.save(newUser);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}