package journeybegins;
import java.util.Scanner;

public class ZeroToThousandsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0 and 1000: ");
        int number = input.nextInt();

        int sum = 0;

        for (; number > 0; number /= 10) {
            sum += number % 10;
        }

        System.out.println("The sum of the digits is " + sum);

        input.close();
    }
}
