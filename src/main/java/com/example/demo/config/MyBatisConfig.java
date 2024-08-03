package com.example.demo.config;

import com.example.demo.repository.mapper.DemoMapper;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyBatisConfig {

    private final SqlSessionFactory sqlSessionFactory;

    public MyBatisConfig(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Bean
    public MapperFactoryBean<DemoMapper> demoMapper() {
        MapperFactoryBean<DemoMapper> factoryBean = new MapperFactoryBean<>(DemoMapper.class);
        factoryBean.setSqlSessionFactory(sqlSessionFactory);
        return factoryBean;
    }
}

