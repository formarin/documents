package com.example.documents.models;

public enum StatusEnum {
    APPROVED("Одобрено"),
    PROCESSED("Проведено");

    private final String value;

    StatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
