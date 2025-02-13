package org.example.sms3.repository;

import org.example.sms3.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    boolean existsByEmail(String email);

    List<Student> findByNameContainingIgnoreCase(String name);
}
