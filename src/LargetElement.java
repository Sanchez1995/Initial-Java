public class LargetElement {


            public static void main(String[]args){
                double [] myNumbers = {71.21, 44.73, 15.86, 27.20, 16.47, 92.35, 50.91, 62.37, 38.19, 58.34};
                double highNumber = 0;

                for(int i = 0; i < myNumbers.length; i++) {
                    if (highNumber < myNumbers[i]){
                        highNumber = myNumbers[i];

            }
        }
                System.out.println(highNumber);
    }
}

