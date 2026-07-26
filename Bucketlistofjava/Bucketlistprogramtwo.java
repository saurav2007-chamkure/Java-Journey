package journeybegins;

import java.util.Scanner;

public class ReverseInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int reverse = 0;

        for (; number != 0; number = number / 10) {
            reverse = reverse * 10 + (number % 10);
        }

        System.out.println("Reversed number: " + reverse);

        sc.close();
    }
}
