
import java.util.Scanner;

public class subprograms {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);



	System.out.println("What is the first string:");
	String Uno = in.next();

	

	System.out.println("What is the second string:");
		String Dos = in.next();
	System.out.println(combine(Uno, Dos));

	


	}

	

	public static String combine(String Uno, String Dos) {

		String Tres = "";

	for (int i = 0; i < Math.max(Uno.length(), Dos.length()); i++) {

			if (i < Uno.length()) {
		Tres += Uno.charAt(i);

			}

		Tres += Dos.charAt(i);

		}

	

return Tres;
	}

}