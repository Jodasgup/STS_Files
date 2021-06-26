package com.training.shapes;


class Circle1{
	int radius;
	
	Circle1(int radius){
		this.radius=radius;
	}
	
	public void calculateArea() {
		System.out.println("The area of Circle is "+(Math.PI*radius*radius));
	}
}

class Triangle1{
	int sides;
	
	Triangle1(int sides){
		this.sides=sides;
	}
	
	public void calculateArea() {
		System.out.println("The area of Triangle is "+(0.433*sides*sides));
	}
}

class Square1{
	int sides;
	
	Square1(int sides){
		this.sides=sides;
	}
	
	public void calculateArea() {
		System.out.println("The area of Square is "+(sides*sides));
	}
}

public class Switch_shapes {
	 int numberOfSides;
	 int sideLength;
	
	public void calculateShapeArea(int side,int length) {
		
		switch(side) {
		
		case 1:
			Circle cr=new Circle(length);
			cr.calculateArea();
			break;
		case 3:
			Triangle tr=new Triangle(length);
			tr.calculateArea();
			break;
		case 4:
			Square sq=new Square(length);
			sq.calculateArea();
			break;
		default:
			System.out.println("No Shapes Present");
		}
		
	}
	
	public static void main(String []args) {
		Switch_shapes sh=new Switch_shapes();
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
