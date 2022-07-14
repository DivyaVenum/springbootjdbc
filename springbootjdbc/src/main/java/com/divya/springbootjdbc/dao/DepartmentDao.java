package com.divya.springbootjdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.divya.springbootjdbc.rowmapper.DepartmentRowMapper;
import com.divya.springbootjdbc.model.*;
@Repository //class means where we create dao logics
public class DepartmentDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void selectAllEmployee()
	{
		List<Department> deptList=jdbcTemplate.query("select * from dept",new DepartmentRowMapper());
		for(Department department:deptList)
		{
			System.out.println(department.getDeptno()+" "+department.getDname()+" "+department.getLoc());
		}
	}
	

}
