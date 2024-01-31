import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a character ");
		char input = scanner.next().charAt(0);
		int newinput = input;
		scanner.close();

		System.out.println("Ascii value of " + input + " is " + newinput);

	}
}
