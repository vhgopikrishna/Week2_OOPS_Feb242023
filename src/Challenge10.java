package Week2_OOPS_Feb242023;
class InheritanceA{
	static final float pi = (float) 3.14;
	void circleArea(float r) {
		 System.out.println("Area of circle is "+pi*r*r);
	}
}

class InheritanceB extends InheritanceA{
	void rectangleArea(float l, float b) {
		System.out.println("Area of rectangle is "+(l*b));
	}
}

class InheritanceC extends InheritanceB{
	void triangleArea(float h, float b) {
		System.out.println("Area of triangle is "+((h*b)/2));
	}
	
}
public class Challenge10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceC objC = new InheritanceC();
		objC.circleArea((float) 6.40);
		objC.rectangleArea((float)2.4,(float)3.6);
		objC.triangleArea((float)10.0, (float)20.0);
	}

}
