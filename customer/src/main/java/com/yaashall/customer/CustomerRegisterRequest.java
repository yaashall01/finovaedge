package com.yaashall.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

/**
 * @author Yassine CHALH
 */
@Builder
public record CustomerRegisterRequest(
        @NotBlank String name,
        @Email @NotBlank String email,
        @NotBlank @Size(min = 10, max = 15) String phoneNumber,
        String address) {
}
