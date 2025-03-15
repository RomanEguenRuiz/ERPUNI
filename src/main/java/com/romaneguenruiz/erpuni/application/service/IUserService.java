package com.romaneguenruiz.erpuni.application.service;

import com.romaneguenruiz.erpuni.application.dto.UserDTO;

public interface IUserService {
    UserDTO getUserById(Long id);
    UserDTO createUser(UserDTO userDTO);
}