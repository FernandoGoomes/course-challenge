package com.projeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.course.entities.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    
}
