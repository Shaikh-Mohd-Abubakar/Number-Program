import java.util.Scanner;

public class AddDigit {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int ip = scanner.nextInt();
		int sum = 0;
		while (ip != 0) {
			int rem = ip % 10;
			sum = sum + rem;
			ip = ip / 10;
		}
		System.out.println(sum);
	}
}
