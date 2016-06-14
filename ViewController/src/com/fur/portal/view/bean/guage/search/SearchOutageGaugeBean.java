package com.fur.portal.view.bean.guage.search;

/* POJO used to load all the attributes to
 * Outage Gauge Table Section*/

public class SearchOutageGaugeBean {
    public SearchOutageGaugeBean() {
        super();
    }
    public SearchOutageGaugeBean(double inches, int usGallons) {
        super();
        this.inches = inches;
        this.usGallons = usGallons;
    
    }
    
    private double inches;
    private int usGallons;

    public void setInches(double inches) {
        this.inches = inches;
    }

    public double getInches() {
        return inches;
    }

    public void setUsGallons(int usGallons) {
        this.usGallons = usGallons;
    }

    public int getUsGallons() {
        return usGallons;
    }
}
