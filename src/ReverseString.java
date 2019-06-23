import java.util.Scanner;

public class ReverseString {
    private static String reverse = "";

    public static void main(String[] args) {
        Reverse();
    }

    public static void Reverse(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter word");
        String word = input.nextLine().toLowerCase();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        System.out.println(reverse);

    }
}
