package com.example.dto;


import lombok.Data;

@Data
public class KafkaMessage {
    private String key;
    private String value;
    private String timestamp;
}