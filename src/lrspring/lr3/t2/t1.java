package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class MyController {

    private static final Logger logger = LoggerFactory.getLogger(lrspring.lr4.t1.MyController.class);

    @PostMapping("/process-request")
    @ResponseStatus(HttpStatus.OK)
    public Response processRequest(@Valid @RequestBody Request request) {
        try {
            logger.info("Получен запрос: {}", request);

            // Логика обработки запроса
            Response response = new Response(request.getUid(), request.getOperationUid(), "ERP", "2000-01-01T00:00:00Z", "success", null, null);
            logger.info("Сформирован ответ: {}", response);

            return response;
        } catch (Exception e) {
            logger.error("Произошло исключение при обработке запроса: ", e);
            throw e; // Перебрасывание исключения для дальнейшей обработки
        }
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Response handleValidationException(MethodArgumentNotValidException ex) {
        logger.error("Ошибка валидации: {}", ex.getBindingResult().getAllErrors());
        return new Response(null, null, "ERP", null, "failed", "ValidationException", ex.getBindingResult().getAllErrors().toString());
    }
}