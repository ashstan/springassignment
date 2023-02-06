package us.ashleystanley.assignment2.impl;

import us.ashleystanley.assignment2.Sale;
import us.ashleystanley.assignment2.iface.ShippingPolicy;

import java.util.List;
import java.util.Locale;

public class FlatRateDomesticShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> sales) {

        for(Sale sale: sales) {
            Double shipping;
            switch(sale.getCountry().toLowerCase()){
                case "united states","usa","us" -> shipping = 29.95;
                case "japan" -> shipping = 14.50;
                case "scotland" -> shipping = 7.54;
                case "india" -> shipping = 11.79;
                default -> {
                    throw new IllegalArgumentException("COUNTRY NAME NOT FOUND");
                }
            }
            sale.setShippingCost(shipping);
        }
    }
}
