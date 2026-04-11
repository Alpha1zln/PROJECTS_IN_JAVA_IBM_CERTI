package com.alpha1zln.SpringSecProj.model;


public class User {
    private String username;
    private String password;
    private String role; // Add a role field

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}



// ********* erlr ver 1 
// public class User {
    
//     private String username; // Username of the user
//     private String password; // Password of the user (encoded)

//     // Constructor
//     public User(String username, String password) {
//         this.username = username;
//         this.password = password;
//     }

//     // Getters and Setters
//     public String getUsername() {
//         return username;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }
// }
