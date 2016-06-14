package com.fur.portal.view.backingean;

import com.fur.portal.view.bean.car.CarBean;
import com.fur.portal.view.bean.car.MaintananceMinderBean;
import com.fur.portal.view.bean.customer.CustomerBean;
import com.fur.portal.view.bean.invoice.InvoiceBean;
import com.fur.portal.view.util.FURAppUtil;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


import javax.faces.event.ActionEvent;

import oracle.adf.view.faces.bi.model.GraphDataModel;
import oracle.adf.view.rich.component.rich.data.RichListView;

import oracle.adf.view.rich.context.AdfFacesContext;

import org.apache.myfaces.trinidad.event.SelectionEvent;
import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;

public class CustomerManagedBean implements Serializable {
    @SuppressWarnings("compatibility:1512813124125753140")
    private static final long serialVersionUID = 1L;

    public CustomerManagedBean() {
        super();
    }

    private CustomerBean customerInstance = FURAppUtil.getCustomerBean();
    private List<Object[]> repairHistoryList;
    private List<Object[]> expenseIncurredList;
    private String visisbleText = null;
    private List<Object[]> invoiceList;
    private List<InvoiceBean> allInvoices = new ArrayList<InvoiceBean>();
    private List<InvoiceBean> openInvoices = new ArrayList<InvoiceBean>();

    public List<MaintananceMinderBean> getMaintenanceMinder() {
        AdfFacesContext.getCurrentInstance().getPageFlowScope().put("maintenanceBean",
                                                                    customerInstance.getMaintananceMinderBean());
        return customerInstance.getMaintananceMinderBean();
    }

    public List<CarBean> getCarBean() {
        return customerInstance.getCarBean();
    }

    public void carDetails(SelectionEvent selectionEvent) {

        RichListView richView = (RichListView) selectionEvent.getComponent();
        List<CarBean> rowList = (List<CarBean>) richView.getValue();
        RowKeySet selectedRow = richView.getSelectedRowKeys();
        if (selectedRow != null && selectedRow.size() > 0) {
            Integer selectedRowIndex = (Integer) selectedRow.toArray()[0];
            CarBean carBean = rowList.get(selectedRowIndex);
            AdfFacesContext.getCurrentInstance().getPageFlowScope().put("carBean", carBean);
        }

        FacesContext context = FacesContext.getCurrentInstance();
        context.getApplication().getNavigationHandler().handleNavigation(context, null, "carDetails");
    }

    public void setRepairHistoryList(List<Object[]> repairHistoryList) {
        this.repairHistoryList = repairHistoryList;
    }

    public List<Object[]> getRepairHistoryList() {
        if (repairHistoryList == null) {
            repairHistoryList = new ArrayList<Object[]>();
            Object[] obj2 = { "2011", "< 10K", 7500.0 };
            Object[] obj3 = { "2012", "10K-20K", 19000.0 };
            Object[] obj4 = { "2013", "> 20K", 25500.0 };
            Object[] obj5 = { "2014", "< 10K", 9600.0 };
            Object[] obj6 = { "2015", "10K-20K", 16000.0 };
            repairHistoryList.add(obj2);
            repairHistoryList.add(obj3);
            repairHistoryList.add(obj4);
            repairHistoryList.add(obj5);
            repairHistoryList.add(obj6);
        }
        return repairHistoryList;
    }

    public void setExpenseIncurredList(List<Object[]> expenseIncurredList) {
        this.expenseIncurredList = expenseIncurredList;
    }

    public String getVisisbleText() {
        //if (visisbleText == null) {
        CarBean carBean = (CarBean) AdfFacesContext.getCurrentInstance().getPageFlowScope().get("carBean");
        addJavaScript("initialize(" + carBean.getLatitude() + "," + carBean.getLongitude() + ");");
        visisbleText = "Test";
        //}
        return visisbleText;
    }

    private void addJavaScript(String jsStr) {
        FacesContext fctx = FacesContext.getCurrentInstance();
        ExtendedRenderKitService erks = null;
        erks = Service.getRenderKitService(fctx, ExtendedRenderKitService.class);
        erks.addScript(fctx, jsStr);
    }

    public void setInvoiceList(List<Object[]> invoiceList) {
        this.invoiceList = invoiceList;
    }

    public List<Object[]> getInvoiceList() {
        if (invoiceList == null) {
            invoiceList = new ArrayList<Object[]>();
            Object[] obj1 = { "Jan", "Paid", 105000 };
            Object[] obj1_1 = { "Jan", "Open", 0 };
            Object[] obj2 = { "Feb", "Paid", 85000 };
            Object[] obj2_1 = { "Feb", "Open", 0 };
            Object[] obj3 = { "Mar", "Paid", 90000 };
            Object[] obj3_1 = { "Mar", "Open", 0 };
            Object[] obj4 = { "Apr", "Paid", 120000 };
            Object[] obj4_1 = { "Apr", "Open", 0 };
            Object[] obj5 = { "May", "Paid", 80000 };
            Object[] obj5_1 = { "May", "Open", 0 };
            Object[] obj6 = { "Jun", "Paid", 110000 };
            Object[] obj6_1 = { "Jun", "Open", 0 };
            Object[] obj7 = { "Jul", "Paid", 115000 };
            Object[] obj7_1 = { "Jul", "Open", 23000 };
            Object[] obj8 = { "Aug", "Paid", 130000 };
            Object[] obj8_1 = { "Aug", "Open", 45000 };
            Object[] obj9 = { "Sep", "Paid", 85000 };
            Object[] obj9_1 = { "Sep", "Open", 70000 };
            Object[] obj10 = { "Oct", "Paid", 65000 };
            Object[] obj10_1 = { "Oct", "Open", 90000 };
            Object[] obj11 = { "Nov", "Paid", 45000 };
            Object[] obj11_1 = { "Nov", "Open", 100000 };
            Object[] obj12 = { "Dec", "Paid", 20000 };
            Object[] obj12_1 = { "Dec", "Open", 115000 };
            invoiceList.add(obj1);
            invoiceList.add(obj1_1);
            invoiceList.add(obj2);
            invoiceList.add(obj2_1);
            invoiceList.add(obj3);
            invoiceList.add(obj3_1);
            invoiceList.add(obj4);
            invoiceList.add(obj4_1);
            invoiceList.add(obj5);
            invoiceList.add(obj5_1);
            invoiceList.add(obj6);
            invoiceList.add(obj6_1);
            invoiceList.add(obj7);
            invoiceList.add(obj7_1);
            invoiceList.add(obj8);
            invoiceList.add(obj8_1);
            invoiceList.add(obj9);
            invoiceList.add(obj9_1);
            invoiceList.add(obj10);
            invoiceList.add(obj10_1);
            invoiceList.add(obj11);
            invoiceList.add(obj11_1);
            invoiceList.add(obj12);
            invoiceList.add(obj12_1);
        }
        return invoiceList;
    }

    public void setAllInvoices(List<InvoiceBean> allInvoices) {
        this.allInvoices = allInvoices;
    }

    public List<InvoiceBean> getAllInvoices() {
        if (allInvoices.size() == 0) {
        InvoiceBean invoice1 = new InvoiceBean();
        invoice1.setBalanceAmount(600000L);
        invoice1.setDescription("Car Maintenance");
        invoice1.setId(100001);
        invoice1.setIssueDate("02/11/2015");
        invoice1.setInvoiceInOpenStatus(true);
        invoice1.setStatus("Due Today");
        allInvoices.add(invoice1);
        InvoiceBean invoice2 = new InvoiceBean();
        invoice2.setBalanceAmount(520000L);
        invoice2.setDescription("New Car Lease");
        invoice2.setId(100002);
        invoice2.setIssueDate("06/12/2015");
        invoice2.setInvoiceInOpenStatus(true);
        invoice2.setStatus("Due In 3 Days");
        allInvoices.add(invoice2);
        InvoiceBean invoice3 = new InvoiceBean();
        invoice3.setBalanceAmount(476500L);
        invoice3.setDescription("New Car Lease");
        invoice3.setId(100003);
        invoice3.setIssueDate("12/12/2015");
        invoice3.setInvoiceInOpenStatus(false);
        invoice3.setStatus("Paid");
        allInvoices.add(invoice3);
        }
        return allInvoices;
    }

    public void setOpenInvoices(List<InvoiceBean> openInvoices) {
        this.openInvoices = openInvoices;
    }

    public List<InvoiceBean> getOpenInvoices() {
        if (openInvoices.size() == 0) {
            for (InvoiceBean invoice : getAllInvoices()) {
                if (invoice.isInvoiceInOpenStatus()) {
                    openInvoices.add(invoice);
                }
            }
        }
        return openInvoices;
    }

   
    public List<Object[]> getExpenseIncurredList() {
        if (expenseIncurredList == null) {
            expenseIncurredList = new ArrayList<Object[]>();
            Object[] obj1 = { "Aug", "Expense", 15000.0 };
            Object[] obj2 = { "Sep", "Expense", 23000.0 };
            Object[] obj3 = { "Oct", "Expense", 17000.0 };
            Object[] obj4 = { "Nov", "Expense", 13000.0 };
            Object[] obj5 = { "Dec", "Expense", 21000.0 };
            Object[] obj6 = { "Jan", "Expense", 17000.0 };
            expenseIncurredList.add(obj1);
            expenseIncurredList.add(obj2);
            expenseIncurredList.add(obj3);
            expenseIncurredList.add(obj4);
            expenseIncurredList.add(obj5);
            expenseIncurredList.add(obj6);

        }
        return expenseIncurredList;
    }
    
}
