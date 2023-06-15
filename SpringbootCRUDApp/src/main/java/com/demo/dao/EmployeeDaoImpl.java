package com.demo.dao;

import com.demo.model.Employee;
import com.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepoImpl;

    public Employee saveData(Employee employee) {
        return employeeRepoImpl.save(employee);
    }

    public Optional<Employee> getDataById(int empId){
        return employeeRepoImpl.findById(empId);
    }
    public List<Employee> getAllData() {
        return employeeRepoImpl.findAll();
    }

    public Employee updateData(Employee employee) {
        return employeeRepoImpl.save(employee);
    }

    public void deleteData(int empId) {
        employeeRepoImpl.deleteById(empId);
    }
}
