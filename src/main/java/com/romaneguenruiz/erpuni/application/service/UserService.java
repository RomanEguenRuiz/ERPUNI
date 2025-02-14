package com.romaneguenruiz.erpuni.application.service;

import com.romaneguenruiz.erpuni.application.dto.UserDTO;
import com.romaneguenruiz.erpuni.domain.entity.UserEntity;
import com.romaneguenruiz.erpuni.domain.repository.UserRepository;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;


    @Transactional(readOnly = true)
    public Optional<UserDTO> getUserById(Long id) {
        return Optional.of(new UserDTO(userRepository.findById(id).get().getId()));
    }
}