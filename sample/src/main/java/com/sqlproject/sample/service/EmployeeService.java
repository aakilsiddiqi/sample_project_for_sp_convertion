package com.sqlproject.sample.service;

import com.sqlproject.sample.dto.EmpDTO;
import com.sqlproject.sample.entity.Employee;
import com.sqlproject.sample.exception.EmployeeException;
import com.sqlproject.sample.repo.EmployeeRepo;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService{

    Integer addEmployee(EmpDTO empDTO) throws EmployeeException;

    List<Employee> getEmpFromPinCode(int pinCode);
}
