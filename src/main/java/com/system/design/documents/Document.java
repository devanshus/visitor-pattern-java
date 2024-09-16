package com.system.design.documents;

import com.system.design.visitors.ReportVisitor;

public interface Document {
    void accept(ReportVisitor visitor);
}
