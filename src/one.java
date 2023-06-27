
import java.math.BigInteger;
public class one {
	
	public static void extraLongFactorials(int n) {
	    // Write your code here
		BigInteger factorial = BigInteger.ONE;
	    for (int i = 1; i <= n; i++) {
	      factorial = factorial.multiply(BigInteger.valueOf(i));
	    }
	    System.out.println(factorial);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		extraLongFactorials(25);
		 

	}

}
