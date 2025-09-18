package abstraction;

abstract class GraphicObject {
	abstract void showShape();
	abstract double getArea(int length,int breadth);
}

public class AbstractCircle extends GraphicObject {
	void showShape() {
		System.out.println("I am a circle");
	}
	double getArea(int length,int breadth) {
		return length*breadth*3.14;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractCircle obj = new AbstractCircle();
		int radius=5;
		obj.showShape();
		double area=obj.getArea(radius,radius);
		System.out.println("Area with radius "+radius+" is "+area);
	}

}
