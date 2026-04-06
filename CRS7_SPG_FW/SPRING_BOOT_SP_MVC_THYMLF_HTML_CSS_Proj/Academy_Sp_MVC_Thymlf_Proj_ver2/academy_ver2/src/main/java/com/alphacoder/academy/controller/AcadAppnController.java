package com.alphacoder.academy.controller;

import com.alphacoder.academy.model.RegistrationForm;

import jakarta.validation.Valid;  // ver 2
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // ver 2 
import org.springframework.validation.BindingResult;  // v2
import org.springframework.web.bind.annotation.*;     // v2

@Controller
public class AcadAppnController {

    // Serve the index.html page
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Start your Java journey 🚀");
        return "index";  // returns Thymeleaf template index.html
    } 

    @GetMapping("/registration")
    public String registration(Model model) {
         model.addAttribute("registrationForm", new RegistrationForm());  // 🔥 MUST
        return "registration";
    }

    // Handle form submission
    @PostMapping("/register")
    public String handleForm(
            @Valid @ModelAttribute("registrationForm") RegistrationForm form,
            BindingResult result,
            Model model) {

        // Check for validation errors
        if (result.hasErrors()) {
            return "registration";     // Return to the form with error messages
        }     

        model.addAttribute("message",
            "Successfully Registered: " + form.getFirstName() 
                + " " + form.getLastName() + " (" + form.getEmail() + ")");

        // Add form data to the model for the success page
        model.addAttribute("firstName", form.getFirstName());
        model.addAttribute("lastName", form.getLastName());
        model.addAttribute("country", form.getCountry());
        model.addAttribute("dob", form.getDob());
        model.addAttribute("email", form.getEmail());

            //return "success";
        return "index";  // redirect to home with message
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