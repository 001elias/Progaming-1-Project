package Programing1Project;

import java.util.Scanner;

public class MyProgram6 {

	public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = (n * (n + 1)) / 2; 
        int actualSum = 0;

        
        for (int num : nums) {
            actualSum += num;
        }

        
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

       
        int[] nums = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        
        int missingNumber = findMissingNumber(nums);
        System.out.println("Missing number: " + missingNumber);
        
        System.out.println("Explanation: n = " + n + " since there are " +n + " numbers, so all numbers are in the range [0,"+n+"]. " + 
        missingNumber + " is the missing number in the range since it does not appear in nums");

        scanner.close();
    }

}
