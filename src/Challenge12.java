package Week2_OOPS_Feb242023;

class A{
	void Car() {
		System.out.println("Iam method A");
	}
}

class B extends A{
	void Car() {
		System.out.println("Iam method B");
	}
}

public class Challenge12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A obj = new A();
		A obj1 = new B();
		
		obj.Car();
		obj1.Car();

	}

}
