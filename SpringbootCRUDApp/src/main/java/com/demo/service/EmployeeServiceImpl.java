package com.demo.service;

import com.demo.dao.EmployeeDaoImpl;
import com.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public Employee saveData(Employee employee) {
        return employeeDao.saveData(employee);
    }

    public Optional<Employee> getDataById(int empId){
        return employeeDao.getDataById(empId);
    }
    public List<Employee> getAllData() {
        return employeeDao.getAllData();
    }

    public Employee updateData(Employee employee) {
        return employeeDao.updateData(employee);
    }

    public void deleteData(int empId) {
        employeeDao.deleteData(empId);
    }
}
