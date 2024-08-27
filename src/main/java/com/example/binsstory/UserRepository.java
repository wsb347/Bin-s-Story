package com.example.binsstory;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import com.example.binsstory.user;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<user, Long>, JpaSpecificationExecutor<user> {
    List<user> findAll();
}
