public class StudentStudyExercise {

  /*  public static int[] sumRow(int[][] matrix, int rowIndex) {
        System.out.println();
        // Add each element of the same row
        int[] total = {0};
        for (int column = 0; column < matrix[0].length; column++)
            *//* total = matrix[rowIndex][column];*//*
            *//*System.out.println("Sum for row " + rowIndex + " is " + total);*//*

            return total;}*/



    public static int[][] displayMatrix(int[][] array) {
        //Display or show the MDA
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println(); //after each loop print new line
        }
        System.out.println();
        return array;
    }


    public static int[][] sortMatrix(int[][]matrix1) {
        int n = matrix1.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (matrix1[j - 1][0] > matrix1[j][0]) {
                    //swap elements
                    temp = matrix1[j - 1][0];
                    matrix1[j - 1] = matrix1[j];
                    matrix1[j][0]= temp;

                }
            }
        } return matrix1;
    }

    public static void main(String[] args) {
        int matrix[][] = {{2, 4, 3, 4, 5, 8, 8}, {7, 3, 4, 3, 3, 4, 4}, {3, 3, 4, 3, 3, 2, 2}, {9, 3, 4, 7, 3, 4, 1}, {3, 5, 4, 3, 6, 3, 8}, {3, 4, 4, 6, 3, 4, 4}, {3, 7, 4, 8, 3, 8, 4}, {6, 3, 5, 9, 2, 7, 9}};
        displayMatrix(matrix);
        sortMatrix(matrix);

        /*sortMatrix(matrix);*/
        System.out.println("Student " + "   Weekly Study Hours");
        System.out.println("----------------------------------");

        for (int row = 0; row < matrix.length; row++) {
          /*  int [] sum = sumRow(matrix, row);
*/
                        //put the int from sumrow into new array. sort the new array
       /*     System.out.print(row + "                  " + sum);
            *//*sortMatrix(sumRow(matrix));*/
            /*sortMatrix(newArray);*/

        }

    }
}

