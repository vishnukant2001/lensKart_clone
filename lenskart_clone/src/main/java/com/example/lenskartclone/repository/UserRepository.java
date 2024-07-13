package com.example.lenskartclone.repository;

import com.example.lenskartclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
