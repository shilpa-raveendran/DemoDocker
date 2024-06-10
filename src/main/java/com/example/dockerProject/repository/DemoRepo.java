package com.example.dockerProject.repository;

import com.example.dockerProject.entity.DemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepo  extends JpaRepository<DemoEntity, Integer> {
}
