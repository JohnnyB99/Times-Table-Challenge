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
		int num;
		int x;

		System.out.println("High number?");
		hi=in.nextInt();
		System.out.println("Low number?");
		low=in.nextInt();

		//Loop and ask questions
		for (x=low;x<=hi;x++) {
			System.out.print("	"+x+"  ");			
		}
		for (x=hi;x>=low;x++) {
			
		}
		while (x<=hi) {
			x++;

		}
		for (x=low;x<=hi;x++) {
			System.out.println(""+x+"");			
		}
		for (x=hi;x>=low;x++) {
			
		}
		while (x<=hi) {
			x++;


	}
}}









