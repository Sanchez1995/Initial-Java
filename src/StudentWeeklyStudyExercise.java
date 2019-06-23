public class StudentWeeklyStudyExercise {
    //get matrix
    public static int[][] getMatrix() {
        int matrix[][] = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
        //Display or show the MD
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
            // Add each element of the same row
            int total = 0;
            for (int column = 0; column < matrix[0].length; column++)
                total += matrix[row][column];
            System.out.println(); //after each loop print new line
            System.out.println(total);
        }
        System.out.println();

        return matrix;

    }

   /* public static int sumRow(int matrix[][], int rowIndex) {
        System.out.println();
        //Add each element of the same row
        int total = 0;
        for (int columnIndex = 0; columnIndex < matrix[rowIndex].length; columnIndex++)
            total += matrix[rowIndex][columnIndex];
        return total;
    }*/

  /*  //get rows
    public static void sumRow() {
        System.out.println();
        // Add each element of the same row
        int total = 0;
        for (int column = 0; column < matrix[0].length; column++)
            total += matrix[rowIndex][column];
        *//*System.out.println("Sum for row " + rowIndex + " is " + total);*//*

        return total;
    }*/

    public static void main(String[] args) {
        getMatrix();

        /*for (int row = 0; row < matrix.length; row++) {
            System.out.println(sumRow());*/


    }
}
    /*//get rows
    public static int sumRow(int[][] matrix, int rowIndex) {
        System.out.println();
        // Add each element of the same row
        int total = 0;
        for (int column = 0; column < matrix[0].length; column++)
            total += matrix[rowIndex][column];
        *//*System.out.println("Sum for row " + rowIndex + " is " + total);*//*

        return total;
    }
*/
