import java.util.Scanner;
import java.lang.Math.*;

public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm your methods are working correctly.

	public static void main(String[] args) {
		
		System.out.println("Please enter the radius of the circle");
		Scanner scan = new Scanner(System.in);

		float radius = scan.nextFloat();

		System.out.println("Radius of the circle is: " + radius + " cm");
		System.out.println("Diameter of the circle is: " + Diameter(radius) + " cm");
		System.out.println("Circumference of the circle is: " + Circumference(radius) + " cm");
		System.out.println("Area of the circle is: " + Area(radius) + " sq.cm");
	}

	public static float Diameter(float radius){
		float diameter_ = 2 * radius;
		return diameter_;
	}

	public static double Circumference(float radius){
		double circumference_ = 2 * Math.PI * radius;
		return circumference_;
	}

	public static double Area(float radius){
		double area_ = Math.PI * radius * radius;
		return area_;
	}
	

}
