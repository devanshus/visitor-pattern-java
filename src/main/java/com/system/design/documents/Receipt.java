package com.system.design.documents;

import com.system.design.visitors.ReportVisitor;

public class Receipt implements Document {
    private String receiptNumber;

    public Receipt(String receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public String getReceiptNumber() {
        return receiptNumber;
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
