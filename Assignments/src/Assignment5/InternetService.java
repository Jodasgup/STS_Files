package Assignment5;
import java.util.Scanner;

public class InternetService {
	int ch ;
	double hours ;
	double charge;

	InternetService(int choice, double h){
		this.ch = choice;
		this.hours = h;
	}
	public double charges() {
		switch (ch) {
		case 1 : 	if(hours<=10) {
			charge = 9.95;
					}
					else {
					hours = hours - 10;
					charge = 9.95 + (hours*2);
				 	} 
					break;
		
		case 2 : 	if(hours<=20) {
					charge = 13.95;;
					}
		 			else {
		 			hours = hours - 20;
		 			charge = 13.95 + (hours*1);
		 			}
					break;
					
		case 3 :	charge = 19.95;
					break;
					
		default :	System.out.println("Wrong Choice !");
					break;
		
		}return charge;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your package...");
		System.out.println("Enter 1 for package A");
		System.out.println("Enter 2 for package B");
		System.out.println("Enter 3 for package C");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		System.out.println("Enter total hours :");
		double h =sc.nextDouble();
		InternetService is = new InternetService(choice,h);
		System.out.println("Total charges: " +is.charges());
		sc.close();

	}

}