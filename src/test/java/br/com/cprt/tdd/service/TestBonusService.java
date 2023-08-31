package br.com.cprt.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cprt.tdd.model.Employee;

public class TestBonusService {

    private BonusService bonusService;

    @BeforeEach
    void init(){
        this.bonusService = new BonusService();
    }

    @Test
    void bonusMustThrowExceptionForHighPaySalary() {
        assertThrows(IllegalArgumentException.class,
                () -> bonusService.calculateBonus(new Employee("Cprt", LocalDate.now(), new BigDecimal("10500"))));
    }

    @Test
    void bonusMustThrowExceptionForHighPaySalaryWithTryCatch() {
        try {
            bonusService.calculateBonus(new Employee("Cprt", LocalDate.now(), new BigDecimal("10500")));
            fail();
        } catch (Exception e) {
            assertTrue(true);
        }
    }

    @Test
    void bonusMustBe10PercentOfSalary() {
        BigDecimal bonusValue = bonusService
                .calculateBonus(new Employee("Cprt", LocalDate.now(), new BigDecimal("100")));
        assertEquals(BigDecimal.TEN, bonusValue.setScale(0));
    }

    @Test
    void bonusMustBeMaximumBonusValue() {
        BigDecimal bonusValue = bonusService
                .calculateBonus(new Employee("Cprt", LocalDate.now(), new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000"), bonusValue.setScale(0));
    }

}
