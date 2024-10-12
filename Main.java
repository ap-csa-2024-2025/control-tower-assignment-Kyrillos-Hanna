import java.util.Scanner;
import java.lang.Math;
 
public class Main
{
  public static void main(String[] args)
  {
   // Complete the code below
   
   // TODO: Create Airplane 1 and 2
   Airplane Airplane1 = new Airplane();
   Airplane Airplane2 = new Airplane("AAA02", 15.8, 128, 30000);
   
   // TODO: Create a Scanner
   Scanner sc = new Scanner(System.in);
   
   // TODO: Getting inputs for Airplane 3
   System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
   String callSign = sc.nextLine();
   double distance = sc.nextDouble();
   int bearing = sc.nextInt();
   int altitude = sc.nextInt();

   // TODO: Create Airplane 3 from inputs
   Airplane Airplane3 = new Airplane(callSign, distance, bearing, altitude);
   // TODO: Print the initial positions
   System.out.println("\nInitial Positions:");
   System.out.println("\"Airplane 1\"" + Airplane1.toString());
   System.out.println("\"Airplane 2\"" + Airplane2.toString());
   System.out.println("\"Airplane 3\"" + Airplane2.toString());
   // TODO: Print initial distances 
   System.out.println("\nInitial Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + Airplane1.distTo(Airplane2) + ".");
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + Airplane1.distTo(Airplane3) + ".");
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + Airplane2.distTo(Airplane3) + ".");
   
   // TODO: Print initial height differences
   System.out.println("\nInitial Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs((Airplane1.getAlt() - Airplane2.getAlt())) + " feet.");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs((Airplane1.getAlt() - Airplane3.getAlt())) + " feet.");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs((Airplane2.getAlt() - Airplane3.getAlt())) + " feet.");
   
   // TODO: Airplane 1 changes
   Airplane1.move(Airplane2.distTo(Airplane3), 65);
   Airplane1.gainAlt();
   Airplane1.gainAlt();
   Airplane1.gainAlt();
   // TODO: Airplane 2 changes
   Airplane2.move(8.0, 135);
   Airplane2.loseAlt();
   Airplane2.loseAlt();
   // TODO: Airplane 3 changes
   Airplane3.move(5.0, 55);
   Airplane3.loseAlt();
   Airplane3.loseAlt();
   Airplane3.loseAlt();
   Airplane3.loseAlt();
   
   // TODO: Print new positions of airplanes
   System.out.println("\nNew Positions: ");
   System.out.println("\"Airplane 1\": " + Airplane1.toString());
   System.out.println("\"Airplane 2\": " + Airplane2.toString());
   System.out.println("\"Airplane 3\": " + Airplane3.toString());
   
   // TODO: Print new distances between airplanes
   System.out.println("\nNew Distances:");
   System.out.println("The distance between Airplane 1 and Airplane 2 is " + Airplane1.distTo(Airplane2) + ".");
   System.out.println("The distance between Airplane 1 and Airplane 3 is " + Airplane1.distTo(Airplane3) + ".");
   System.out.println("The distance between Airplane 2 and Airplane 3 is " + Airplane2.distTo(Airplane3) + ".");
   
   // TODO: Print new heights between airplanes
   System.out.println("\nNew Height Differences:");
   System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs((Airplane1.getAlt() - Airplane2.getAlt())) + " feet.");
   System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs((Airplane1.getAlt() - Airplane3.getAlt())) + " feet.");
   System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs((Airplane2.getAlt() - Airplane3.getAlt())) + " feet.");
   sc.close();
  }
}
