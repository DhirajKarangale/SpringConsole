package com.restweb.RestfulWebService.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundExpection extends RuntimeException
{
    public UserNotFoundExpection (String message)
    {
        super(message);
    }
}