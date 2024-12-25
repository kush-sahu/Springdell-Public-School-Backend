package com.codewitharjun.fullstack_backend.repository;

import com.codewitharjun.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
