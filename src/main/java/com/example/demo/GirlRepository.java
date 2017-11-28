package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by cjl on 2017/11/27.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer>{
    public List<Girl> findByAge(Integer age);
}
