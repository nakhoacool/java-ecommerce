package com.khoanguyen.ecommerce.exceptions;

public class ResourceAlreadyExistsException extends RuntimeException {
    public ResourceAlreadyExistsException(String s) {
        super(s);
    }
}
