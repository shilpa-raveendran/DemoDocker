package com.example.dockerProject.service;

import com.example.dockerProject.entity.DemoEntity;
import com.example.dockerProject.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DemoServiceImpl implements DemoService{

    private DemoRepo demoRepo;

    @Autowired
    public DemoServiceImpl(DemoRepo demoRepo){
        this.demoRepo=demoRepo;
    }
    @Override
    public List<DemoEntity> findAll() {
        return demoRepo.findAll();
    }

    @Override
    public DemoEntity save(DemoEntity demoEntity) {
       DemoEntity entity= demoRepo.save(demoEntity);
       return entity;
    }
}
