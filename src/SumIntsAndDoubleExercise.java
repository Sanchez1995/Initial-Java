import java.util.Scanner;

public class SumIntsAndDoubleExercise {
    public static void sum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);


    }

    public static void sum(double num3, double num4) {
        double result = num3 + num4;
        System.out.println(result);
    }


    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            if (input.hasNextInt()) {
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                sum(num1, num2);
            } else {
                double num3 = input.nextDouble();
                double num4 = input.nextDouble();
                sum(num3, num4);
            }
        }
    }
}
