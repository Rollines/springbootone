package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cjl on 2017/11/27.
 */
@RestController
public class GirlController {

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    //    查询女生所有列表
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlRepository.findAll();
    }

    /**
     * 添加一个女生
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girls")
    public Girl girlAdd(@RequestParam("cupSize") String cupSize,
                          @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setCupSize(cupSize);
        girl.setAge(age);
         return  girlRepository.save(girl);
    }

    /**
     * 查询一个女生
     * @param id
     * @return
     */
    @GetMapping(value = "/girl/{id}")
    public Girl girlFindOne(@PathVariable("id") Integer id){
        return girlRepository.findOne(id);
    }

    /**
     * 更新一个对象
     * @param id
     * @param cupSize
     * @param age
     * @return
     */
    @PostMapping(value = "/girl/{id}")
    public Girl girlUpdate(@PathVariable("id") Integer id,
                            @RequestParam("cupSize") String cupSize,
                           @RequestParam("age") Integer age){
        Girl girl = new Girl();
        girl.setId(id);
        girl.setCupSize(cupSize);
        girl.setAge(age);
        return girlRepository.save(girl);
    }

    /**
     * 删除一个好友
     * @param id
     */
    @DeleteMapping(value = "/girl/{id}")
    public void girlDelete(@PathVariable("id") Integer id){
        girlRepository.delete(id);
    }

    /**
     * 通过年龄来查询信息列表
     * @param age
     * @return
     */
    @GetMapping(value = "/girls/age/{age}")
    public List<Girl> girlListByAge(@PathVariable("age") Integer age){
        return girlRepository.findByAge(age);
    }

    /**
     * 插入二条数据
     */
    @PostMapping(value = "/girl/two")
    public void girlTwo(){
        girlService.insertTwo();
    }
}
