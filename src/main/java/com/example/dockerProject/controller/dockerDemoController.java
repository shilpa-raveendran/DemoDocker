package com.example.dockerProject.controller;

import com.example.dockerProject.entity.DemoEntity;
import com.example.dockerProject.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class dockerDemoController {

    @Autowired
    DemoService demoService;

    @GetMapping("/testApi")
    public String testMethod(){
        return "API Working";
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<DemoEntity>> getAll(){
        List<DemoEntity> demoEntityList=demoService.findAll();
        return new ResponseEntity<>(demoEntityList, HttpStatus.OK);
    }
    @PostMapping("/add")
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity demoEntity){
        DemoEntity resultEntity = demoService.save(demoEntity);
        return new ResponseEntity<>(resultEntity, HttpStatus.OK);
    }
}
