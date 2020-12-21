package com.myspringboot.helloworld.dao;

import com.myspringboot.helloworld.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class DepartmentDao {

    private static Map<Integer, Department> departments = null;

    // 模拟数据库数据 ，value就是数据库中的的一行数据
    static {
        departments = new HashMap<>() ;

        departments.put(101,new Department(101,"教学部"));
        departments.put(102,new Department(102,"市场部"));
        departments.put(103,new Department(103,"教研部"));
        departments.put(104,new Department(104,"运营部"));
        departments.put(105,new Department(105,"后勤部"));
    }

    // 获取所有部门信息
    public Collection<Department> selectAllDept(){
        return departments.values();
    }

    // 通过id获取部门信息
    public Department selectDeptById(Integer id){
        return departments.get(id);
    }

}
