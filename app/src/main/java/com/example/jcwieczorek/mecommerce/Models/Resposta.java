package com.example.jcwieczorek.mecommerce.Models;

import com.fasterxml.jackson.annotation.JsonInclude;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/**
 * Created by jcwieczorek on 23/11/2017.
 */

public class Resposta<T> {

    private ResponseStatus status;
    private String message;
    @JsonInclude(NON_NULL)
    private T data;

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseStatus getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

}