package com.sqlproject.sample.repo;

import com.sqlproject.sample.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    @Query("SELECT e from Employee e join e.address a where a.pinCode = :pinCode ")
    List<Employee> findEmpByPinCode(@Param("pinCode") int pinCode);

}
