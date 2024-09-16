package com.system.design;

import com.system.design.documents.Contract;
import com.system.design.documents.Document;
import com.system.design.documents.Invoice;
import com.system.design.documents.PurchaseOrder;
import com.system.design.documents.Receipt;
import com.system.design.visitors.ReportVisitor;
import com.system.design.visitors.impl.CSVReportVisitor;
import com.system.design.visitors.impl.ExcelReportVisitor;
import com.system.design.visitors.impl.HTMLReportVisitor;
import com.system.design.visitors.impl.PDFReportVisitor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        // List of documents
        List<Document> documents =
                Arrays.asList(new Invoice("INV123"),
                        new PurchaseOrder("PO456"),
                        new Receipt("REC789"),
                        new Contract("REC890"));

        // Report visitors
        ReportVisitor pdfVisitor = new PDFReportVisitor();
        ReportVisitor excelVisitor = new ExcelReportVisitor();
        ReportVisitor htmlVisitor = new HTMLReportVisitor();
        ReportVisitor csvVisitor = new CSVReportVisitor();

        // Generate reports in PDF format
        System.out.println("Generating PDF Reports:");
        documents.forEach(doc -> doc.accept(pdfVisitor));

        // Generate reports in Excel format
        System.out.println("\nGenerating Excel Reports:");
        documents.forEach(doc -> doc.accept(excelVisitor));

        // Generate reports in HTML format
        System.out.println("\nGenerating HTML Reports:");
        documents.forEach(doc -> doc.accept(htmlVisitor));

        // Generate reports in CSV format
        System.out.println("\nGenerating CSV Reports:");
        documents.forEach(doc -> doc.accept(csvVisitor));

    }

}
