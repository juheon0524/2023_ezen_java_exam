package ex05;

public class Car {
	private Tire tire1 = new Tire();
	
	private Tire tire2 = new Tire() {
		public void roll() {
			System.out.println("익명 타이어 굴러감...");
		};
	};
	
	private Tire tire2_2 = new SubTire();
	
	public void run1() {
		tire1.roll();
		tire2.roll();
		tire2_2.roll();
	}
	
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 객체2 타이어 굴러감..");
			}
		};
		tire.roll();
	}
	
	public void run3(Tire tire) {
		tire.roll();
		tire2_2.roll();
	}
}
