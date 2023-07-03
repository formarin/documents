package com.example.documents.models;

public enum StatusEnum {
    CREATED("Создан"),
    APPROVED("Одобрено"),
    PROCESSED("Проведено"),
    DECLINED("Отклонено");

    private final String value;

    StatusEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
