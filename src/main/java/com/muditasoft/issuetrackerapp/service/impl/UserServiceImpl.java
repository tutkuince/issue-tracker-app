package com.muditasoft.issuetrackerapp.service.impl;

import com.muditasoft.issuetrackerapp.dto.UserDto;
import com.muditasoft.issuetrackerapp.service.UserService;
import com.muditasoft.issuetrackerapp.util.TPage;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserDto save(UserDto userDto) {
        return null;
    }

    @Override
    public UserDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<UserDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public UserDto getByUsername(String username) {
        return null;
    }
}
