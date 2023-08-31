package br.com.cprt.tdd.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Employee {

	private static final int SALARY_ROUND_SCALE = 2;
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
		roundSalary();
    }

	private void roundSalary() {
		this.salary = this.salary.setScale(SALARY_ROUND_SCALE, RoundingMode.HALF_UP);
	}

}
