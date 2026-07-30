package journeybegins;

import java.util.Scanner;

public class LargestDigit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;
        }

        int largest = 0;

        for (; num != 0; num /= 10) {
            int digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }
        }

        System.out.println("Largest digit = " + largest);

        sc.close();
    }
}
