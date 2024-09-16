package com.system.design.documents;

import com.system.design.visitors.ReportVisitor;

public class PurchaseOrder implements Document {
    private String orderNumber;

    public PurchaseOrder(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
