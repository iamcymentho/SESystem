package com.ilearn.springboot.Repository;

import com.ilearn.springboot.model.SoftwareEngineer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SoftwareEngineerRepository extends JpaRepository<SoftwareEngineer, Integer> {
        List<SoftwareEngineer> id(Integer id);
        //boolean existsByEmail(String email);
}
