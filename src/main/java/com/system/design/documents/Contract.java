package com.system.design.documents;

import com.system.design.visitors.ReportVisitor;

public class Contract implements Document {

    public Contract(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    private final String contractNumber;

    @Override
    public void accept(ReportVisitor visitor) {
        visitor.visit(this);
    }
}
