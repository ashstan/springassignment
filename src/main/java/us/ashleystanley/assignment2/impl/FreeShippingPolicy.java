package us.ashleystanley.assignment2.impl;

import us.ashleystanley.assignment2.Sale;
import us.ashleystanley.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingPolicy implements ShippingPolicy {
    @Override
    public void applyShipping(List<Sale> sales) {
        for(Sale sale: sales){
            sale.setShippingCost((double) 00);
        }
    }
}
