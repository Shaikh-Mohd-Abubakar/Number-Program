import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("write a character");
		char input = scanner.next().charAt(0);
		scanner.close();
		if (input >= 'a' && input <= 'z') {
			System.out.println("character is in lower case");
		} else if (input >= 'A' && input <= 'Z') {
			System.out.println("character is in uppercase");
		} else if (input >= '0' && input <= '9') {
			System.out.println("character is digit");
		} else {
			System.out.println("character is special");
		}

	}
}
