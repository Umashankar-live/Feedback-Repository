package com.cg.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.beans.Employee;
import com.cg.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao eDao;

	@Override
	public Employee addEmployee(Employee e) {
		Employee employee = eDao.save(e);
		return employee;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		eDao.deleteById(empId);
		return true;
	}

	@Override
	public Employee checkRole(int empId) {
		Employee employee = eDao.findById(empId).get();
		return employee;
	}

	@Override
	public List<Employee> getAllParticipant() {
//		List<Employee> originalList = this.eDao.findAll();
//		List<Employee> participantList = new ArrayList<>();
//		for (int i = 0; i < originalList.size(); i++) {
//			if(originalList.get(i).getRole().equalsIgnoreCase("participant")) {
//			   participantList.add(originalList.get(i)); 
//			}
//		}
//		
//		return participantList ;
		
		return this.eDao.findAll().stream().filter(f->f.getRole().equalsIgnoreCase("participant")).collect(Collectors.toList());
	
		
	}

	@Override
	public List<Employee> getallEmployee() {
		return this.eDao.findAll();
	}

}
