
public class CarDriver {

	public static void main(String[] args) {
		
		Car Carobject = new Car(); //instantiation sets carobject = to the first car constructor
		System.out.println(Carobject);
		Car Carobject2 = new Car("black",300, "v6"); // sets object2 to the second constructor. we input the values of the variables here.
		System.out.println(Carobject2);
		Car Carobject3 = new Car();
	    System.out.println(Car.getCount());
		System.out.println(Carobject.equals(Carobject3));
	}

}
