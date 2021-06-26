package Assignment5;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {
		int num,points;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of books purchased in this month :");
		num = sc.nextInt();
		if(num==0) {
			System.out.println("Sorry you have 0 points , start purchasing to earn points !");
		}
		if(num==1) {
			points = 5;
			System.out.println("your points for this month is :" +points);
		}
		if(num==2) {
			points = 15;
			System.out.println("your points for this month is :" +points);
		}
		if(num==3) {
			points = 30;
			System.out.println("your points for this month is :" +points);
		}
		if(num>=4) {
			points = 60;
			System.out.println("your points for this month is :" +points);
		}
		
		sc.close();

	}

}
