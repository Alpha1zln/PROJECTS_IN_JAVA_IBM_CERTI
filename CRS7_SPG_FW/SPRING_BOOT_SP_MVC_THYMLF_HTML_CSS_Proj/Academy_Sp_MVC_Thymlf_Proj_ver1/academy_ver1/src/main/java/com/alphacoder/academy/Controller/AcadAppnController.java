package com.alphacoder.academy.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AcadAppnController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Start your Java journey 🚀");
        return "index";
    }

    @GetMapping("/registration")
    public String registration() {
        return "registration";
    }

    // 🔥 IMPORTANT (this was missing)
    @PostMapping("/register")
    public String handleRegistration(
            @RequestParam String name,
            @RequestParam String email,
            Model model) {

        model.addAttribute("message",
                "Successfully Registered: " + name + " (" + email + ")");

        return "index"; // redirect to home with message
    }



    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}