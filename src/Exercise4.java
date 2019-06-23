public class Exercise4 {
    public static void main(String[] args) {
        String myPassword = "Password999";
        System.out.println(myPassword.replaceAll("[A-Z][a-z]{0,9}","123456789"));
    }
}
