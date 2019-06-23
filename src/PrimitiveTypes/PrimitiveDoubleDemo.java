package PrimitiveTypes;

import java.text.DecimalFormat;

public class PrimitiveDoubleDemo {
    public static void main(String[] args) {
        int numberOfDVD = 489712;
        double price = 3.99d;
        double amountToPay = numberOfDVD*price;
        System.out.println(amountToPay);
        System.out.println((double)Math.round(amountToPay*100d)/100d);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println(df.format(amountToPay));
    }
}
