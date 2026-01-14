package com.devteria.profile.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileRequestDto {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;
}
