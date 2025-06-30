package com.adelinoDev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adelinoDev.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
