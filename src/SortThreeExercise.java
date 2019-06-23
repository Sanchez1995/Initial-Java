public class SortThreeExercise {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        String string1 = Double.toString(num1);
        String string2 = Double.toString(num2);
        String string3 = Double.toString(num3);
        String order;

        if (num1 > num2 && num2 > num3) {
            order = string1 + ", " + string2 + ", " + string3;

        } else if (num2 > num1 && num1 > num3) {
            order = string2 + ", " + string1 + ", " + string3;

        } else if (num1 > num3 && num3 > num2) {
            order = string1 + ", " + string3 + ", " + string2;

        } else if (num2 > num3 && num3 > num1) {
            order = string2 + ", " + string3 + ", " + string1;

        } else if (num3 > num1 && num1 > num2) {
            order = string3 + ", " + string1 + ", " + string2;

        } else {
            order = string3 + ", " + string2 + ", " + string1;
        }
        System.out.println(order);
    }


    public static void main(String[] args) {
        displaySortedNumbers(12, 500, 8);

        System.out.println("well done");
    }
}
