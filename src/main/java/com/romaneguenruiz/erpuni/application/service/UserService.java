package com.romaneguenruiz.erpuni.application.service;

import com.romaneguenruiz.erpuni.application.dto.UserDTO;
import com.romaneguenruiz.erpuni.application.mapper.UserMapper;
import com.romaneguenruiz.erpuni.domain.entity.UserEntity;
import com.romaneguenruiz.erpuni.domain.repository.IUserRepository;
import com.romaneguenruiz.erpuni.util.PasswordUtil;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService implements IUserService {

    private final IUserRepository userRepository;

    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public UserDTO getUserById(Long id) {
        return UserMapper.toDTO(userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found")));
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        UserEntity userEntity = UserMapper.toEntity(userDTO);
        userEntity.setPassword(PasswordUtil.hashPassword(userDTO.password()));
        userRepository.save(userEntity);
        return UserMapper.toDTO(userEntity);
    }
}