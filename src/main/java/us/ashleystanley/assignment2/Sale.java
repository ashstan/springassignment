package us.ashleystanley.assignment2;

public class Sale {
    private String name;
    private String country;
    private Double price;
    private Double tax;
    private Double shippingCost;


    public Sale(String name, String country, Double price, Double tax) {
        this.name = name;
        this.country = country;
        this.price = price;
        this.tax = tax;
        shippingCost = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    public Double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", price=" + price +
                ", tax=" + tax +
                ", shippingCost=" + shippingCost +
                '}';
    }
}
