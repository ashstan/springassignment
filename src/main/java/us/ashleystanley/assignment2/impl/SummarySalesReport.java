package us.ashleystanley.assignment2.impl;

import us.ashleystanley.assignment2.Sale;
import us.ashleystanley.assignment2.iface.SalesReport;

import java.util.List;

public class SummarySalesReport implements SalesReport {
    @Override
    public void generateReport(List<Sale> salesList) {
        double priceTotal = 0;
        double taxTotal = 0;
        double shippingFeeTotal = 0;
        System.out.println("\n SALES SUMMARY REPORT\n");
        System.out.format("%20s %15s %8s %8s %8s", "Customer", "Country", "Amount", "Tax", "Shipping");

        for (Sale sale: salesList) {
//            priceTotal += sale.getPrice();
//            taxTotal += sale.getTax();
//            shippingFeeTotal += sale.getShippingCost();
//            System.out.format("%8s %8s %8s\n", "price", "tax", "shipping");
////            System.out.format("%8.2f %8.2f %8.2f\n", priceTotal, taxTotal, shippingFeeTotal);
//            System.out.format(sale.getName(), sale.getCountry(), sale.getPrice(), sale.getShippingCost());
            System.out.println();
            System.out.format("%20s %15s %8.2f %8.2f %8.2f", sale.getName(), sale.getCountry(), sale.getPrice(), sale.getTax(), sale.getShippingCost());
        }
    }

}
