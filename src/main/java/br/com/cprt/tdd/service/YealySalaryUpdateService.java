package br.com.cprt.tdd.service;

import java.math.BigDecimal;

import br.com.cprt.tdd.model.Employee;
import br.com.cprt.tdd.model.EmployeePerformance;

public class YealySalaryUpdateService {

    public void updateSalary(Employee employee, EmployeePerformance performance) {
        BigDecimal percentualSalaryUpdate = performance.percentualSalaryUpdate();
        employee.updateSalaryByPercentual(percentualSalaryUpdate);
    }

}
