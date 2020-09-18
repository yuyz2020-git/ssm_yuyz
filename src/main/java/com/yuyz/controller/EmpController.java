package com.yuyz.controller;

import com.yuyz.pojo.Emp;
import com.yuyz.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName EmpController
 * @Description TODO
 * @Author yuyz
 * @Date 2020/9/16 17:06
 * @Version 1.0
 */
@Controller
public class EmpController {
    @Autowired
    IEmpService empService;



    @RequestMapping("/test")
    public String test1(){
       // System.out.println("test1-----");
        //empService.test();
        List<Emp> emps = empService.selectAll();
        System.out.println(emps);
        return "emps";
    }

    @RequestMapping("/test2")
    @ResponseBody
    public List<Emp>  test2(){
        // System.out.println("test1-----");
        //empService.test();
        List<Emp> emps = empService.selectAll();
        System.out.println(emps);
        return emps;
    }
}
