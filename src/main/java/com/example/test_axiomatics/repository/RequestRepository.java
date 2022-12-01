package com.example.test_axiomatics.repository;


import com.example.test_axiomatics.entity.Request;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
