import java.util.Scanner;
public class SelectionANDtaxs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		System.out.println("please enter your final gross or $ for tax");
		int number = in.nextInt();
		double tax = 0;
		double remainder = 0;
		
			double tax15=0;
			double tax205=0;
			double tax26=0;
			double tax29=0;
			double tax33=0;
		
		if (number <=49020) {
		tax15 = number * 0.15;
		remainder = number-tax15;
		
			if (remainder >49020 && remainder <=98040) {
			tax205 = remainder * 0.205;
			
			}
			
			else if (remainder >49020 && remainder >98940) {
				
				
			}
			
			
		}
		
		
		tax = tax15 + tax205+tax26+tax29+tax33;
		System.out.println(tax);
		System.out.println("here is your final price with tax included,I know its a lot");
		in.close();
		
	}

}
