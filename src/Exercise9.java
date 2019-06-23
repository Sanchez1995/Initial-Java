public class Exercise9 {
    public static void main(String[] args) {
        int age = 18;
        if (age<18){
            System.out.println("Can't get Insurance");
        }else if (age<=35) {
            System.out.println("Insurance will cost £1000");
        } else if (age<=60) {
            System.out.println("Insurance will cost £2000");
        } else {
            System.out.println("Insurance will cost £500");
        }
    }
}
