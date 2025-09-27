import java.util.Scanner;

public class ExercicioFixacaoMatrizes {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Fill the matrix with user input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter a number to search in the matrix: ");
        int target = sc.nextInt();

        // Search for the target number and print its position and neighbors
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == target) {
                    System.out.println("Position: " + i + "," + j);
                    if (j > 0) {
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if (j < cols - 1) {
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if (i < rows - 1) {
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }

        sc.close();
    }

}
