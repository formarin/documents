package com.example.documents.modelsDTO;

import com.example.documents.models.StatusEnum;

import java.time.LocalDate;

public record OrderDto(
        Integer numbOrder,
        LocalDate dateEmployment,
        LocalDate dateDismissal,
        LocalDate dateStart,
        LocalDate dateEnd,
        Long orderTypeId,
        Long userId
) {
}
