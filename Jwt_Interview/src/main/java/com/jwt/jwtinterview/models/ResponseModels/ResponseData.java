package com.jwt.jwtinterview.models.ResponseModels;

import lombok.Data;

import java.util.Optional;

@Data
public class ResponseData<T> {
    private boolean success;
    private String message;
    private Optional<T> data;

    public ResponseData(boolean success, String message, Optional<T> data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
}
