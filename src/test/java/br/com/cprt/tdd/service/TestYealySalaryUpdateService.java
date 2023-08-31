package br.com.cprt.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.cprt.tdd.model.Employee;
import br.com.cprt.tdd.model.EmployeePerformance;

public class TestYealySalaryUpdateService {
    
    @Test
    void employeeWithLowPerformance(){
        YealySalaryUpdateService service = new YealySalaryUpdateService();
        Employee employee = new Employee("Cprt", LocalDate.now(), new BigDecimal("1000"));
        service.updateSalary(employee, EmployeePerformance.LOW);
        assertEquals(new BigDecimal("1030"), employee.getSalary().setScale(0));
    }

    @Test
    void employeeWithNormalPerformance(){
        YealySalaryUpdateService service = new YealySalaryUpdateService();
        Employee employee = new Employee("Cprt", LocalDate.now(), new BigDecimal("1000"));
        service.updateSalary(employee, EmployeePerformance.NORMAL);
        assertEquals(new BigDecimal("1150"), employee.getSalary().setScale(0));
    }

    @Test
    void employeeWithGreatPerformance(){
        YealySalaryUpdateService service = new YealySalaryUpdateService();
        Employee employee = new Employee("Cprt", LocalDate.now(), new BigDecimal("1000"));
        service.updateSalary(employee, EmployeePerformance.GREAT);
        assertEquals(new BigDecimal("1200"), employee.getSalary().setScale(0));
    }

}
