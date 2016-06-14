package com.fur.portal.view.bean.car;

import java.io.Serializable;

import java.util.Date;

public class MaintananceMinderBean implements Serializable{
    @SuppressWarnings("compatibility:1512813124125753140")
    private static final long serialVersionUID = 1L;
    public MaintananceMinderBean() {
        super();
    }
    public MaintananceMinderBean(String car,String dueOnDate,String colorFlag) {
        this.car= car;
        this.dueOnDate = dueOnDate;
        this.colorFlag = colorFlag;
    }
    
    private String car;
    private String dueOnDate;
    private String colorFlag;

    public void setCar(String car) {
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setDueOnDate(String dueOnDate) {
        this.dueOnDate = dueOnDate;
    }

    public String getDueOnDate() {
        return dueOnDate;
    }

    public void setColorFlag(String colorFlag) {
        this.colorFlag = colorFlag;
    }

    public String getColorFlag() {
        return colorFlag;
    }
}
