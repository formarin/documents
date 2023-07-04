package com.example.documents.modelsDTO;

import com.example.documents.models.StatusEnum;

import java.time.LocalDate;

public record OrderCardDto(
        Long id,
        LocalDate creationDate,
        LocalDate dateEmployment,
        LocalDate dateDismissal,
        LocalDate dateStart,
        LocalDate dateEnd,
        StatusEnum status,
        String orderType,
        Long userId,
        String userFullName
) {

}
