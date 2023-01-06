package homework3;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3, 4}, {2, 3, 4, 6}, {2, 4, 5, 6}};
        int[][] matrix2 = {{1, 2, 3}, {2, 3, 4}, {4, 5, 6}, {1, 1, 3}};
        double[][] matrix3 = {{1.5, 2.6, 3}, {2.2, 3.1, 4.2}, {4, 5, 6}};
        double[][] matrix4 = {{1.2, 6.5, 3.2}, {2.2, 8, 4.2}, {4, 7.7, 1}};
        // print matrix
        System.out.println("The (int) matrix is: ");
        print(matrix1);
        System.out.println("The (double) matrix is: ");
        print(matrix3);
        System.out.println();
        // Compare matrix
        System.out.println("2 (int) matrices are the same dimension?: "
                + haveSameDimension(matrix1, matrix2));
        System.out.println("2 (double) matrices are the same dimension?: "
                + haveSameDimension(matrix3, matrix4));
        System.out.println();
        // Addition
        System.out.println("Addition of 2 (int) matrices:");
        int[][] addResult1 = add(matrix1, matrix2);
        if (addResult1 != null) {
            print(addResult1);
        } else {
            System.out.println("Invalid calculation!!!");
        }
        System.out.println("Addition of 2 (double) matrices: ");
        double[][] addResult2 = add(matrix3, matrix4);
        if (addResult2 != null) {
            print(addResult2);
        } else {
            System.out.println("Invalid calculation!!!");
        }
        System.out.println();
        //Subtraction
        System.out.println("Subtraction of 2 (int) matrices:");
        int[][] subResult1 = subtract(matrix1, matrix2);
        if (subResult1 != null) {
            print(subResult1);
        } else {
            System.out.println("Invalid calculation!!!");
        }
        System.out.println("Subtraction of 2 (double) matrices: ");
        double[][] subResult2 = subtract(matrix3, matrix4);
        if (subResult2 != null) {
            print(subResult2);
        } else {
            System.out.println("Invalid calculation!!!");
        }
        System.out.println();
        // Multiplication
        System.out.println("Multiplication of 2 (int) matrices:");
        int[][] mulResult1 = multiply(matrix1, matrix2);
        if (mulResult1 != null) {
            print(mulResult1);
        } else {
            System.out.println("Invalid calculation!!!");
        }
        System.out.println("Multiplication of 2 (double) matrices: ");
        double[][] mulResult2 = multiply(matrix3, matrix4);
        if (mulResult2 != null) {
            print(mulResult2);
        } else {
            System.out.println("Invalid calculation!!!");
        }
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void print(double[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.printf("%.1f ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {
        int row1 = matrix1.length;
        int row2 = matrix2.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;
        if (col1 == col2 && row1 == row2) {
            return true;
        }
        return false;
    }

    public static boolean haveSameDimension(double[][] matrix1,
                                            double[][] matrix2) {
        int row1 = matrix1.length;
        int row2 = matrix2.length;
        int col1 = matrix1[0].length;
        int col2 = matrix2[0].length;
        if (col1 == col2 && row1 == row2) {
            return true;
        }
        return false;
    }

    public static int[][] add(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int[][] result = matrix1;
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                result[row][col] += matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        double[][] result = matrix1;
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                result[row][col] += matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] subtract(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        int[][] result = matrix1;
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                result[row][col] -= matrix2[row][col];
            }
        }
        return result;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        if (!haveSameDimension(matrix1, matrix2)) {
            return null;
        }
        int row1 = matrix1.length;
        int col1 = matrix1[0].length;
        double[][] result = matrix1;
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col1; col++) {
                result[row][col] -= matrix2[row][col];
            }
        }
        return result;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        if (matrix1 == null || matrix2 == null) {
            return null;
        }
        int row1 = matrix1.length;
        int col2 = matrix2[0].length;
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        int[][] result = new int[row1][col2];
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col2; col++) {
                int temp = 0;
                for (int idx = 0; idx < matrix1[0].length; idx++) {
                    temp += matrix1[row][idx] * matrix2[idx][col];
                }
                result[row][col] = temp;
            }
        }
        return result;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) {
        int row1 = matrix1.length;
        int col2 = matrix2[0].length;
        if (matrix1[0].length != matrix2.length) {
            return null;
        }
        double[][] result = new double[row1][col2];
        for (int row = 0; row < row1; row++) {
            for (int col = 0; col < col2; col++) {
                double temp = 0;
                for (int idx = 0; idx < matrix1[0].length; idx++) {
                    temp += matrix1[row][idx] * matrix2[idx][col];
                }
                result[row][col] = temp;
            }
        }
        return result;
    }
}
