package week1.day1;

public class Twowheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 894765843;
	boolean isPunctured = false;
	String bikeName = "Hero Honda";
	double runningKM = 40.5;

	public void twoWheelerDet() {
		System.out.println("No Of Wheels= " + noOfWheels);
		System.out.println("No of Mirrors=" + noOfMirrors);
		System.out.println("Chasis Number= " + chassisNumber);
		System.out.println("Punctured or Not= " + isPunctured);
		System.out.println("Bike Name = " + bikeName);
		System.out.println("Running Milege= " + runningKM);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Twowheeler myTwoWheeler = new Twowheeler();
		myTwoWheeler.twoWheelerDet();

	}

}
