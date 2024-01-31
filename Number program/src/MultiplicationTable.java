import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		int input=scanner.nextInt();
		scanner.close();
		
		int i=1;
		while (i<=10) {
			int result=input*i;
			System.out.println(input+"X"+i+"="+result);
			i++;
		}
	}
}
