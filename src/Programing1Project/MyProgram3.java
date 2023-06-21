package Programing1Project;

import java.util.Random;
import java.util.Scanner;

public class MyProgram3 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of rows: ");
	        int rows = scanner.nextInt();

	        System.out.print("Enter the number of columns: ");
	        int cols = scanner.nextInt();

	        
	        int[][] array = new int[rows][cols];

	        
	        Random random = new Random();
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                array[i][j] = random.nextInt(100) + 1;
	            }
	        }

	        
	        System.out.println("Original Array:");
	        printArray(array);

	        System.out.print("Enter the number to be removed: ");
	        int target = scanner.nextInt();

	       
	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (array[i][j] == target) {
	                    array[i][j] = 0;
	                }
	            }
	        }

	        
	        System.out.println("Modified Array:");
	        printArray(array);
	        scanner.close();
	    }

	    
	    private static void printArray(int[][] array) {
	        for (int[] row : array) {
	            for (int num : row) {
	                System.out.printf("%3d ", num);
	            }
	            System.out.println();
	        }
	        
	    }

}
