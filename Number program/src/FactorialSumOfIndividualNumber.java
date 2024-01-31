import java.util.Scanner;

import org.w3c.dom.ls.LSOutput;

public class FactorialSumOfIndividualNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int fact=1;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			
			for(int i=rem; i>0; i--)
			{
				fact=fact*i;
			}
			num=num/10;
		}
		sum= sum+fact;
		System.out.println(sum);
	}
}
