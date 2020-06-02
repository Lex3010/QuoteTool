package com.QuoteTool.QuoteTool.Controllers;

import com.QuoteTool.QuoteTool.Enums.UserRole;
import com.QuoteTool.QuoteTool.Models.User;
import com.QuoteTool.QuoteTool.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import static com.QuoteTool.QuoteTool.Enums.UserRole.USER;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping(path = "/offerte-tool/gebruikers/registreren")
    public static String getNewUserPage(Model model) {
        model.addAttribute("user", new User());
        return "user/create_new_user";
    }

    @PostMapping(path = "/offerte-tool/gebruikers/registreren")
    public String createNewUser(@ModelAttribute User user, @RequestParam String companyName, @RequestParam String email, Long id) {
        System.out.println("foo");
        UserRole role = USER;
        User newUser = new User(companyName, email, role, id);
        userRepository.save(newUser);
        return "foo";
    }
}
