import java.util.Scanner;
public class DifferentVariabels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	System.out.println("please enter an integer");
		int one = in.nextInt();
		
	System.out.println("please enter a double");
		double two  = in.nextDouble();
		
	System.out.println("please enter a string");
		String three = in.nextLine();
		
		in.close();
	}
}