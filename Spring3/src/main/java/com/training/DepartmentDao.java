package com.training;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

public class DepartmentDao {
	
private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public int saveDepartment(Department d){  
		//    String query="insert into department values('"+e.getId()+"','"+e.getDept_name()+"','"+e.getLocation()+"')";  
		    String query="insert into postgres.public.\"Department\" values('"+d.getId()+"','"+
		    		d.getDept_name()+"','"+d.getLocation()+"')";  

			return jdbcTemplate.update(query);  
		}
	public int updateDepartment(Department d)
	{
		 String query="update postgres.public.\"Department\" set Dept_name='" +d.getDept_name()+"',location='"+d.getLocation()+"' where id ='"+d.getId()+"'";
		    		;  

			return jdbcTemplate.update(query);  
		
	}
	
	public int DeleteDepartment(Department d)
	{
		 String query="delete from postgres.public.\"Department\"where id ='"+d.getId()+"'";
		    		

			return jdbcTemplate.update(query);  
		
	}
	public List<Department> getAllDepartments(){  
		 return jdbcTemplate.query("select * from \"Department\"",
				 new ResultSetExtractor<List<Department>>(){  
		     public List<Department> extractData(ResultSet rs) throws SQLException,DataAccessException 
		     {  
		      
		        List<Department> list=new ArrayList<Department>();  
		        while(rs.next()){  
		        Department d=new Department();  
		        d.setId(rs.getInt(1));  
		        d.setDept_name(rs.getString(2));
                 d.setLocation(rs.getString(3));
		        list.add(d);  
		        }  
		        return list;  
		        }  
		    });  
		  }
}
