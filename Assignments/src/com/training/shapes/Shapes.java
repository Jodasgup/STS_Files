package com.training.shapes;

class Circle{
	int radius;
	
	Circle(int radius){
		this.radius=radius;
	}
	
	public void calculateArea() {
		System.out.println("The area of Circle is "+(Math.PI*radius*radius));
	}
}

class Triangle{
	int sides;
	
	Triangle(int sides){
		this.sides=sides;
	}
	
	public void calculateArea() {
		System.out.println("The area of Triangle is "+(0.433*sides*sides));
	}
}

class Square{
	int sides;
	
	Square(int sides){
		this.sides=sides;
	}
	
	public void calculateArea() {
		System.out.println("The area of Square is "+(sides*sides));
	}
}

public class Shapes {
	 int numberOfSides;
	 int sideLength;
	
	public void calculateShapeArea(int side,int length) {
		if(side==1) {
			Circle cr=new Circle(length);
			cr.calculateArea();
		}
		else if(side==3) {
			Triangle tr=new Triangle(length);
			tr.calculateArea();
		}
		else if(side==4) {
			Square sq=new Square(length);
			sq.calculateArea();
		}
		else {
			System.out.println("No Shapes Present");
		}
	}
	
	public static void main(String []args) {
		Shapes sh=new Shapes();
		sh.numberOfSides=3;
		sh.sideLength=12;
		sh.calculateShapeArea(sh.numberOfSides, sh.sideLength);
		
		sh.numberOfSides=4;
		sh.sideLength=15;
		sh.calculateShapeArea(sh.numberOfSides, sh.sideLength);
		
		sh.numberOfSides=5;
		sh.sideLength=15;
		sh.calculateShapeArea(sh.numberOfSides, sh.sideLength);
		
		
		
		
	}
	
	

}
