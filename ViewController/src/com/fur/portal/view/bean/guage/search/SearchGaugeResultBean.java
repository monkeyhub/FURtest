package com.fur.portal.view.bean.guage.search;

import java.util.ArrayList;
import java.util.List;

/* Class used to populate Search Gauge Summary and 
 * Outage Gauge Table data */

public class SearchGaugeResultBean {
    public SearchGaugeResultBean() {
        super();
    }
    
    // TODO Replace Hardcoded Values
    //Start
    private final double randomDouble1 =0.25;
    private final double randomDouble2 =0.50;
    private final double randomDouble3 =0.75;
    private final int randomInt1 =23;
    private final int randomInt2 =48;
    private final int randomInt3 =74;
    private final int comaprtmentNumber =1;
    private final int actualShellCap =25761;
    private final int lightWeight =77800;
    private final int totalWeightOnRail =263000;
    private final String outage ="515 gallons at 4.25 Inches";
    private final int shellFull =25761;
    //End
    
    

    public List<SearchOutageGaugeBean> getSearchOutageList() {
        List<SearchOutageGaugeBean> searchOutageList = new ArrayList<SearchOutageGaugeBean>();
        
        // Adding repeat data
        for(int i=0; i<=5 ; i++){
        searchOutageList.add(new SearchOutageGaugeBean(randomDouble1,randomInt1) );
        searchOutageList.add(new SearchOutageGaugeBean(randomDouble2,randomInt2) );
        searchOutageList.add(new SearchOutageGaugeBean(randomDouble3,randomInt3) );
        }
        
        return searchOutageList;
    }

    public SearchGaugeSummaryBean getSearchGuageInstance() {
        SearchGaugeSummaryBean searchGuageInstance = new SearchGaugeSummaryBean();
        
        searchGuageInstance.setCompartmentNumber(comaprtmentNumber);
        searchGuageInstance.setActualShellCap(actualShellCap);
        searchGuageInstance.setLightWeight(lightWeight);
        searchGuageInstance.setTotalWeightOnRail(totalWeightOnRail);
        searchGuageInstance.setOutage(outage);
        searchGuageInstance.setShellFull(shellFull);
        
        return searchGuageInstance;
    }
}
