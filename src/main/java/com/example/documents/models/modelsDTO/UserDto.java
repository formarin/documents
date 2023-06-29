package com.example.documents.models.modelsDTO;

public record UserDto(
        String jobTitle,
        String subdivision,
        String fullName,
        String email,
        String password
) {
}
