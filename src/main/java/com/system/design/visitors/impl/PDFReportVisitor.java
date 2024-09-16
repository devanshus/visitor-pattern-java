package com.system.design.visitors.impl;

import com.system.design.documents.Contract;
import com.system.design.documents.Invoice;
import com.system.design.documents.PurchaseOrder;
import com.system.design.documents.Receipt;
import com.system.design.visitors.ReportVisitor;

public class PDFReportVisitor implements ReportVisitor {
    @Override
    public void visit(Invoice invoice) {
        System.out.println("Generating PDF report for Invoice...");
        // Logic to generate PDF for invoice
    }

    @Override
    public void visit(PurchaseOrder purchaseOrder) {
        System.out.println("Generating PDF report for Purchase Order...");
        // Logic to generate PDF for purchase order
    }

    @Override
    public void visit(Receipt receipt) {
        System.out.println("Generating PDF report for Receipt...");
        // Logic to generate PDF for receipt
    }

    @Override
    public void visit(Contract contract) {
        System.out.println("Generating Excel report for Contract...");
    }
}
