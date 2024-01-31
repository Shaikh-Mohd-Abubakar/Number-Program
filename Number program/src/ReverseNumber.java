import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int ip=scanner.nextInt();
		while (ip!=0) {
		int	rem=ip%10;
		System.out.print(rem);
		ip=ip/10;
		}
	}
}
