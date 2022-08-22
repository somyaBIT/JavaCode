package com.training.dao;

import java.util.List;

import com.training.Model.Department;

public interface DepartmentDao {
	
	void saveDepartment(Department department);
    
    List<Department> findAllDepartments();
     
    void deleteDepartmentById(Integer id);
    
    Department findById(Integer id);
     
    void updateDepartment(Department department);
	

}
