package Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start(); // overridden method
		b.stop(); // inherited method
		b.refuel(); // inherited method
		b.autoParking(); // individual method
		b.engine();
		b.tranmissiontype();
		b.lawofGravity();
		BMW.drive();

		Car c = new Car();
		c.start(); // individual method
		c.stop(); // individual method
		c.refuel(); // individual method
		c.engine(); // inherited method
		c.tranmissiontype(); // inherited method
		c.lawofGravity(); // inherited method
		Car.drive();

		Audi a = new Audi();
		a.theftSafety();
		a.sportsMode();
		a.start();
		a.stop();
		a.refuel();
		a.tranmissiontype();
		c.lawofGravity();

		// child class object can be referred by parent class ref name/variable
		// reference type check concept is applied
		// top casting

		Car c1 = new BMW();
		c1.start();
		c1.stop();
		c1.refuel();
		

		// child class object can be referred by grand parent class ref name/variable
		// top casting
		Vehicle v1 = new BMW();
		v1.engine();
		

		// child class object can be referred by great grand parent class ref variable
		Automobile auto = new BMW();
		auto.tranmissiontype();

		// child class object can be referred by great great grand parent class ref
		// variable
		Physics p1 = new BMW();
		p1.lawofGravity();

		// child class object can be referred by great great great grand parent class
		// ref variable
		// top casting
		Science sc = new BMW();
		sc.matterProperties();

		// parent class object can be refered by child class ref name/variable?
		// down casting - not allowed in java at run time
		// BMW b1 = (BMW)new Car(); // ClassCastException
		// b1.start();

		// grand parent class object can be refered by child class ref name/variable?
		// BMW b2 = (BMW)new Vehicle();
	}

}
