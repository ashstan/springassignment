package us.ashleystanley.assignment2.impl;

import us.ashleystanley.assignment2.Sale;
import us.ashleystanley.assignment2.iface.SalesReport;

import java.util.List;

public class FakeSalesReport implements SalesReport {
    public void generateReport(List<Sale> salesList) {
        System.out.println("Wrote a report");
        for (Sale sale: salesList) {
            System.out.println(sale);
        }
    }
}
