package Programing1Project;

import java.util.Scanner;

public class MyProgram5 {

	public static int findMajorityElement(int[] nums) {
        int majorityElement = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    majorityElement = nums[i];
                    count = 1;
                }
            }
        }

        return majorityElement;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int majorityElement = findMajorityElement(nums);
        System.out.println("The majority element is: " + majorityElement);

        scanner.close();
    }

}
