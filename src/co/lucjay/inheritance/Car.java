package co.lucjay.inheritance;

public class Car {
	public int chair; // 의자수
	public String engine; // 엔진마력

	public Car() {
	}

	public void run() {
		System.out.println("달린다");
	}

	public void stop() {
		System.out.println("차가 멈춘다");
	}

	public void car() {
		run();
		stop();
	}
}
