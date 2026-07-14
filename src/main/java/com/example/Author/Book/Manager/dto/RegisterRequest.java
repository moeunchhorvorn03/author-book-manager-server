package com.example.Author.Book.Manager.dto;

import lombok.Data;

@Data
public class RegisterRequest {

    private String username;

    private String email;

    private String password;

    private String role; // Optional, defaults to USER
    
}
