public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;

	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}

	public Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}

	public double getside1() {
		return this.side1;
	}

	public double getside2() {
		return this.side2;
	}

	public double getside3() {
		return this.side3;
	}
	
	
	//getPerimeter and getArea swapped in order since the formula I found for calculating 
	//a triangles area given only sides (Heron's Formula) requires frequent use of the perimeter.
	
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}
	
	public double getArea() {
		return java.lang.Math.sqrt(getPerimeter()*
				(getPerimeter() - this.side1)*
				(getPerimeter() - this.side2)*
				(getPerimeter() - this.side3));
	}
	
	public String toString(){
		return("This triangle has a perimeter of " + getPerimeter() + " and an area of " + getArea());
	}
	
}

	
