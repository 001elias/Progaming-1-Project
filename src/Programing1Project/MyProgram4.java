package Programing1Project;

import java.util.Scanner;

public class MyProgram4 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements of the array seperated by a space:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        sortArray(array);

        System.out.println("Sorted array:");

        for (int num : array) {
            System.out.print(num + " ");
        }

        System.out.println();
        scanner.close();
    }

    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
