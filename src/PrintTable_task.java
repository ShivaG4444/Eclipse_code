import java.util.Scanner;

public class PrintTable_task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int i=0;
		int n;
		System.out.println("Enter the number....");
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();

		System.out.println("via for loop");
		for ( i = 1; i <= 10; i++) {
			System.out.println(n + " " + "*" + " " + i + " " + "=" + (n * i));
		}

	
	System.out.println("via while loop");
	i=1;while(i<=10)
	{
		System.out.println(n + " " + "*" + " " + i + " " + "=" + (n * i));
		i++;
	}
	
	System.out.println("via do while loop");
	i = 1;
	do
	{
		System.out.println(n + " " + "*" + " " + i + " " + "=" + (n * i));
		i++;
	}while(i<=10);

}
}
