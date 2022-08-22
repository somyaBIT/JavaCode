package com.training.service;

import java.util.List;

import com.training.Model.Department;

public interface DepartmentService {

	void saveDepartment(Department department);

	List<Department> findAllDepartments();

	void deleteDepartmentById(Integer id);

	Department findById(Integer id);

	void updateDepartment(Department department);

}
