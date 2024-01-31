
public class SwapToNumber {

	public static void main(String[] args) {
		
		int a=20;
		int b=70;
		
		//using third variable
//		int t=a;
//		 a=b;
//		b=t;
//		System.out.println(a+"  "+b);
		
		//without using third variable
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+"  "+b);
	}
}
