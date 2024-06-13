package com.springboot.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CustomError {
    private String field;
    private Object rejectedValue;
    private String reason;
}
