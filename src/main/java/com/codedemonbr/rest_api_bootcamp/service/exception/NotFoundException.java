package com.codedemonbr.rest_api_bootcamp.service.exception;

public class NotFoundException extends BusinessException{
    private static final long serialVersionUID = 1L;

    public NotFoundException(){
        super("Resource not found");
    }
}
