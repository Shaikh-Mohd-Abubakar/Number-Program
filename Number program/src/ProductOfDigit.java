import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		int product=1;
		Scanner scanner = new Scanner(System.in);
   int ip	=	scanner.nextInt();
       while (ip!=0) {
		int rem=ip%10;
		product = product*rem;
		ip=ip/10;
		
	}
       System.out.println("product: "+product);
       
       scanner.close();
	}
}
