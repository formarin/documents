package com.example.documents.modelsDTO;

import java.time.LocalDate;

public record OrderDtoForJournal(
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
