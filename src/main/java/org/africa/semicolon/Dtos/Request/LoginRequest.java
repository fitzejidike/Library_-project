package org.africa.semicolon.Dtos.Request;

import lombok.Data;

@Data
public class LoginRequest {
    private String username;
    private  String password;
}
