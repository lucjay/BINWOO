package co.lucjay.inheritance;

public class MainApp {
	public static void main(String[] args) {
		Car bus = new Bus();
		bus.car();

		Bus bus1 = new Bus();
		bus1.car();
		bus1.speed();

		Car taxi = new Taxi();
		taxi.car();
	}
}
