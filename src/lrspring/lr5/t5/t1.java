package com.example.model;

import javax.persistence.Column;

@Value
public class Response {
    @Column(name = "uid", note = "Уникальный идентификатор сообщения, до 32 символов.")
    private String uid;

    @Column(name = "operationUid", note = "Уникальный идентификатор операции, до 32 символов.")
    private String operationUid;

    @Column(name = "systemTime", note = "Время создания сообщения, до 32 символов.")
    private String systemTime;

    @Column(name = "code", note = "Код результата, до 64 символов.")
    private String code;

    @Column(name = "errorCode", note = "Код ошибки, до 128 символов.")
    private String errorCode;

    @Column(name = "errorMessage", note = "Сообщение об ошибке, до 256 символов.")
    private String errorMessage;
}