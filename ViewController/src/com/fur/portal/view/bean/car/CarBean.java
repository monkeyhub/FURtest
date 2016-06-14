package com.fur.portal.view.bean.car;

import java.io.Serializable;

import java.util.Date;

public class CarBean implements Serializable{
    @SuppressWarnings("compatibility:1512813124125753140")
    private static final long serialVersionUID = 1L;
    public CarBean() {
        super();
    }
    //CAR DERATILS includes Latest Siting info
    //List of RepairHistoryBean
    //MaintananceMinderBean
    
    public CarBean(int carID ,int initialCarNo, String status, int mileage) {
        this.carID= carID;
        this.initialCarNo = initialCarNo;
        this.status = status;
        this.mileage = mileage;
        
    }
    
    public CarBean(int carID ,int initialCarNo, String status, int mileage, String latitude, String longitude, 
                   double expenseInc, int numInactDays, Date conDate, String resensed) {
        this.carID= carID;
        this.initialCarNo = initialCarNo;
        this.status = status;
        this.mileage = mileage;
        this.longitude = longitude;
        this.latitude = latitude;
        this.expenseIncurred = expenseInc;
        this.numInactiveDays = numInactDays;
        this.contractDate = conDate;
        this.resensed = resensed;
    }
    
    private int carID;
    private int initialCarNo;
    private String status;
    private int mileage;
    private String longitude;

    public void setExpenseIncurred(double expenseIncurred) {
        this.expenseIncurred = expenseIncurred;
    }

    public double getExpenseIncurred() {
        return expenseIncurred;
    }

    public void setNumInactiveDays(int numInactiveDays) {
        this.numInactiveDays = numInactiveDays;
    }

    public int getNumInactiveDays() {
        return numInactiveDays;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setResensed(String resensed) {
        this.resensed = resensed;
    }

    public String getResensed() {
        return resensed;
    }
    private String latitude;
    private double expenseIncurred;
    private int numInactiveDays;
    private Date contractDate;
    private String resensed;

    public void setCarID(int carID) {
        this.carID = carID;
    }

    public int getCarID() {
        return carID;
    }

    public void setInitialCarNo(int initialCarNo) {
        this.initialCarNo = initialCarNo;
    }

    public int getInitialCarNo() {
        return initialCarNo;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }
    
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLatitude() {
        return latitude;
    }
}
