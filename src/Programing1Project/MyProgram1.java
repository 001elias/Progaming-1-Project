package Programing1Project;

import java.util.Scanner;

public class MyProgram1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter three 2-digit integers separated by spaces: ");
        String inputLine = scanner.nextLine();

        
        String[] numbers = inputLine.split(" ");
        int n1 = Integer.parseInt(numbers[0]);
        int n2 = Integer.parseInt(numbers[1]);
        int n3 = Integer.parseInt(numbers[2]);

       
        int sum = n1 + n2 + n3;

        
        String magicNumber;

        if (sum % 3 == 0 && sum % 5 != 0) {
            magicNumber = String.valueOf(n2).substring(0, 1) + (n1 + n3);
        } else if (sum % 3 != 0 && sum % 5 == 0) {
            magicNumber = (n1 + n3) + String.valueOf(n2).substring(1);
        } else if (sum % 3 == 0 && sum % 5 == 0) {
            magicNumber = n2 + String.valueOf(n1) + "1";
        } else {
            magicNumber = String.valueOf(n1) + n2 + n3;
        }

        System.out.println("Magic Number: " + magicNumber);
        
       
        scanner.close();
    }
}
