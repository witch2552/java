import java.util.*;
public class LineofI{
	

	public static void main(String[] args) {
		int sum = 0;
		int integer;
		System.out.println("enter elemen :");
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();

		StringTokenizer tokenizer = new StringTokenizer(line);

		while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            int number = Integer.parseInt(token);
            System.out.println(number);
            sum += number;
        }
		   System.out.println("Sum of all integers: " + sum);
	}
}