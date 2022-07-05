package com.back_crud.crud.repository;

import com.back_crud.crud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
