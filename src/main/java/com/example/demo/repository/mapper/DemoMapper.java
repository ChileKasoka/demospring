package com.example.demo.repository.mapper;

import com.example.demo.dto.Demo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DemoMapper {
    List<Demo> findAll();
}
