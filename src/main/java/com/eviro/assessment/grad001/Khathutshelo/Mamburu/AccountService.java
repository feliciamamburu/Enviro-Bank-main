package com.eviro.assessment.grad001.Khathutshelo.Mamburu;

import java.math.BigDecimal;

public interface AccountService {
    BigDecimal withdraw(String accountNum, BigDecimal amountToWithdraw);
}
