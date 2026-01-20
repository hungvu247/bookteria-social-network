package com.devteria.profile.controller;

import com.devteria.profile.dto.request.ProfileRequestDto;
import com.devteria.profile.dto.response.ProfileResponseDto;
import com.devteria.profile.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RestController
public class InternalUserProfileController {
    private UserProfileService userService;

    @PostMapping("/internal/user")
    public ProfileResponseDto createProfile(@RequestBody ProfileRequestDto profileRequestDto) {
        return userService.createProfile(profileRequestDto);

    }

}
