import java.util.Scanner;
public class CarlysEventPriceWithMethods{
	public static void main(String[] args){
			int numGuests;
			double price = 35;
			
			
			numGuests = numOfGuests();
			motto();
			eventDetails(price, numGuests);
	}		
	public static int numOfGuests(){
		Scanner input = new Scanner(System.in);
		int noGuests;
		System.out.print("Enter the number of guests attending an event >> ");
		noGuests = input.nextInt();
		return noGuests;
	}
	public static void motto(){
		System.out.println("**************************************************\n"
			+ "Carly's makes the food that makes it a party.\n"
			+ "**************************************************");
	}
	public static void eventDetails(double price, int noGuests){
		Boolean largeEvent;
		
		if (noGuests >= 50){
				largeEvent = true;
			} else {
				largeEvent = false;
			}
		System.out.print ("Price of the event >> R");
		System.out.printf("%.2f", noGuests * price);
		System.out.println("\nLarge event? : "+ largeEvent);
	}
	
}