package us.ashleystanley.assignment2.iface;

import us.ashleystanley.assignment2.Sale;

import java.util.List;

public interface ShippingPolicy {
    void applyShipping(List<Sale> salesList);
}
