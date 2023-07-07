import java.util.Scanner;

public class LabProgram {

	   /* Define your method here */
	   public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven){
	      
	      double myValue = dollarsPerGallon*milesDriven/milesPerGallon;
	      return myValue;
	      }
	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Type your code here. */
	      Scanner scnr = new Scanner(System.in);
	      double milesPerGallon= scnr.nextDouble();
	      double dollarsPerGallon=scnr.nextDouble();
	        System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 10.0));
	        System.out.printf("%.2f ", drivingCost(milesPerGallon, dollarsPerGallon, 50.0));
	        System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400.0));

	}

}
