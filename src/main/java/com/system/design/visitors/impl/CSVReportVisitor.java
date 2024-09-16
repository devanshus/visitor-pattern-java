package com.system.design.visitors.impl;

import com.system.design.documents.Contract;
import com.system.design.documents.Invoice;
import com.system.design.documents.PurchaseOrder;
import com.system.design.documents.Receipt;
import com.system.design.visitors.ReportVisitor;

public class CSVReportVisitor implements ReportVisitor {
    @Override
    public void visit(Invoice invoice) {
        System.out.println("Generating CSV report for Invoice...");
    }

    @Override
    public void visit(PurchaseOrder purchaseOrder) {
        System.out.println("Generating CSV report for Purchase Order...");
    }

    @Override
    public void visit(Receipt receipt) {
        System.out.println("Generating CSV report for Receipt...");
    }

    @Override
    public void visit(Contract contract) {
        System.out.println("Generating CSV report for Contract...");
    }
}
