package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Employee;
import com.cg.beans.Login;
import com.cg.dao.EmployeeDao;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private EmployeeDao eDao;

	@Override
	public Employee validate(Login login) {
		List<Employee> allEmployess = eDao.findAll();
		for (int i = 0; i < allEmployess.size(); i++) {
			if(allEmployess.get(i).getEmployeeName().equalsIgnoreCase(login.getName()) && 
					allEmployess.get(i).getPassword().equalsIgnoreCase(login.getPassword())) {
				return allEmployess.get(i);
			}
		}
		return null;
	}

}
