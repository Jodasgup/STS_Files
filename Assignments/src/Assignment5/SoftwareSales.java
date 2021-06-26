package Assignment5;
import java.util.Scanner;

public class SoftwareSales {
	int quantity;
	int discount;
	int retail = 99;
	double amount = 0;
	
	SoftwareSales(int q){
		this.quantity = q;
	}
	
	public void Amount() {
		if(quantity==00 || quantity<=9) {
			System.out.println("Discount = 0" );
			System.out.println("Total Amount = " +99*quantity );
		}
		if(quantity>=10 && quantity<=19) {
			retail = retail*quantity;
			discount = (retail*20)/100;
			amount = retail - discount;
			System.out.println("Discount = " +discount);
			System.out.println("Total Amount = " +amount);
		}
		if(quantity>=20 && quantity<=49) {
			retail = retail*quantity;
			discount = (retail*30)/100;
			amount = retail - discount;
			System.out.println("Discount = " +discount);
			System.out.println("Total Amount = " +amount);
		}
		if(quantity>=50 && quantity<=99) {
			retail = retail*quantity;
			discount = (retail*40)/100;
			amount = retail - discount;
			System.out.println("Discount = " +discount);
			System.out.println("Total Amount = " +amount);
		}
		if(quantity>=100) {
			retail = retail*quantity;
			discount = (retail*50)/100;
			amount = retail - discount;
			System.out.println("Discount = " +discount);
			System.out.println("Total Amount = " +amount);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of quantity :");
		int q = sc.nextInt();
		SoftwareSales ss = new SoftwareSales(q);
		ss.Amount();
		sc.close();
	}
}
