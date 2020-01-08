package co.micol.inheritance;

public class Bus extends Car {
	
	
	public Bus() {
		chair = 40;
		engine = "8000CC";
		System.out.println("나는 버스 임.");
		
	}
	
	public void speed() {
		System.out.println("속도는 60Km");
		
	}

}
