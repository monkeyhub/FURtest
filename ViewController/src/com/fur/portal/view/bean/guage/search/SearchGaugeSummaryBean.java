package com.fur.portal.view.bean.guage.search;

/* POJO used to load all the attributes to
 * Search Gauge Summary Section*/

public class SearchGaugeSummaryBean {
    public SearchGaugeSummaryBean() {
        super();
    }
    private int actualShellCap;
    private int lightWeight;
    private int totalWeightOnRail;
    private int shellFull;
    private int compartmentNumber;
    private String outage;

    public void setActualShellCap(int actualShellCap) {
        this.actualShellCap = actualShellCap;
    }

    public int getActualShellCap() {
        return actualShellCap;
    }

    public void setLightWeight(int lightWeight) {
        this.lightWeight = lightWeight;
    }

    public int getLightWeight() {
        return lightWeight;
    }

    public void setTotalWeightOnRail(int totalWeightOnRail) {
        this.totalWeightOnRail = totalWeightOnRail;
    }

    public int getTotalWeightOnRail() {
        return totalWeightOnRail;
    }

    public void setOutage(String outage) {
        this.outage = outage;
    }

    public String getOutage() {
        return outage;
    }

    public void setShellFull(int shellFull) {
        this.shellFull = shellFull;
    }

    public int getShellFull() {
        return shellFull;
    }

    public void setCompartmentNumber(int compartmentNumber) {
        this.compartmentNumber = compartmentNumber;
    }

    public int getCompartmentNumber() {
        return compartmentNumber;
    }
}
