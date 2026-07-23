package journeybegins;
  
  import java.util.Scanner;
  public class Scannertest 
  {
  public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter two first Number:");
		int a = sc.nextInt();
		
		System.out.print("Enter two Second Number:");
		int b = sc.nextInt();
		
		int sum = a+b;
		
		System.out.println("Addition of two numbers:" + sum);
		
		sc.close();
	}

}
