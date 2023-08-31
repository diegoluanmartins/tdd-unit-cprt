package br.com.cprt.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.cprt.tdd.model.Employee;

public class TestBonusService {

    @Test
    void bonusMustBeZeroForHighPaySalary(){
        BonusService bonusService = new BonusService();
        BigDecimal bonusValue = bonusService.calculateBonus(new Employee("Cprt", LocalDate.now(), new BigDecimal("10500")));
        assertEquals(BigDecimal.ZERO, bonusValue.setScale(0));
    }

    @Test
    void bonusMustBe10PercentOfSalary(){
        BonusService bonusService = new BonusService();
        BigDecimal bonusValue = bonusService.calculateBonus(new Employee("Cprt", LocalDate.now(), new BigDecimal("100")));
        assertEquals(BigDecimal.TEN, bonusValue.setScale(0));
    }

    @Test
    void bonusMustBeMaximumBonusValue(){
        BonusService bonusService = new BonusService();
        BigDecimal bonusValue = bonusService.calculateBonus(new Employee("Cprt", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000"), bonusValue.setScale(0));
    }

}
