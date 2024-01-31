
public class Count_Number_Of_Even_And_Odd_Digit {

	
	public static void main(String[] args) {
		int a=12345;
		int evencount=0;
		int oddcount=0;
		while (a!=0) {
			int rem=a%10;
			if (rem%2==0) {
				evencount++;
			} else {
	                 oddcount++;
			}
			a=a/10;
		}
		
		System.out.println("evencount "+evencount+" oddcount "+oddcount);
	}
	}

