package com.example.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Request {

    // Поле systemName теперь типа Systems
    private Systems systemName;

    // Остальные поля остаются без изменений
    @NotNull
    @Size(max = 32)
    private String uid;

    @NotNull
    @Size(max = 32)
    private String operationUid;

    // ...

    // Геттеры и сеттеры для остальных полей
    public Systems getSystemName() {
        return systemName;
    }

    public void setSystemName(Systems systemName) {
        this.systemName = systemName;
    }
}