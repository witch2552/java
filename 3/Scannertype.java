import java.util.Scanner;
public class Scannertype{
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str = s.nextLine();
        System.out.println("String :"+str);

		Scanner i = new Scanner(System.in);
		System.out.println("enter the integer");
		int integer = i.nextInt();
        System.out.println("integer :"+integer);



		Scanner f = new Scanner(System.in);
		System.out.println("enter the floating");
		float floating = f.nextFloat();
        System.out.println(" floating :"+floating);
	
	}
}