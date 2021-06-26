package Assignment5;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		double fees;
		int checks;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the total number of checks written in month :");
		checks = sc.nextInt();
		if(checks<=20)
		{
			fees = 10 + (checks*0.10);
			System.out.println("Bank's service fee for this month : $" +fees);
		}
		if(checks>=21 && checks<=39)
		{
			fees = 10 + (checks*0.8);
			System.out.println("Bank's service fee for this month : $" +fees);
		}
		if(checks>=40 && checks<=59)
		{
			fees = 10 + (checks*0.6);
			System.out.println("Bank's service fee for this month : $" +fees);
		}
		if(checks>=60)
		{
			fees = 10 + (checks*0.4);
			System.out.println("Bank's service fee for this month : $" +fees);
		}
		sc.close();

	}
}
