package br.com.cprt.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cprt.tdd.model.Employee;
import br.com.cprt.tdd.model.EmployeePerformance;

public class TestYealySalaryUpdateService {
    
    private Employee employee;
    private YealySalaryUpdateService service;

    @BeforeEach
    void init(){
        employee = new Employee("Cprt", LocalDate.now(), new BigDecimal("1000"));
        service = new YealySalaryUpdateService();
    }

    @Test
    void employeeWithLowPerformance(){
        service.updateSalary(employee, EmployeePerformance.LOW);
        assertEquals(new BigDecimal("1030"), employee.getSalary().setScale(0));
    }

    @Test
    void employeeWithNormalPerformance(){
        service.updateSalary(employee, EmployeePerformance.NORMAL);
        assertEquals(new BigDecimal("1150"), employee.getSalary().setScale(0));
    }

    @Test
    void employeeWithGreatPerformance(){
        service.updateSalary(employee, EmployeePerformance.GREAT);
        assertEquals(new BigDecimal("1200"), employee.getSalary().setScale(0));
    }

}
