package org.africa.semicolon.dtos.Request;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private  String password;
    private boolean logged;
}
