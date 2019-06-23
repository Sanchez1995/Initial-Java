public class MaxNumberWithIndex {
    public static void main(String[] args) {
        double[] myNumbers = {1.11, 5.55, 2.22, 3.33, 5.55};
        double highNumber = 0;
        int tempIndex = 0;


        for (int i = 0; i < myNumbers.length; i++) {
            if (highNumber < myNumbers[i]) {
                highNumber = myNumbers[i];
                tempIndex = i;

            }

        }
        System.out.println("The maximum number is " + highNumber);
        System.out.println("The index is: " + tempIndex);
    }
}
