public class SumAllElementsRowsExercise {
    //get matrix
    public static int[][] getMatrix(int rowLength, int columnLength) {
        //Populate with random numbers
        int matrix[][] = new int[rowLength][columnLength];
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
        System.out.println();
        return matrix;

    }

    //get rows
    public static int sumRow(int[][] matrix, int rowIndex) {
        System.out.println();
        // Add each element of the same row
        int total = 0;
        for (int column = 0; column < matrix[0].length; column++)
            total += matrix[rowIndex][column];
        /*System.out.println("Sum for row " + rowIndex + " is " + total);*/

        return total;
    }

    public static void main(String[] args) {
        int[][] matrix = getMatrix(3, 4);
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(sumRow(matrix, row));
        }
    }
}
/*public static void addAllElementsRows(int matrix[][]) {
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
        System.out.println();
        // Add each element of the same row
        for (int row = 0; row < matrix.length; row++) {
            int total = 0;
            for (int column = 0; column < matrix[row].length; column++)
                total += matrix[row][column];
            System.out.println("Sum for row " + row + " is " + total);
        }
    }


    public static void main(String[] args) {
        int matrix[][] = new int [5][5];
        addAllElementsRows( matrix);
        System.out.println(" Completed ");

    }*/
