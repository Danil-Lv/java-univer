package com.example.controller;

import com.example.exception.UnsupportedCodeException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MyController {

    @PostMapping("/process-request")
    @ResponseStatus(HttpStatus.OK)
    public Response processRequest(@Valid @RequestBody Request request) throws UnsupportedCodeException {
        if ("123".equals(request.getUid())) {
            throw new UnsupportedCodeException("Код '123' не поддерживается.");
        }

        // Обычная логика обработки запроса
        System.out.println("Запрос успешно обработан");

        return new Response(request.getUid(), request.getOperationUid(), "ERP", "2000-01-01T00:00:00Z", "success", null, null);
    }

    // Обработчик исключения для UnsupportedCodeException
    @ExceptionHandler(UnsupportedCodeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public Response handleUnsupportedCodeException(UnsupportedCodeException e) {
        return new Response(null, null, "ERP", null, "failed", "UnsupportedCodeException", e.getMessage());
    }
}