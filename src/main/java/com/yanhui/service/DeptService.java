package com.yanhui.service;

import com.yanhui.pojo.Dept;

import java.util.List;

//部门
public interface DeptService {

    //查询全部部门信息
    List<Dept> list();

    void delete(Integer id);

    void insert(Dept dept);

    Dept get(Integer id);

    void update(Dept dept);

}
