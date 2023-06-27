package Assign_Pradeep;

public class Calculator_main {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		
		int res1=cal.add(3, 2);
		int res2=cal.sub(10, 4);
		int resfinal=cal.mul(res1, res2);
		
		System.out.println("Final result: "+resfinal);

	}

}
