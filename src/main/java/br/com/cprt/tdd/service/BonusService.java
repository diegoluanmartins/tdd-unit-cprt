package br.com.cprt.tdd.service;

import java.math.BigDecimal;

import br.com.cprt.tdd.model.Employee;

public class BonusService {

	public BigDecimal calculateBonus(Employee employee) {
		BigDecimal value = employee.getSalary().multiply(new BigDecimal("0.1"));
		if (value.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Employee with salary bigger than 10000 cannot receive bonus");
		}
		return value;
	}

}
