package Abstraction;
abstract class GeneralBank{
abstract void getSavingInterestRate();
abstract void getFixedInterestRate();

}

class ICICIBank extends GeneralBank{

	public void getSavingInterestRate(){
		System.out.println("Saving 4%");
	}
	public void getFixedInterestRate(){

		System.out.println("Fixed 8.5%");
	}
}

class KotMBank extends GeneralBank{

	public void getSavingInterestRate(){
		System.out.println("Saving 6%");
	}

	public void getFixedInterestRate(){

		System.out.println("Fixed 9%");
	}
}

class Banks{
	public static void main(String args[]){

	//a	
	ICICIBank ob=new ICICIBank();
	ob.getSavingInterestRate();
	ob.getFixedInterestRate();

	System.out.println("------------------------");
	
	//b
	KotMBank ob1=new KotMBank();
	ob1.getSavingInterestRate();
	ob1.getFixedInterestRate();
	
	System.out.println("------------------------");

	GeneralBank ob3=new KotMBank();
	ob3.getSavingInterestRate();
	ob3.getFixedInterestRate();

	System.out.println("------------------------");

	GeneralBank ob4=new ICICIBank();
	ob4.getSavingInterestRate();
	ob4.getFixedInterestRate();
	}
}