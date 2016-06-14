package com.fur.portal.view.util;

import com.fur.portal.view.bean.car.CarBean;
import com.fur.portal.view.bean.car.MaintananceMinderBean;
import com.fur.portal.view.bean.customer.CustomerBean;
import com.fur.portal.view.bean.guage.search.SearchGaugeResultBean;

import com.fur.portal.view.bean.guage.search.SearchGaugeSummaryBean;
import com.fur.portal.view.bean.guage.search.SearchOutageGaugeBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FURAppUtil {
    public FURAppUtil() {
        super();
    }
    
    private static final double randomDouble1 =0.25;
    private static final double randomDouble2 =0.50;
    private static final double randomDouble3 =0.75;
    private static final int randomInt1 =23;
    private static final int randomInt2 =48;
    private static final int randomInt3 =74;
    private static final int comaprtmentNumber =1;
    private static final int actualShellCap =25761;
    private static final int lightWeight =77800;
    private static final int totalWeightOnRail =263000;
    private static final String outage ="515 gallons at 4.25 Inches";
    private static final int shellFull =25761;
    
    private static CustomerBean customerBean = initializeCustomerBean();
    private static SearchGaugeResultBean searchGaugeResultBean = initializeSearchGaugeResultBean();

    private static SearchGaugeResultBean initializeSearchGaugeResultBean() {
        SearchGaugeResultBean SearchGaugeResultBean = new SearchGaugeResultBean();;
        return SearchGaugeResultBean;
    }

    private static CustomerBean initializeCustomerBean() {
        CustomerBean customer = new CustomerBean();
        
        List<MaintananceMinderBean> maintananceMinderList = new ArrayList<MaintananceMinderBean>();
        maintananceMinderList.add(new MaintananceMinderBean("1234", "due on 5/6/2016", "3 months left"));
        maintananceMinderList.add(new MaintananceMinderBean("1235", "due on 2/6/2016", "25 days left"));
        maintananceMinderList.add(new MaintananceMinderBean("1236", "due on 1/6/2016", "overdue"));
        maintananceMinderList.add(new MaintananceMinderBean("1237", "due on 2/6/2016", "2 days left"));
        maintananceMinderList.add(new MaintananceMinderBean("1238", "due on 9/6/2016", "100 days left"));
        customer.setMaintananceMinderBean(maintananceMinderList);
        
        List<CarBean> carBeanList = new ArrayList<CarBean>();
        carBeanList.add(new CarBean(1234,23423345,"Active",123125, "37.39496", "-107.04941", 0.00, 2, new Date(), "Y"));
        carBeanList.add(new CarBean(1235,245,"Inactive",12125, "30.05807", "-97.42539", 12335.00, 31, new Date(), "N"));
        carBeanList.add(new CarBean(1236,2345,"Active",123125, "32.83197", "-96.76621", 2150.00, 0, new Date(), "Y"));
        carBeanList.add(new CarBean(1237,23113345,"Under Maintenance",123125, "41.95819", "-83.58261", 6523.00, 3, new Date(), "Y"));
        carBeanList.add(new CarBean(1238,23345,"Active",123125, "41.87359", "-87.62921", 365.00, 0, new Date(), "N"));
        
        customer.setCarBean(carBeanList);
        return customer;
    }


    public static CustomerBean getCustomerBean() {
        return customerBean;
    }

    public static CarBean getCarBean(int carId) {

        CarBean carBean = null;
        for (int i = 0; i < 5; i++) {
            if (carId == customerBean.getCarBean().get(i).getCarID()) {
                carBean = getCustomerBean().getCarBean().get(i);
            }
        }
        return carBean;
    }

    public static SearchGaugeResultBean getSearchGaugeResultBean() {
        return searchGaugeResultBean;
    }
}
