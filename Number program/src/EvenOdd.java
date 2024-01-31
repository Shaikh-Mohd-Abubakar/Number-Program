import java.util.Scanner;

public class EvenOdd {

	public static void check(int input)
	{
       if (input%2==0) {
		
    	   System.out.println("even");
	} else {
            System.out.println("odd");
	}
	}
	public static void main(String[] args) {
		
		//EvenOdd evenOdd = new EvenOdd();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number");
		check(scanner.nextInt());
		scanner.close();
	}
}
