package com.fur.portal.view.bean.customer;

import com.fur.portal.view.bean.car.CarBean;
import com.fur.portal.view.bean.guage.search.SearchOutageGaugeBean;
import com.fur.portal.view.bean.car.MaintananceMinderBean;
import com.fur.portal.view.bean.car.RepairHistoryBean;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerBean implements Serializable{
    @SuppressWarnings("compatibility:1512813124125753140")
    private static final long serialVersionUID = 1L;
    public CustomerBean() {
        super();
    }
    //List of MaintananceMinderBean
    //Instance of ExpenseIncurredBean
    // List of CarBean
    
    private List<MaintananceMinderBean> maintananceMinderBean;
    private List<CarBean> carBean;
    private List<RepairHistoryBean> repairHistoryBean;

    public void setMaintananceMinderBean(List<MaintananceMinderBean> maintananceMinderBean) {
        this.maintananceMinderBean = maintananceMinderBean;
    }

    public List<MaintananceMinderBean> getMaintananceMinderBean() {       
        return maintananceMinderBean;
    }
    
    public List<CarBean> getCarBean() {        
        return carBean;        
    }

    public void setCarBean(List<CarBean> carBean) {
        this.carBean = carBean;
    }

    public void setRepairHistoryBean(List<RepairHistoryBean> repairHistoryBean) {
        this.repairHistoryBean = repairHistoryBean;
    }

    public List<RepairHistoryBean> getRepairHistoryBean() {               
        return repairHistoryBean;
    }
}
