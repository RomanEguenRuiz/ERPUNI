package com.romaneguenruiz.erpuni.domain.repository;

import com.romaneguenruiz.erpuni.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
