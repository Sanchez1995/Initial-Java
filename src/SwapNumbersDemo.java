public class SwapNumbersDemo {
    public static void swap(int n1, int n2) {
        System.out.println("Before swap operation " + n1 + " and " + n2);
        int temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("After swap operation " + n1 + " and " + n2);
    }

    public static void main(String[] args) {
        int num1 = 9;
        int num2 = 7;
        swap(num1, num2);
    }
}
