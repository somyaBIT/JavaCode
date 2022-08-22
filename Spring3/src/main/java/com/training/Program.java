package com.training;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		DepartmentDao ddao =(DepartmentDao) context.getBean("ddao");
		Department dep = new Department();
//		for save data......................
//		dep.setId(201);
//		dep.setDept_name("software");
//		dep.setLocation("bangalore");
//		int status =ddao.saveDepartment(dep);
//         System.out.println(status);
		
//		for update...........................................................
//        int status1=ddao.updateDepartment(new Department(201,"seniorSoftware","Bangalore"));
//        System.out.println(status1);
//		for delete.......................................................
//		dep.setId(0);
//		int status3 = ddao.DeleteDepartment(dep);
//		System.out.println(status3);
//		DEptDao.................................................................
		DeptDao dept =(DeptDao) context.getBean("deptdao");
		Department dep1 = new Department();
		dep1.setId(202);
		dep1.setDept_name("software");
		dep1.setLocation("bangalore");
		dept.save(dep1);
//		getelement...........................................................................
		List<Department> list=ddao.getAllDepartments();
		for(Department d: list)
		{
			System.out.println(d);
		}

		
	}
	
}
