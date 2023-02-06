package us.ashleystanley.assignment2.impl;

import us.ashleystanley.assignment2.Sale;
import us.ashleystanley.assignment2.iface.ShippingPolicy;

import java.util.List;

public class FakeShippingPolicy implements ShippingPolicy {
    public void applyShipping(List<Sale> salesList){
        System.out.println("Love that policy");
    }
}
