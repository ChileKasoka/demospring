package com.example.demo.repository;

import com.example.demo.dto.Demo;
import com.example.demo.repository.mapper.DemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DemoRepository {

    @Autowired
    private DemoMapper demoMapper;

    public List<Demo> findAll() {
        return demoMapper.findAll();
    }
}
