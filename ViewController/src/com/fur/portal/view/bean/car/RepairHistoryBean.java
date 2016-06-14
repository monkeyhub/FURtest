package com.fur.portal.view.bean.car;

import java.io.Serializable;

public class RepairHistoryBean implements Serializable{
    @SuppressWarnings("compatibility:1512813124125753140")
    private static final long serialVersionUID = 1L;
    public RepairHistoryBean() {
        super();
    }
    private String year;
    private Long repairAmt;
}
