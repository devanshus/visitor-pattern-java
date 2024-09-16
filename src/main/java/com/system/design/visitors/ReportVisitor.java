package com.system.design.visitors;

import com.system.design.documents.Contract;
import com.system.design.documents.Invoice;
import com.system.design.documents.PurchaseOrder;
import com.system.design.documents.Receipt;

public interface ReportVisitor {
    void visit(Invoice invoice);

    void visit(PurchaseOrder purchaseOrder);

    void visit(Receipt receipt);

    void visit(Contract contract);
}
