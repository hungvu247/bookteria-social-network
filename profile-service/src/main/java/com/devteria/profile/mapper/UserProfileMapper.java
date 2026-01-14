package com.devteria.profile.mapper;

import com.devteria.profile.dto.request.ProfileRequestDto;
import com.devteria.profile.dto.response.ProfileResponseDto;
import com.devteria.profile.entity.UserProfile;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    UserProfile toUserProfile(ProfileRequestDto profileRequestDto);
    ProfileResponseDto toProfileResponseDto(UserProfile entity);
}
