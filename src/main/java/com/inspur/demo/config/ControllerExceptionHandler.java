package com.inspur.demo.config;

import com.inspur.demo.model.ResultObject;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler
    public ResultObject<Object> handleException(MethodArgumentNotValidException e) {
        ResultObject<Object> resultObject = new ResultObject<>();
        String errorMessage = e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).reduce((s1, s2) -> s1 + "," + s2).orElse("");
        resultObject.setStatus(false);
        resultObject.setError("INVALIDATE_PARAMS");
        resultObject.setErrorMessage(errorMessage);
        return resultObject;
    }
}
