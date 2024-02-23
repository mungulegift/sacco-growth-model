package com.sacco.growth.model.saccoGrowthmodel.service;

import com.sacco.growth.model.saccoGrowthmodel.dto.UserDto;
import com.sacco.growth.model.saccoGrowthmodel.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(String email);

    List<UserDto> findAllUsers();
}