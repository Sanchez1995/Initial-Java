public class Exercise8 {
    public static void main(String[] args) {
        int x =9, y=5;
        if (x>=10 ) {
            System.out.println(x);
        }else if (y>=10){
            System.out.println(y);
            System.out.println(x);
        } else if (x<10 && x+y >10){
            System.out.println(x+y);
        }
        else {
            System.out.println("I am broken");
        }
    }


}
