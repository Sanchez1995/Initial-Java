import java.text.DecimalFormat;

public class Exercise5 {
    public static void main(String[] args) {
        final double dollarRate = 1.5913d;
        int poundSterling = 8;
        double dollar = dollarRate*poundSterling;
        System.out.println(poundSterling + " pound sterlings are equal to " + dollar + " dollars");
        //System.out.println(String.format("%.0f", poundSterling));
    }
}
