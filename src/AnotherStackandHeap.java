public class AnotherStackandHeap {
    public static void main(String[] args) {
        int myInt = 4;
        int anotherInt = 4;
        System.out.println(myInt);
        System.out.println(anotherInt);
        if (myInt == anotherInt){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


        System.out.println();

        myInt = 5;
        System.out.println(myInt);
        if (myInt == anotherInt) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();

        String myString = "Sparta Global Ltd";
        String anotherString = "Sparta Global Ltd";
        System.out.println(myString);
        System.out.println(anotherString);
        if (myString == anotherString){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();

        String yetAnotherString = new String("Sparta Global Ltd");
        System.out.println(yetAnotherString);
        if (myString == yetAnotherString) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        System.out.println();

        if (myString.equals(yetAnotherString)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

}
