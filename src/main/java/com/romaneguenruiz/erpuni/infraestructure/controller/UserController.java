package com.romaneguenruiz.erpuni.infraestructure.controller;

import com.romaneguenruiz.erpuni.application.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping
    public UserDTO getUserById(Long id){
       return new UserDTO(id);
    }
}
