package co.micol.inheritance;

public class MainApp {

	public static void main(String[] args) {
		Car bus = new Bus();
		bus.car();
//		bus.speed();  //부모 중심으로 불러오면 버스클래스 자체에 있는 스피드는 불러오지 못한다.
		
		
		Bus bus1 = new Bus();
		bus1.car();
		bus1.speed();
		
		Car taxi = new Taxi();
		taxi.car();
		

	}

}
