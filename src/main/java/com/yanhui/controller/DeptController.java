package com.yanhui.controller;


import com.yanhui.pojo.Dept;
import com.yanhui.pojo.Result;
import com.yanhui.service.DeptService;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

//部门
@RestController
@RequestMapping("/depts")
public class DeptController {

    //查询
    private static Logger logger = Logger.getLogger(DeptController.class.getName());

    @Autowired
    private DeptService deptService;

    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方法GET
    @GetMapping
    public Result list(){
        logger.info("查询所有部门");
        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    //删除部门

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        logger.info("根据id删除部门" +  id);
        //调用service删除部门
        deptService.delete(id);
        return Result.success();
    }

    //添加部门
    @PostMapping
    public Result add(@RequestBody Dept dept) {
        logger.info("添加部门" + dept);
        deptService.insert(dept);
        return Result.success();
    }

    //修改部门
    @GetMapping("/{id}")
    public Result get(@PathVariable Integer id) {
        logger.info("查询部门" + id);
        Dept dept = deptService.get(id);
        return Result.success(dept);
    }
    @PutMapping
    public Result update(@RequestBody Dept dept) {
        logger.info("修改部门" + dept);
        deptService.update(dept);
        return Result.success();
    }
}
