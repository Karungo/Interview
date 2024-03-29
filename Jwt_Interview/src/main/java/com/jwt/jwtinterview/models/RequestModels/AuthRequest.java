package com.jwt.jwtinterview.models.RequestModels;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthRequest {
    private String userName;
    private String password;
}
