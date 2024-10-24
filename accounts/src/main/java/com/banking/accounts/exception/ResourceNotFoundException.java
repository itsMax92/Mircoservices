package com.banking.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException (String name, String fieldName, String fieldValue) {
        super(String.format("%s not found for the %s : %s", name, fieldName, fieldValue));
    }
}
