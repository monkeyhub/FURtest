package com.fur.portal.view.bean.invoice;

public class InvoiceBean {
    public InvoiceBean() {
        super();
    }
    
    private int id;
    private String description;
    private String status;
    private String issueDate;
    private boolean invoiceInOpenStatus;
    private long balanceAmount;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setInvoiceInOpenStatus(boolean invoiceInOpenStatus) {
        this.invoiceInOpenStatus = invoiceInOpenStatus;
    }

    public boolean isInvoiceInOpenStatus() {
        return invoiceInOpenStatus;
    }

    public void setBalanceAmount(long balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public long getBalanceAmount() {
        return balanceAmount;
    }
   
}
