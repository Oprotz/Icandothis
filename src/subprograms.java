
import java.util.Scanner;

public class subprograms {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);



	System.out.println("What is your first string");
	String first = in.next();

	

System.out.println("WHAT IS YOUR second string");
		String second = in.next();
	System.out.println(combine(first, second));

	


	}

	public static String combine(String first, String second) {

		String three = "";

	for (int i = 0; i < Math.max(first.length(), second.length()); i++) {

	if (i < first.length()) {
		three += first.charAt(i);

			}

		three += second.charAt(i);

		}

	

return three;
	}

}