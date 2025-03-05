package com.sqlproject.sample.service.serviceImpl;

import com.sqlproject.sample.dto.EmpDTO;
import com.sqlproject.sample.dto.ProjectDTO;
import com.sqlproject.sample.entity.Employee;
import com.sqlproject.sample.entity.Project;
import com.sqlproject.sample.exception.EmployeeException;
import com.sqlproject.sample.repo.EmployeeRepo;
import com.sqlproject.sample.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Integer addEmployee(EmpDTO empDTO) throws EmployeeException {
        Optional<Employee> empExists = employeeRepo.findById(empDTO.getEmpId());

        if (empExists.isPresent()){
            throw new EmployeeException("Employee Already Exists !!!!!");
        }

        Employee employee = new Employee();
        employee.setEmpName(empDTO.getEmpName());
        employee.setAddress(empDTO.getAddress());
        employee.setEmail(empDTO.getEmail());
        employee.setMobileNo(empDTO.getMobileNo());
        employee.setEmpId(empDTO.getEmpId());
        employee.setDepartment(empDTO.getDepartment());
        employee.setSalary(empDTO.getSalary());
        employee.setProjects(empDTO.getProjects());
        employeeRepo.save(employee);

        return employee.getEmpId();
    }

    @Override
    public List<Employee> getEmpFromPinCode(int pinCode) {
        return employeeRepo.findEmpByPinCode(pinCode);
    }
}
