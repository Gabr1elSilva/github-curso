package entitites;

public class Product_01 {

	public double width;
	public double height;

	public double areaRetangle() {
		return width * height;
	}

	public double perimeteRetangle() {
		return width * 2 + height * 2;
	}

	public double diagonalRetangle() {
		return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
	}

	public String toString() {
		return String.format("Area = %.2f%n", areaRetangle()) + String.format("Perimeter = %.2f%n", perimeteRetangle())
				+ String.format("Diagonal = %.2f", diagonalRetangle());
	}
}
