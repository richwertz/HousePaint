/*
The challenge objectives for this activity is to write a complete Java program, translate algorithm steps into Java, use appropriate data types for variables, prompt the user for information, and print the results. Okay, now let's go over the algorithm. These are the steps needed to paint the exterior of a house. Declare all variables. Ask the user for the house length, the width and the height. Ask for the number and size of the windows.

Ask for the number and size of the doors, because windows and doors do not need to be painted. Finally, calculate the total surface area that will be painted. Okay, that's your challenge. I'm estimating 20 minutes for this activity, but it might take a little longer if you're new to this process. Have fun.
 */
package housepaint;
import java.util.Scanner;

/**
 *
 * @author Rich Wertz
 */


public class HousePaint {

    /**
     * @param args the command line arguments
     */
    
    public static double houseSizeFB (double w, double h) {
	return ((w * h) * 2);
}
    public static double houseSizeS (double l, double h) {
	return ((l * h) * 2);
}

    public static void main(String[] args) {
	double w, l, h;
	double numWin, winWidth, winHeight;
	double numDoors, doorWidth, doorHeight;
	
	System.out.println("Please enter the width, length and height of your house (in feet): ");

	Scanner areaH = new Scanner (System.in);
	w = areaH.nextDouble();
	l = areaH.nextDouble();
	h = areaH.nextDouble();
	
	System.out.println("Please enter the number of windows, and the width and height (in feet): ");
	
	Scanner windH = new Scanner (System.in);
	numWin = windH.nextDouble();
	winWidth = windH.nextDouble();
	winHeight = windH.nextDouble();
	
	double winAreaTotal = ((winHeight * winWidth) * numWin);
	
	System.out.println("Please enter the number of doors, and the width and height (in feet): ");
	
	Scanner doorH = new Scanner (System.in);
	numDoors = doorH.nextDouble();
	doorWidth = doorH.nextDouble();
	doorHeight = doorH.nextDouble();
	
	double doorAreaTotal = ((doorHeight * doorWidth) * numDoors);
	
	double surfaceArea = (houseSizeFB(w, h) + houseSizeS(l, h));
	double sansPaintArea = (winAreaTotal + doorAreaTotal);
	
	double paintableArea = (surfaceArea - sansPaintArea);
	
	System.out.println("Total outside area of house: " + surfaceArea + " square feet.");
	System.out.println();
	System.out.println("Total area of doors and windows: " + sansPaintArea + " square feet.");
	System.out.println();
	System.out.println("Total outside paintable area of house: " + paintableArea + " aquare feet.");
	System.out.println();
	System.out.println("How many coats of paint would you like to use?");
	
	Scanner coats = new Scanner(System.in);
	
	int paintCoats = coats.nextInt();
	
	System.out.println();
	System.out.println("How much surface area can one gallon of paint cover (the average is 400 square feet)?");
	
	Scanner coverage = new Scanner(System.in);
	
	int paintCoverageRate = coverage.nextInt();
	
	double paintVolume = ((paintableArea / paintCoverageRate) * paintCoats);
	
	System.out.println();
	System.out.println("You will need " + paintVolume + " gallons of paint for the exterior of your house.");
	
	
	

/*
	//introduction to the console app
	System.out.println("Hello. Welcome to the paint gallon estimator.");
	
	//ask user for the width
	Scanner width = new Scanner (System.in);
	System.out.println("Please enter the width of your house (in feet): ");
	double w = width.nextDouble();
	
	//ask user for the height
	Scanner height = new Scanner (System.in);
	System.out.println("Please enter the height of your house (in feet): ");
	double h = height.nextDouble();
	
	//ask user for the length
	Scanner length = new Scanner (System.in);
	System.out.println("Please enter the length of your house (in feet): ");
	double l = length.nextDouble();
	
	//Front and back is multiplied twice because there is a front and a back.
	double houseFrontBack = houseSizeFB(w, h);
	
	//The sides of the house are calculated using length ad height.
	double houseSides = houseSizeS(l, h);
	
	double houseAreaTotal = (houseFrontBack + houseSides);
	
	//Give user some feedback about the total square footage of their paintable surface.
	System.out.println("The total area of your house is " + (houseAreaTotal) + " square feet.");
	
	//Inform user that to acurately calculate the paint needed, we have to subtract the measurements of all doors and windows.
	System.out.println("Now we have to subtract doors and windows. Please enter the following measurements in feet and include the trim.");
	
    //Ask user for door measurements
	Scanner door1Width = new Scanner (System.in);
	System.out.println("Enter the width of Door #1: ");
	double dw1 = door1Width.nextDouble();
	
	Scanner door1Height = new Scanner (System.in);
	System.out.println("Enter the height of Door #1: ");
	double dh1 = door1Height.nextDouble();
	
	double door1Area = (dh1 * dw1);
	
	Scanner door2Width = new Scanner (System.in);
	System.out.println("Enter the width of Door #2 (if only one door, enter 0): ");
	double dw2 = door2Width.nextDouble();
	
	Scanner door2Height = new Scanner (System.in);
	System.out.println("Enter the height of Door #2 (if only one door, enter 0): ");
	double dh2 = door2Height.nextDouble();
	
	double door2Area = (dh2 * dw2);
	
	Scanner door3Width = new Scanner (System.in);
	System.out.println("Enter the width of Door #3 (if only one or two doors, enter 0): ");
	double dw3 = door3Width.nextDouble();
	
	Scanner door3Height = new Scanner (System.in);
	System.out.println("Enter the height of Door #3 (if only one or two doors, enter 0): ");
	double dh3 = door3Height.nextDouble();
	
	double door3Area = (dh3 * dw3);
	
	double doorAreaTotal = (door1Area + door2Area + door3Area);
	
	System.out.println("The total area of all doors is: " + doorAreaTotal);
		
	
    //Ask user for window measurements
	Scanner wind1Width = new Scanner (System.in);
	System.out.println("Enter the width of Window #1: ");
	double ww1 = wind1Width.nextDouble();
	
	Scanner wind1Height = new Scanner (System.in);
	System.out.println("Enter the height of Window #1: ");
	double wh1 = wind1Height.nextDouble();
	
	double wind1Area = (wh1 * ww1);
	
	Scanner wind2Width = new Scanner (System.in);
	System.out.println("Enter the width of Window #2 (if only one window, enter 0): ");
	double ww2 = wind2Width.nextDouble();
	
	Scanner wind2Height = new Scanner (System.in);
	System.out.println("Enter the height of Window #2 (if only one window, enter 0): ");
	double wh2 = wind2Height.nextDouble();
	
	double wind2Area = (wh2 * ww2);
	
	Scanner wind3Width = new Scanner (System.in);
	System.out.println("Enter the width of Window #3 (if only one or two windows, enter 0): ");
	double ww3 = wind3Width.nextDouble();
	
	Scanner wind3Height = new Scanner (System.in);
	System.out.println("Enter the height of Window #3 (if only one or two windows, enter 0): ");
	double wh3 = wind3Height.nextDouble();
	
	double wind3Area = (wh3 * ww3);
	
	double windAreaTotal = (wind1Area + wind2Area + wind3Area);
	
	System.out.println("The total area of all windows is: " + windAreaTotal);
	
	
	double paintExcl = (doorAreaTotal + windAreaTotal);
	
	double totalPaintableHouseArea = (houseAreaTotal - paintExcl);
	
	System.out.println("The total surface area of paintable house exterior is: " + totalPaintableHouseArea + " square feet.");
	
	Scanner coats = new Scanner (System.in);
	System.out.println("How many coats of paint do you want to use?");
	int coatCount = coats.nextInt();
	
	double paintGallon = ((totalPaintableHouseArea / 400) * coatCount);
	System.out.println("You need " + paintGallon + " gallons of paint to paint the outside of your house. Thanks for using the House Exterior Paint Gallon Estimator");	


*/
	
    }
    
}
