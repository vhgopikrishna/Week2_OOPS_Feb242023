package Week2_OOPS_Feb242023;

import java.util.Scanner;

public class Challenge15_EncapsulationImpl {

		private int age;
		private boolean decision;
		
		public void setAge(int age) {
			this.age = age;
		}
		
		public void setDecision(boolean decision) {
			this.decision = decision;
		}
		
		public int getAge() {
			return age;
		}
		
		public boolean getDecision() {
			return decision;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int personage;
		Challenge15_EncapsulationImpl e = new Challenge15_EncapsulationImpl();
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		personage = sc.nextInt();
		
		e.setAge(personage);
		if(e.getAge() <= 60)
		{
			e.setDecision(true);
		}
		else
		{
		e.setDecision(false);
		}
		
		System.out.println("Age of candidate is "+e.getAge());
		System.out.print("Driving license can be issued to the candidate "+e.getDecision());
	}

}
