package com.example.documents.models.modelsDTO;

import java.time.LocalDate;

public record OrderGetDto(
        Integer numbOrder,
        LocalDate dateEmployment,
        LocalDate dateDismissal,
        LocalDate dateStart,
        LocalDate dateEnd,
        LocalDate dateSigning,
        String orderType,
        String userFullName
) {
}
