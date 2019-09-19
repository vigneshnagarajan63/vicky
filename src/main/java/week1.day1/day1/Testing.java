package week1.day1;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input a number: ");
		  int num1 = in.nextInt();
		  for(int i=1; i<=10;i++) {
			  System.out.println(num1+"x"+(i)+"="+(num1*(i)) );
			
		}
	}

}
