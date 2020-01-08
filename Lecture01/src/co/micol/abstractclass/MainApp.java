package co.micol.abstractclass;

public class MainApp {

	public static void main(String[] args) {
		Animal rabit = new Rabit();
		rabit.eat();
		rabit.run();
		
		Animal bird = new Bird();
		bird.eat();
		bird.run();
		
		
		Bird bird1 = new Bird();
		bird1.run();
		

	}

}
