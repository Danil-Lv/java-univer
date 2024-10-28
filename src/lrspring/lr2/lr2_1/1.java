package lrspring.lr2.lr2_1;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Request {

    // Поле uid обязательно и должно содержать до 32 символов
    @NotNull
    @Size(max = 32)
    private String uid;

    // Поле operationUid обязательно и должно содержать до 32 символов
    @NotNull
    @Size(max = 32)
    private String operationUid;

    // Поле systemName необязательно
    private String systemName;

    // Поле systemTime обязательно и должно соответствовать формату даты-времени
    @NotNull
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z$")
    private String systemTime;

    // Поле source необязательно
    private String source;

    // Поле communicationId обязательно и должно быть в диапазоне от 1 до 100000
    @NotNull
    @Min(1)
    @Max(100000)
    private Integer communicationId;

    // Поле templateId необязательно
    private Integer templateId;

    // Поле productCode необязательно
    private Integer productCode;

    // Поле smsCode необязательно
    private Integer smsCode;

    // Геттеры и сеттеры опущены для краткости
}