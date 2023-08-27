package week1.day1Assignments;
public class TwoWheeler {
	int noOfWheels;
	short noOfMirrors;
	long chasisNumber;
	boolean isPunctured;
	String bikeName;
	double runningKM;
	public static void main(String[] args) {
	TwoWheeler bike=new TwoWheeler();
	bike.noOfWheels=2;
	bike.noOfMirrors=2;
	bike.chasisNumber=65678987687876L;
	bike.isPunctured=false;
	bike.bikeName="JAWA";
	bike.runningKM=20.6;
	System.out.println("Bike Name is:" +bike.bikeName+"\n"+
			           "Number of Wheels:" +bike.noOfWheels+"\n"+
	                   "Number of Mirrors:" +bike.noOfMirrors+"\n"+ 
	                   "Chasis Number:" +bike.chasisNumber+"\n"+
	                   "isPunctured:" +bike.isPunctured+"\n"+
	                   "Running KMs are:" +bike.runningKM);
}
}
