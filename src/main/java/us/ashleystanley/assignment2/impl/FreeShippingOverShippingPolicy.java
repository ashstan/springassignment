package us.ashleystanley.assignment2.impl;

import us.ashleystanley.assignment2.Sale;
import us.ashleystanley.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FreeShippingOverShippingPolicy implements ShippingPolicy {
    double threshold = Double.MAX_VALUE;

    public FreeShippingOverShippingPolicy(Double minLimit){
        this.threshold = minLimit;
    }

    @Override
    public void applyShipping(List<Sale> sales) {
        new FlatRateDomesticShippingPolicy().applyShipping(sales);

        if(this.threshold < 0){
            throw new IllegalArgumentException("The min limit is too low");
        }
        for(Sale sale: sales){
            if(sale.getPrice() > this.threshold)
                sale.setShippingCost(0.0);
        }
    }
}
