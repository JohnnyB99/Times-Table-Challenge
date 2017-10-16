import java.util.Scanner;
import java.util.Random;

public class timestablechallenge {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		Random rnd=new Random();

		//Setup Variables
		int hi;
		int low;
		int x;

		System.out.println("High number?");
		hi=in.nextInt();
		System.out.println("Low number?");
		low=in.nextInt();
	
		for (x=low;x<=hi;x++) {
			System.out.print("	"+x+" ");
		}
		for (x=low;x<=hi;x++) {
			System.out.print("\n"+x+"");
			for(int y=low;y<=hi;y++) {
				System.out.print("	"+y*x+"");
			}

		}


	}
}









