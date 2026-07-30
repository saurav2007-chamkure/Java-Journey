package journeybegins;

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner hello = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = hello.nextInt();

        int count = 0;
        int temp = num;

        if (temp == 0) {
            count = 1;
        } else {
            for (; temp != 0; temp /= 10) {
                count++;
            }
        }

        System.out.println("Number of digits = " + count);

        hello.close();
    }
}
