package com.devteria.profile.service;

import com.devteria.profile.dto.request.ProfileRequestDto;
import com.devteria.profile.dto.response.ProfileResponseDto;
import com.devteria.profile.entity.UserProfile;
import com.devteria.profile.mapper.UserProfileMapper;
import com.devteria.profile.repository.UserProfileRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Service
public class UserProfileService {
    private UserProfileRepository userProfileRepository;
    private UserProfileMapper userProfileMapper;

    public ProfileResponseDto createProfile(ProfileRequestDto profileRequestDto) {
        UserProfile userProfile = userProfileMapper.toUserProfile(profileRequestDto);
        userProfile = userProfileRepository.save(userProfile);
        return userProfileMapper.toProfileResponseDto(userProfile);
    }

    public ProfileResponseDto updateProfile(ProfileRequestDto profileRequestDto) {
        UserProfile userProfile = userProfileMapper.toUserProfile(profileRequestDto);
        return userProfileMapper.toProfileResponseDto(userProfileRepository.save(userProfile));
    }

    public ProfileResponseDto getProfile(String id) {
        UserProfile userProfile = userProfileRepository.findById(id).orElseThrow(() -> new RuntimeException("UserProfile not found"));
        return userProfileMapper.toProfileResponseDto(userProfile);
    }

}
