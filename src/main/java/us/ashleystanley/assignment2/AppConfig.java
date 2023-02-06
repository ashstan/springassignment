package us.ashleystanley.assignment2;

import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import us.ashleystanley.assignment2.iface.SalesInput;
import us.ashleystanley.assignment2.iface.SalesReport;
import us.ashleystanley.assignment2.iface.ShippingPolicy;
import us.ashleystanley.assignment2.impl.*;

import java.util.List;

@Configuration
@ComponentScan("us.ashleystanley.assignment2")
public class AppConfig {
//    @Bean
//    public SalesInput salesInput() {
//        return new FakeSalesInput();
//    }

//    @Bean
//    public SalesReport salesReport() {
//        return new FakeSalesReport();
//    }

    @Bean
    public ShippingPolicy shippingPolicy() {return new FreeShippingOverShippingPolicy(50.0);}

    @Bean
    public SalesInput salesInput() {return new FileSalesInput();}

    @Bean
    public SalesReport salesReport() { return new SummarySalesReport();}
}
