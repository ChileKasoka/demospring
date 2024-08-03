package com.example.demo.service;

import com.example.demo.dto.Demo;
import com.example.demo.repository.DemoRepository;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class DemoService {

    @Autowired
    private DemoRepository demoRepository;

    public List<Demo> findAll() {
        return demoRepository.findAll();
    }

}
