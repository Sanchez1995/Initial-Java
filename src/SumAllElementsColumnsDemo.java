public class SumAllElementsColumnsDemo {

    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        //Populate with random numbers
        for (int row = 0; row < matrix.length; row++)
            for (int column = 0; column < matrix[row].length; column++) {

                matrix[row][column] = (int) (Math.random() * 100);
            }
        //Display or show the MDA
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println(); //after each loop print new line
        }
        // Add each element of the same column
        System.out.println();
        for (int column = 0; column < matrix[0].length; column++) {
            int total = 0;
            for (int row = 0; row < matrix.length; row++)
                total += matrix[row][column];
            System.out.println("Sum for column " + column + " is " + total);
        }
    }
}
