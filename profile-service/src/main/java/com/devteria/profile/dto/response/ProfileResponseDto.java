package com.devteria.profile.dto.response;

import lombok.*;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProfileResponseDto {
    private String id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String city;
}
