import java.text.DecimalFormat;

public class Exercise6 {
    public static void main(String[] args) {
        double priceOfBooks = 4.56d;
        int noOfBooks = 80;
        DecimalFormat df = new DecimalFormat("£#,###.00");
        if (noOfBooks<20) {
            int discount = (noOfBooks/3);
            double priceBeforeDiscount = noOfBooks*priceOfBooks;
            double priceAfterDiscount = priceBeforeDiscount - (priceBeforeDiscount*(discount/100d));
            System.out.println(discount);
            System.out.println(df.format(priceBeforeDiscount));
            System.out.println(df.format(priceAfterDiscount));

        }
        else if (noOfBooks<90){
            double discount = (noOfBooks%3d) + 10d;
            double priceBeforeDiscount = noOfBooks*priceOfBooks;
            double priceAfterDiscount = priceBeforeDiscount - (priceBeforeDiscount*(discount/100d));
            System.out.println(discount);
            System.out.println(df.format(priceBeforeDiscount));
            System.out.println(df.format(priceAfterDiscount));
        }
        else if (noOfBooks>=90){
            double discount = 40;
            double priceBeforeDiscount = noOfBooks*priceOfBooks;
            double priceAfterDiscount = priceBeforeDiscount - (priceBeforeDiscount*(discount/100d));
            System.out.println(discount);
            System.out.println(df.format(priceBeforeDiscount));
            System.out.println(df.format(priceAfterDiscount));
        }

        }
    }

