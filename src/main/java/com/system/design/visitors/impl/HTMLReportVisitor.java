package com.system.design.visitors.impl;

import com.system.design.documents.Contract;
import com.system.design.documents.Invoice;
import com.system.design.documents.PurchaseOrder;
import com.system.design.documents.Receipt;
import com.system.design.visitors.ReportVisitor;

public class HTMLReportVisitor implements ReportVisitor {
    @Override
    public void visit(Invoice invoice) {
        System.out.println("Generating HTML report for Invoice...");
        // Logic to generate HTML for invoice
    }

    @Override
    public void visit(PurchaseOrder purchaseOrder) {
        System.out.println("Generating HTML report for Purchase Order...");
        // Logic to generate HTML for purchase order
    }

    @Override
    public void visit(Receipt receipt) {
        System.out.println("Generating HTML report for Receipt...");
        // Logic to generate HTML for receipt
    }

    @Override
    public void visit(Contract contract) {
        System.out.println("Generating Excel report for Contract...");
    }
}
