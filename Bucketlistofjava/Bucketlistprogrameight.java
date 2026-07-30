package journeybegins;

import java.util.Scanner;

public class SimpleEncryption {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        for (; temp != 0; temp /= 10) {
            sum += temp % 10;
        }

        temp = num;
        int encrypted = 0;
        int place = 1;

        if (num == 0) {
            encrypted = sum % 10;
        } else {
            for (; temp != 0; temp /= 10) {
                int digit = temp % 10;
                digit = (digit + sum) % 10;
                encrypted += digit * place;
                place *= 10;
            }
        }

        System.out.println("Digit Sum = " + sum);
        System.out.println("Encrypted Number = " + encrypted);

        sc.close();
    }
}
