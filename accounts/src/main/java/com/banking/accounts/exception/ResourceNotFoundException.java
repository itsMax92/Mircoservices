package com.banking.accounts.exception;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException (String name, String fieldName, String fieldValue) {
        super(String.format("%s not found for the %s : %s", name, fieldName, fieldValue));
    }
}
