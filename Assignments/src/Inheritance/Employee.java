package Inheritance;

public class Employee {

String employeeAddress,employeeName;
long employeePhone,employeeId;
double basicSal,specialAllowance=250.80,Hra=1000.50;

Employee(long Id,String Name,String Address,long Phone,double Salary){
	this.employeeId=Id;
	this.employeeName=Name;
	this.employeeAddress=Address;
	this.employeePhone=Phone;
	this.basicSal=Salary;
}
public void calculateSalary() {
	double salary=basicSal+(basicSal*specialAllowance/100)+(basicSal*Hra/100);
	System.out.println(salary);
}
public void calTransportAllowance() {
	double transportAllowance=10*basicSal/100;
	System.out.println(transportAllowance);
}
}



 class Manager extends Employee {

	Manager(long Id, String Name, String Address, long Phone,double Salary) {
		super(Id, Name, Address, Phone,Salary);
		// TODO Auto-generated constructor stub
	}
	//override
	public void calTransportAllowance() {
		double transportAllowance=15*basicSal/100;
		System.out.println(transportAllowance);

}
}



 class Trainee extends Employee {

	Trainee(long Id, String Name, String Address, long Phone, double Salary) {
		super(Id, Name, Address, Phone, Salary);
		// TODO Auto-generated constructor stub
	}

}




 class InheritanceActivity {
public static void main(String[] args) {
	Manager m=new Manager(126534,"peter","Chennai India",237844,65000);
	m.calculateSalary();
	Trainee t=new Trainee(29846, "Jack", "Mumbai India", 442085, 45000);
	t.calculateSalary();
	m.calTransportAllowance();
	t.calTransportAllowance();
}
}
