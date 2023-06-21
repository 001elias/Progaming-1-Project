package Programing1Project;

import java.util.Scanner;

public class MyProgram2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the joker number: ");
        int joker = scanner.nextInt();

        System.out.print("Enter the number of integers: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        System.out.println("Enter the numbers separated by a space:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] output = processNumbers(numbers, joker);

        System.out.println("Output:");
        for (int num : output) {
            System.out.print(num + " ");
        }
        scanner.close();
    }

    private static int[] processNumbers(int[] numbers, int joker) {
        int[] output = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            while (num >= joker) {
                num -= joker;
            }
            output[i] = num;
        }

        return output;
    }

}
