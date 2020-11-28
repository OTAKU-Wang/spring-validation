package com.inspur.demo.model;

import lombok.Data;

@Data
public class ResultObject<R> {
    private String error;
    private String errorMessage;
    private Boolean status;
    private R data;
}
