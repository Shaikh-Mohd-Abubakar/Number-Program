import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int ip = scanner.nextInt();
		
		int fact=1;
		
		while (ip!=0) {
			fact=fact*ip;
			ip--;
		}
		System.out.println(fact);
	}
}
