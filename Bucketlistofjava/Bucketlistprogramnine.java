package journeybegins;

import java.util.Scanner;

public class DigitSumPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        for (; temp != 0; temp /= 10) {
            sum += temp % 10;
        }

        int original = sum;
        int reverse = 0;

        for (; original != 0; original /= 10) {
            reverse = reverse * 10 + (original % 10);
        }

        System.out.println("Digit Sum = " + sum);

        if (sum == reverse) {
            System.out.println("Digit sum is a Palindrome.");
        } else {
            System.out.println("Digit sum is not a Palindrome.");
        }

        sc.close();
    }
}
