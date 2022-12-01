import java.util.Random;
public class repititionINnumbres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int random1 = rnd.nextInt(9)+1;
		int random2 = rnd.nextInt(9)+1;
		int random3 = rnd.nextInt(9)+1;
		
		System.out.println("The first set of numbers you have are "+random1 +" "+random2+" "+random3);
		
		int random4 = rnd.nextInt(9)+1;
		int random5 = rnd.nextInt(9)+1;
		int random6 = rnd.nextInt(9)+1;
		
		int counter = 0;
		
		System.out.println("the seconed set is  "+random4+" "+random5+" "+random6);
		
		while (random1!=random4 || random2!=random5 || random3!=random6) {
			random4 = rnd.nextInt(9)+1;
			random5 = rnd.nextInt(9)+1;
			random6 = rnd.nextInt(9)+1;
		
		counter++;
		}
		
		System.out.println("the total times the set of numbers ran is "+ counter);
		
	}

}