package com.github.bzalyaliev.adboard.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ErrorResponse {
    String type; // сокращенное имя класса
    String detailedMessage; // #exception.getMessage()
    Integer status; // код ошибки

}
