package oo.project_employee.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import oo.project_employee.pojo.Department;

public class DepartmentDao {
    // 模拟数据库
    private static Map<Integer, Department> departments = null;
    static {
        departments = new HashMap<Integer, Department>();

        departments.put(101, new Department(101, "D101"));
        departments.put(101, new Department(102, "D102"));
        departments.put(101, new Department(103, "D103"));
        departments.put(101, new Department(104, "D104"));
        departments.put(101, new Department(105, "D105"));
    }

    public Collection<Department> getDepartments() {
        return departments.values();
    }

    public Department getDepartmentById(Integer id) {
        return departments.get(id);
    }
}
