public class PalindromeIntegerExercise {

    public static boolean palindromeCheck(int palindrome) {
        String reverse = "";
        boolean isABoolean;

        for (int i = Integer.toString(palindrome).length() ; i > 0; i--) {
            reverse = reverse + Integer.toString(palindrome).charAt(i-1);

        }
        if (reverse.equals(Integer.toString(palindrome))) {
            isABoolean = true;
        } else {
            isABoolean = false;
        }
        return isABoolean;
    }


        public static void main (String[]args){

            System.out.println("This number is a palindrome: ");
            boolean answer = palindromeCheck(23232);
            System.out.println(answer);
        }
    }



