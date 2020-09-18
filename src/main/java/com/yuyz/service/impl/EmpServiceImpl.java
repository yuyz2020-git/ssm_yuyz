package com.yuyz.service.impl;

import com.yuyz.mapper.EmpMapper;
import com.yuyz.pojo.Emp;
import com.yuyz.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName EmpServiceImpl
 * @Description TODO
 * @Author yuyz
 * @Date 2020/9/16 17:41
 * @Version 1.0
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    EmpMapper empMapper;
    @Override
    public void test() {
        System.out.println("test");
    }

    @Override
    public List<Emp> selectAll() {
        return empMapper.selectAll();
    }
}
