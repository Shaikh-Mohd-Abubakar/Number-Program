import java.util.Scanner;

public class CheckPolindrome {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input=scanner.nextInt();
		int store=input;
//		int z=0;
//		while (input!=0) {
//			int rem=input%10;
//			z=(z*10)+rem;
//		input=input/10;
//		}
//		if (z==store) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not Palindrome");
//		}
		StringBuffer stringBuffer = new StringBuffer(String.valueOf(input));
		StringBuffer reverse=stringBuffer.reverse();
		System.out.println(stringBuffer);
		if (reverse.equals(store)) {
			System.out.println("palindrome");
		} else {
 System.out.println("not");
		}
	}
}
