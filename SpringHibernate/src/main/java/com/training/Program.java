package com.training;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.training.Model.Department;
import com.training.service.DepartmentService;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DepartmentService service =(DepartmentService)context.getBean("departmentService");
        Department d = new Department();
        d.setId(120);
        d.setDept_name("dept_10");
        d.setLocation("chennai");
        service.saveDepartment(d);
         List<Department>departmentList=service.findAllDepartments();
        for(Department department : departmentList)
        {
        	System.out.println(department);
        }
	}

}

