import java.util.Random;

public class Generate_Random_Number {
public static void main(String[] args) {
	

	//first Approch
	//System.out.println(Math.random());
	
	//second  Approch
	
	Random random = new Random();
 boolean b=	random.nextBoolean();
 
 System.out.println(b);
 System.out.println(random.nextDouble());
 System.out.println(random.nextInt());
 System.out.println(random.nextLong());
	
}
}