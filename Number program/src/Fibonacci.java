import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	int ip=scanner.nextInt();
	long a=0,b=1,c;
	while (ip>0) {
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		ip--;
	}
	scanner.close();
}
}
