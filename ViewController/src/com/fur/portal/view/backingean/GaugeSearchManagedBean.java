package com.fur.portal.view.backingean;

import com.fur.portal.view.bean.guage.search.SearchGaugeResultBean;
import com.fur.portal.view.bean.guage.search.SearchOutageGaugeBean;
import com.fur.portal.view.util.FURAppUtil;

import java.util.List;

import javax.faces.event.ActionEvent;


import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.context.AdfFacesContext;

public class GaugeSearchManagedBean {
    private String inputGaugeValue;
    private RichTable outageTableBinding;

    //TODO replace Hardcoded values
    //Start
    private String socUCMValue = "us";
    private String rb1Value = "inches";
    private String rb2Value = "usGallons";
    private String socCompartmentValue = "1";
    private static final String searchString = "PPRX029362";
    //End

    private SearchGaugeResultBean sgrbInstance = FURAppUtil.getSearchGaugeResultBean();
    private boolean showOutageTable = false;
    private int actualShellCap;
    private int lightWeight;
    private int totalWeightOnRail;
    private String outage;
    private int shellFull;
    private int compartmentNumber;
    private List<SearchOutageGaugeBean> outageTableModel;

    public GaugeSearchManagedBean() {
        super();
    }

    public String searchAction() {

        if (searchString.equalsIgnoreCase(getInputGaugeValue())) {
            setShowOutageTable(true);
            return null;
        }
        setShowOutageTable(false);
        return "noItems";
    }
    
    public String clearAction() {
        setInputGaugeValue(null);
        setShowOutageTable(false);
        return null;
    }

    public void setLightWeight(int lightWeight) {
        this.lightWeight = lightWeight;
    }

    public int getLightWeight() {
        return sgrbInstance.getSearchGuageInstance().getLightWeight();
    }

    public void setTotalWeightOnRail(int totalWeightOnRail) {
        this.totalWeightOnRail = totalWeightOnRail;
    }

    public int getTotalWeightOnRail() {
        return sgrbInstance.getSearchGuageInstance().getTotalWeightOnRail();
    }

    public void setOutage(String outage) {
        this.outage = outage;
    }

    public String getOutage() {
        return sgrbInstance.getSearchGuageInstance().getOutage();
    }

    public void setShellFull(int shellFull) {
        this.shellFull = shellFull;
    }

    public int getShellFull() {
        return sgrbInstance.getSearchGuageInstance().getShellFull();
    }

    public void setCompartmentNumber(int compartmentNumber) {
        this.compartmentNumber = compartmentNumber;
    }

    public int getCompartmentNumber() {
        return sgrbInstance.getSearchGuageInstance().getCompartmentNumber();
    }

    public void setActualShellCap(int actualShellCap) {
        this.actualShellCap = actualShellCap;
    }

    public int getActualShellCap() {
        return sgrbInstance.getSearchGuageInstance().getActualShellCap();
    }

    public void setOutageTableModel(List<SearchOutageGaugeBean> outageTableModel) {
        this.outageTableModel = outageTableModel;
    }

    public List<SearchOutageGaugeBean> getOutageTableModel() {
        return sgrbInstance.getSearchOutageList();
    }

    public void setInputGaugeValue(String inputGaugeValue) {
        this.inputGaugeValue = inputGaugeValue;
    }

    public String getInputGaugeValue() {
        return inputGaugeValue;
    }

    public void setShowOutageTable(boolean showOutageTable) {
        this.showOutageTable = showOutageTable;
    }

    public boolean isShowOutageTable() {
        return showOutageTable;
    }

    public void setOutageTableBinding(RichTable outageTableBinding) {
        this.outageTableBinding = outageTableBinding;
    }

    public RichTable getOutageTableBinding() {
        return outageTableBinding;
    }

    public void setSocUCMValue(String socUCMValue) {
        this.socUCMValue = socUCMValue;
    }

    public String getSocUCMValue() {
        return socUCMValue;
    }

    public void setRb1Value(String rb1Value) {
        this.rb1Value = rb1Value;
    }

    public String getRb1Value() {
        return rb1Value;
    }

    public void setRb2Value(String rb2Value) {
        this.rb2Value = rb2Value;
    }

    public String getRb2Value() {
        return rb2Value;
    }

    public void setSocCompartmentValue(String socCompartmentValue) {
        this.socCompartmentValue = socCompartmentValue;
    }

    public String getSocCompartmentValue() {
        return socCompartmentValue;
    }

//    public void searchAction(ActionEvent actionEvent) {
//        
//        if (searchString.equalsIgnoreCase(getInputGaugeValue())) {
//            setShowOutageTable(true);
//        }
//        setShowOutageTable(false);
//    }
//
//    public void clearAction(ActionEvent actionEvent) {
//        setInputGaugeValue(null);
//        setShowOutageTable(false);
//    }
}
