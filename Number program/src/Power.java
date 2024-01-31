//import javax.sql.rowset.JoinRowSet;

public class Power {
public static void main(String[] args) {
	
	int base=2;
	int raise=5;
	int power=1;
	while (raise!=0) {
		power=power*base;
		raise--;
	}
	System.out.println(power);
}
}
