package com.muditasoft.issuetrackerapp.service;

import com.muditasoft.issuetrackerapp.dto.UserDto;
import com.muditasoft.issuetrackerapp.util.TPage;
import org.springframework.data.domain.Pageable;

public interface UserService {
    UserDto save(UserDto userDto);

    UserDto getById(Long id);

    TPage<UserDto> getAllPageable(Pageable pageable);

    UserDto getByUsername(String username);
}
