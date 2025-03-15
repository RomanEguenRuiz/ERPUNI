package com.romaneguenruiz.erpuni.application.mapper;

import com.romaneguenruiz.erpuni.application.dto.UserDTO;
import com.romaneguenruiz.erpuni.domain.entity.UserEntity;



public class UserMapper {

    public static UserDTO toDTO(UserEntity userEntity) {
        if (userEntity == null) {
            return null;
        }
        return new UserDTO(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getSurname(),
                userEntity.getEmail(),
                userEntity.getPassword(),
                userEntity.getNif(),
                userEntity.getPhone(),
                userEntity.getAddress()
        );
    }

    public static UserEntity toEntity(UserDTO userDTO) {
        if (userDTO == null) {
            return null;
        }
        return UserEntity.builder()
                .id(userDTO.Id())
                .name(userDTO.name())
                .surname(userDTO.surname())
                .email(userDTO.email())
                .password(userDTO.password())
                .nif(userDTO.NIF())
                .phone(userDTO.phone())
                .address(userDTO.address())
                .build();
    }

    // Prevent instantiation TODO: Check this criteria for utility classes
    private UserMapper() {
        throw new IllegalStateException("Utility class");
    }

}