import java.util.Scanner;

public class RangeOfAscii {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a starting");
		int start = scanner.next().charAt(0);
		System.out.println("enter a ending");
		int end = scanner.next().charAt(0);
		while (start<=end) {
			
			System.out.println(start+"========="+(char)start);
			start++;
		}
		
	}
}
