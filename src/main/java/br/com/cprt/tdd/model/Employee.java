package br.com.cprt.tdd.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

	private String name;
	private LocalDate admissionDate;
	private BigDecimal salary;

	public Employee(String name, LocalDate admissionDate, BigDecimal salary) {
		this.name = name;
		this.admissionDate = admissionDate;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

    public void updateSalaryByPercentual(BigDecimal percentualSalaryUpdate) {
		this.salary = this.salary.multiply(BigDecimal.ONE.add(percentualSalaryUpdate));
    }

}
