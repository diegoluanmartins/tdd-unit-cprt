package br.com.cprt.tdd.model;

import java.math.BigDecimal;

public enum EmployeePerformance {

    LOW {
        @Override
        public BigDecimal percentualSalaryUpdate() {
            return new BigDecimal("0.03");
        }
    }, NORMAL {
        @Override
        public BigDecimal percentualSalaryUpdate() {
            return new BigDecimal("0.15");
        }
    }, GREAT {
        @Override
        public BigDecimal percentualSalaryUpdate() {
            return new BigDecimal("0.2");
        }
    };

    public abstract BigDecimal percentualSalaryUpdate();

}
