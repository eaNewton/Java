public class Area {
	
	// Area of a Circle
	public static double getArea(double radius) {
		return Math.PI * radius * radius;
	}
	
	// Area of a Rectangle
	public static double getArea(int length, int width) {
		return length * width;
	}
	
	// Area of a Cylinder
	public static double getArea(double radius, double height) {
		return Math.PI * radius * radius * height;
	}
	
	public static void main(String[] args) {
		//Circle
		System.out.printf("The area of a circle with a radius of 5.0u is %.2fu\n", Area.getArea(5.0));
		
		//Rectangle
		System.out.printf("The area of a rectangle with a length of 10u and a height of 5u is %.2fu\n", 
			Area.getArea(10, 5));
			
		//Cylinder
		System.out.printf("The area of a cylinder with a radius of 5.0u and a height of 10.0u is %.2fu\n", 
			Area.getArea(5.0, 10.0));
	}
}