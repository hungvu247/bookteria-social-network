package com.devteria.identity.repository.httpclient;

import com.devteria.identity.dto.request.ProfileCreateRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "profile-service", url = "http://localhost:8081")
public interface ProfileClient {

    @PostMapping(
            value = "/internal/user",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    Object createProfile(@RequestBody ProfileCreateRequest profileRequestDto);
}
