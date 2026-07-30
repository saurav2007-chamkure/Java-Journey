package journeybegins;

import java.util.Scanner;

public class SameDigitSum {

    public static int reverse(int n) {
        int rev = 0;

        for (; n != 0; n /= 10) {
            rev = rev * 10 + (n % 10);
        }

        return rev;
    }

    public static int digitSum(int n) {
        int sum = 0;

        for (; n != 0; n /= 10) {
            sum += n % 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int num = sc.nextInt();

        int reversed = reverse(num);
        int targetSum = digitSum(reversed);

        System.out.println("Numbers having the same digit sum:");

        for (int i = 0; i <= 1000; i++) {
            if (digitSum(i) == targetSum) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
