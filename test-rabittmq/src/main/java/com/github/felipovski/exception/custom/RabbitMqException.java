package com.github.felipovski.exception.custom;

import com.github.felipovski.exception.CustomException;
import com.github.felipovski.exception.accessory.ErrorCode;
import org.springframework.http.HttpStatus;

public class RabbitMqException extends CustomException {

    public RabbitMqException() {
        this.errorCode = ErrorCode.RABBITMQ_001.toString();
        this.message = ErrorCode.RABBITMQ_001.getMessage();
        this.httpStatus = HttpStatus.CONFLICT;
    }
}
