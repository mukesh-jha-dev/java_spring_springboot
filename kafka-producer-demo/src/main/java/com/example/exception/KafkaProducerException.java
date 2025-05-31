package com.example.exception;


public class KafkaProducerException extends RuntimeException {
    public KafkaProducerException(String message, Throwable cause) {
        super(message, cause);
    }
}