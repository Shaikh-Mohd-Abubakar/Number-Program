import java.util.Scanner;

public class Largest_Of_Three_Number {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a=scanner.nextInt();
		System.out.println("enter a second number");
		int b=scanner.nextInt();
		System.out.println("enter a thidr number");
		int c= scanner.nextInt();
		
//		if (a>b && a>c) {
//			System.out.println("a is bigger "+a);
//		}
//		else if (b>a && b>c) {
//			System.out.println("b is greater "+b);
//		}
//		else {
//			System.out.println("c is greater "+c);
//		}
//		
		//second Approch
		
		int largest=a>b?a:b;
		int largest1=largest>c?largest:c;
		
		System.out.println(largest1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
