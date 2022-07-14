package com.divya.springbootjdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.divya.springbootjdbc.model.Department;
public class DepartmentRowMapper implements RowMapper<Department>
{

	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department department=new Department();
		int deptno=rs.getInt("deptno");
		String dname=rs.getString("dname");
		String loc=rs.getString("loc");
        department.setDeptno(deptno);
        department.setDname(dname);
        department.setLoc(loc);
		return department;
	}

}
