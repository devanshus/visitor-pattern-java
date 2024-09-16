package com.system.design.documents;

import com.system.design.visitors.ReportVisitor;

public class Invoice implements Document {
    private final String invoiceNumber;

    public Invoice(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}