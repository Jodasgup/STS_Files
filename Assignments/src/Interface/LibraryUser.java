package Interface;

interface LibraryUser{
	public void registerAccount(int age);
	public void requestBook(String bookType);
}

class KidUsers implements LibraryUser{
	public int age ;
	public String bookType;
	
	public void registerAccount(int age){
		if(age<12) {
			System.out.println("You have successfully registered under a Kids Account");
		}
		else {
			System.out.println("Sorry, Age must be less than 12 to register as a kid");
		}
	}
	public void requestBook(String bookType) {
		if(bookType=="kids"){
			System.out.println("Book Issued successfully, please return the book within 10 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
	}
}

class AdultUsers implements LibraryUser{
	public int age ;
	public String bookType;

	public void registerAccount(int age){
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}
		else {
			System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
		}
	}
	public void requestBook(String bookType) {
		if(bookType=="fiction"){
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult fiction books");
		}
	}
}
 class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryUser kid = new KidUsers();
		kid.registerAccount(10);
		kid.registerAccount(18);

		LibraryUser kid1 = new KidUsers();
		kid1.requestBook("kids");
		kid1.requestBook("fiction");
		
		LibraryUser adult = new AdultUsers();
		adult.registerAccount(5);
		adult.registerAccount(23);
		
		LibraryUser adult1 = new AdultUsers();
		adult1.requestBook("kids");
		adult1.requestBook("fiction");
	}

}