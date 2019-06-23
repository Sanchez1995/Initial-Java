public class Exercise16 {
    public static void main(String[] args) {
        int noOfRepeats = 8;
        for (int i = 0; i <= noOfRepeats; i++) {

            for (int y = 0; y <= noOfRepeats; y++) {
                if (i > y) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println(" ");
        }
    }
}

