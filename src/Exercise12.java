import java.util.Random;

public class Exercise12 {
    public static void main(String[] args) {
        Random r = new Random();
        int low = 1;
        int high = 101;

        boolean moreThan50 = true;
        while (moreThan50) {
            int result = r.nextInt(high-low)+low;
            if (result>50){
                System.out.println(result);

            } else {
                moreThan50 = false;
                System.out.println(result + " result is below 50");
            }
        }
        }


        /*while (result >= 50){
            result = r.nextInt(high-low)+low;

            System.out.println(result);

        }
        System.out.println(result);
    }*/


}
