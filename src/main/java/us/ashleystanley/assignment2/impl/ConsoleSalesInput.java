package us.ashleystanley.assignment2.impl;

import com.sun.security.jgss.GSSUtil;
import us.ashleystanley.assignment2.Sale;
import us.ashleystanley.assignment2.iface.SalesInput;

import java.util.*;

public class ConsoleSalesInput implements SalesInput {

    @Override
    public List<Sale> getSales() {
        Scanner scanner = new Scanner(System.in);

        List<Sale> theList = new ArrayList<>();
        String answer = "y";

        System.out.print("Add sale? (y/n) ");
        answer = scanner.nextLine();

        while (answer.equals("y")) {
            //name
            System.out.print("Name: ");
            String name = scanner.nextLine();

            //country
            System.out.print("Country: ");
            String country = scanner.nextLine();

            //price
            System.out.print("Price: ");
            Double price = Double.valueOf(scanner.nextLine());

            //tax
            System.out.print("Tax: ");
            Double tax = Double.valueOf(scanner.nextLine());

            System.out.print("Add another sale? (y/n) ");
            answer = scanner.nextLine();

            theList.add(new Sale(name, country, price, tax));
        }
        scanner.close();

        return theList;
    }
}

//    @Override
//    public List<Sale> getSales() {
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        String country;
//        Double price;
//        Double tax;
//        List<Sale> sales = new ArrayList<>();
//
//        while(!input.toLowerCase().equals("na")) {
//            System.out.println("Enter in person name (NA to quit)");
//            input = scanner.nextLine();
//            if(!input.equals("NA")){
//                System.out.println("Enter in country: ");
//                country = scanner.nextLine();
//                System.out.println("Enter in price: ");
//                price = Double.parseDouble(scanner.nextLine());
//                System.out.println("Enter in tax");
//                tax = Double.parseDouble(scanner.nextLine());
//                sales.add(new Sale(input, country, price, tax));
//            }
//        }
//        return sales;
//    }
//}


