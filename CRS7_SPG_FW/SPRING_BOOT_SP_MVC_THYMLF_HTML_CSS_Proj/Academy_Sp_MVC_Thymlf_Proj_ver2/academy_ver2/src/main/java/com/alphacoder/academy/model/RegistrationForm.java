package com.alphacoder.academy.model;

import jakarta.validation.constraints.*;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

public class RegistrationForm {

    @NotBlank(message = "First Name is required")
    private String firstName;

    @NotBlank(message = "Last Name is required")
    private String lastName;

    @NotBlank(message = "Country is required")
    private String country;

    @Past(message = "Date of Birth must be in the past")
    @DateTimeFormat(pattern = "dd-MM-yyyy") // 🔥 Specify date format
    private LocalDate dob;   // 🔥 Better than Date

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    private String email;

    // 🔥 Getters & Setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}