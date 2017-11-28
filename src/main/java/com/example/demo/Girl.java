package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by cjl on 2017/11/24.
 */
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;
    private String cupSize;
    private Integer age;

    public Girl(){
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

}
