package abstraction;

public class AbstractTriangle extends GraphicObject {
	void showShape() {
		System.out.println("I am a triangle");
	}

	double getArea(int len, int brdth) {
		double area = (len * brdth) / 2;
		return area;
	}

	public static void main(String[] args) {
		AbstractTriangle obj = new AbstractTriangle();
		obj.showShape();
		int length = 10;
		int breadth = 3;
		double area = obj.getArea(length, breadth);
		System.out.println("Area with length " + length + " and breadth " + breadth + " is " + area);
	}

}
