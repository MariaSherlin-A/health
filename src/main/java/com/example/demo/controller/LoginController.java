
package com.example.demo.controller;
import com.example.demo.model.User;
import org.springframework.stereotype.Controller; // Fixed import
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @GetMapping("/")
    public String showLogin(Model model) {
        model.addAttribute("patient", new User()); 
        return "login";
    }
    @PostMapping("/login")
    public String login(@ModelAttribute("patient") User patient) {
        if ("Sherl".equals(patient.getUsername()) && "1234".equals(patient.getPassword())) {
            return "success";
        } else {
            return "error";
        }
    }
}
