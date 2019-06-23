import java.text.DecimalFormat;

public class Exercise2 {
    public static void main(String[] args) {
        double temperatureCelsius = 41d;
        double temperatureFahrenheit = ((temperatureCelsius*(9d/5d)) + 32d);
        System.out.println(temperatureCelsius);
        DecimalFormat df = new DecimalFormat("#,###.00");
        System.out.println(df.format(temperatureFahrenheit));

    }
}
