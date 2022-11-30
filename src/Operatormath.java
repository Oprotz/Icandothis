import java.util.Scanner;

public class Operatormath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("please enter your favourite number at random");
		
		int first = in.nextInt();

		int number = first;
		
		number = number -1;
		System.out.println(first+" "+"-"+" "+1+" "+"="+" "+number);
		
		number = number *3;
		System.out.println();
		
		number = number + 12;
		number = number/3;
		number = number +5;
		number = number - first;
		
		System.out.println("Your result is: "+number);
		
	 System.out.println("hahahahaha the answer will always be 8");
	 System.out.println("try again PLease");
		in.close();
	}

	
}