package com.example.dockerProject.service;

import com.example.dockerProject.entity.DemoEntity;

import java.util.List;


public interface DemoService {

    public List<DemoEntity> findAll();

    public DemoEntity save(DemoEntity demoEntity);

}
