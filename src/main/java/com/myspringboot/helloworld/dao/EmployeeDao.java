package com.myspringboot.helloworld.dao;

import com.myspringboot.helloworld.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {

    @Autowired
    private DepartmentDao departmentDao;

    private static Map<Integer, Employee> employees = null;

    // 模拟数据库数据 ，value就是数据库中的的一行数据
    static {
        employees = new HashMap<>() ;

//        employees.put(101,new Employee(101,"教学部"));
//        employees.put(102,new Employee(102,"市场部"));
//        employees.put(103,new Employee(103,"教研部"));
//        employees.put(104,new Employee(104,"运营部"));
//        employees.put(105,new Employee(105,"后勤部"));
    }
}
