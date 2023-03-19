package Week2_OOPS_Feb242023;

class Tourism{
	private String country;
	private String nationalAnthem;
	private String touristSpot;
	
	public void setAnthem(String nationalAnthem) {
		this.nationalAnthem = nationalAnthem;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getAnthem() {
		return nationalAnthem;
	}
	
	public String getTouristSpot() {
		return touristSpot;
	}
}

public class Challenge14_Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tourism t = new Tourism();
		t.setCountry("India");
		t.setAnthem("Jana gana mana...");
		t.setTouristSpot("Agra");
		System.out.print(t.getCountry()+"\n"+t.getAnthem()+"\n"+t.getTouristSpot());

	}

}
