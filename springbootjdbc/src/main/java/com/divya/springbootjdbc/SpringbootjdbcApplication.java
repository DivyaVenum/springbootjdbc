package com.divya.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.divya.springbootjdbc.dao.DepartmentDao;


@SpringBootApplication
public class SpringbootjdbcApplication implements CommandLineRunner {

	@Autowired
	private DepartmentDao departmentDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootjdbcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		departmentDao.selectAllEmployee();
		
	}

}
