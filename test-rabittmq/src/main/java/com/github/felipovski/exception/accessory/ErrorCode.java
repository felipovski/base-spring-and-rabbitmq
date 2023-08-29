package com.github.felipovski.exception.accessory;

public enum ErrorCode {

    RABBITMQ_001("Algum erro no RabbitMQ");
    private final String message;
    ErrorCode(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
