package com.sqlproject.sample.controller;

import com.sqlproject.sample.dto.EmpDTO;
import com.sqlproject.sample.entity.Employee;
import com.sqlproject.sample.exception.EmployeeException;
import com.sqlproject.sample.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/base")
public class Controller {

    @Autowired
    private EmployeeService employeeService;

    //post
    @PostMapping(value = "/addEmp")
    public ResponseEntity<String> postDataToDB(@RequestBody EmpDTO empDTO) throws EmployeeException {

        int employeeId = employeeService.addEmployee(empDTO);
        String successMessage = "New Employee created !! with EMP ID : " + employeeId;
        return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
    }

    //update

    //get
    @GetMapping(value = "/byPinCode/{pinCode}")
    public List<Employee> getCustomerFromPinCode(@PathVariable int pinCode){
        return employeeService.getEmpFromPinCode(pinCode);
    }

    //delete

    //
}
