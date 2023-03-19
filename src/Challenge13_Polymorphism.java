package Week2_OOPS_Feb242023;

public class Challenge13_Polymorphism {

	int area(int l,int b) {
		return l*b;
	}
	
	int area(int l,int b,int h) {
		return l*b*h;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Challenge13_Polymorphism p = new Challenge13_Polymorphism();
		System.out.println("Area of rectangle = "+p.area(10, 10));
		System.out.println("Area of rectangular cuboid = "+p.area(10, 10, 10));

	}

}
