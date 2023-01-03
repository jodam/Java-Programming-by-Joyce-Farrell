
import java.util.Scanner;
public class EventDemo{
	public static void main(String[] args){
			int numGuests, eventNumb, num = 0;
			double price;
			
			Event eventObj = new Event(); //declare an Event object
			
			numGuests = numOfGuests();
			
			eventNumb = eventNumber(num);
			eventObj .setEventNumber(eventNumb);
			
			
			CarlysEventPriceWithMethods.motto();
			eventDetails(numGuests, eventObj.pricePerGuest, eventObj.cutOff, eventNumb);
			
			eventObj.setGuests();
			
	}		
	public static int numOfGuests(){
		Scanner input = new Scanner(System.in);
		int noGuests;
		System.out.print("Enter the number of guests attending an event >> ");
		noGuests = input.nextInt();
		return noGuests;
	}
	
	
	public static void eventDetails(int noGuests, double pricePerGuest, int cutOff, int eventNo){
		Boolean largeEvent;
		
		if (noGuests >= cutOff){
				largeEvent = true;
			} else {
				largeEvent = false;
			}
		System.out.println ("The event number is "+ eventNo);
		System.out.println ("The number of guests is "+ noGuests);
		System.out.printf("The price per guest is "+ "%.2f", pricePerGuest);
		System.out.print("\nTotal price of the event >> R");
		System.out.printf("%.2f", noGuests * pricePerGuest);
		System.out.println("\nLarge event? : "+ largeEvent);
	}
	
	public static int eventNumber(int eventNo){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the event number >> ");
		eventNo = input.nextInt();
		return eventNo;
	}
}
