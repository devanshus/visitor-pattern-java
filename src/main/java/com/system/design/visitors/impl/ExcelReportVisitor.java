package com.system.design.visitors.impl;

import com.system.design.documents.Contract;
import com.system.design.documents.Invoice;
import com.system.design.documents.PurchaseOrder;
import com.system.design.documents.Receipt;
import com.system.design.visitors.ReportVisitor;

// Concrete Visitor for Excel Report Generation
public class ExcelReportVisitor implements ReportVisitor {
    @Override
    public void visit(Invoice invoice) {
        System.out.println("Generating Excel report for Invoice...");
        // Logic to generate Excel for invoice
    }

    @Override
    public void visit(PurchaseOrder purchaseOrder) {
        System.out.println("Generating Excel report for Purchase Order...");
        // Logic to generate Excel for purchase order
    }

    @Override
    public void visit(Receipt receipt) {
        System.out.println("Generating Excel report for Receipt...");
        // Logic to generate Excel for receipt
    }

    @Override
    public void visit(Contract contract) {
        System.out.println("Generating Excel report for Contract...");
    }
}