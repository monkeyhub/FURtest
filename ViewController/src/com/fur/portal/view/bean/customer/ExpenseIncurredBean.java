package com.fur.portal.view.bean.customer;

import java.io.Serializable;

public class ExpenseIncurredBean implements Serializable{
    @SuppressWarnings("compatibility:1512813124125753140")
    private static final long serialVersionUID = 1L;
    public ExpenseIncurredBean() {
        super();
    }
    private String month;
    private Long expenseAmt;

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setExpenseAmt(Long expenseAmt) {
        this.expenseAmt = expenseAmt;
    }

    public Long getExpenseAmt() {
        return expenseAmt;
    }
}
