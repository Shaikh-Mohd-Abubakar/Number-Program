import java.util.Scanner;
public class ExtractDigit {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int ip=scanner.nextInt();
	while (ip!=0) {
		 int rem=ip%10;
		 System.out.println(rem);
		 ip=ip/10;		 
	}
	scanner.close();
}
}
