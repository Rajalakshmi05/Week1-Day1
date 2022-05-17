package week1.day1;

public class car {
	byte maxSpeed = 100;
	short SeatingCapacity = 4;
	int price = 800000;
	long ownerMobile = 987675654;
	float mileage = 20.5f;
	double distanceCovered = 14263.456;
	char fuelType = 'D';
	boolean ispetrolEngine = true;

	public void applyBreak() {
		System.out.println("Price= " + price);
		System.out.println("Fuel Type= " + fuelType);
	}

	public void applyGear() {
		System.out.println("Max Speed= " + maxSpeed);
		System.out.println("Is this Petrol Engine or Not= " + ispetrolEngine);
	}

	public void switchonAc() {
		System.out.println("Owner Phone Number=" + ownerMobile);
		System.out.println("Seating Capacity is= " + SeatingCapacity);

	}

	public void applyAcclerate() {
		System.out.println("Distance Covered= " + distanceCovered);
		System.out.println("Mileage Covered= " + mileage);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside Main method");
		car myCar = new car();
		myCar.applyBreak();
		myCar.applyGear();
		myCar.switchonAc();
		myCar.applyAcclerate();

	}

	public void myCar() {
		car c = new car();
		c.applyBreak();
		c.applyGear();
		c.switchonAc();
		c.applyAcclerate();

	}
}
