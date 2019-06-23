import java.text.DecimalFormat;

public class Exercise3 {
    public static void main(String[] args) {
        double fahrenheit = 89d;
        double celsius = (5d/9d)*(fahrenheit-32d);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println(df.format(fahrenheit) + " degree Fahrenheit is " + df.format(celsius) + " degree Celsius");

    }

}
