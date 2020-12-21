//Here the method of square is calling of Operation class.
//Code reuse is also best achieved by aggregation when there is no is-a relationship.
//Inheritance should be used only if the relationship is-a is maintained throughout the lifetime of the objects involved; 
//otherwise, aggregation is the best choice.

package Agregession;

public class Circle {
	
	Operation op;
	double pi=3.14;
	 
	double area(int radius) {
		op=new Operation();
		int rsquare=op.square(radius);
		return pi*rsquare;
	}
	public static void main(String[]args) {
		Circle c=new Circle();
		double arearesult=c.area(5);
		System.out.println(arearesult);
	}

}
