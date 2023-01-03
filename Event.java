public class Event{
	/*Two public final static fields that hold the price per guest ($35) and the
cutoff value for a large event (50 guests)*/
	public static final double pricePerGuest = 35;
	public static final int cutOff = 50;

/*Three private fields that hold an event number, number of guests for the
event, and the price. The event number is stored as a String because Carly
plans to assign event numbers such as M312.*/
	private int eventNum;
	private int numOfGuests;
	private double price;


/*Two public set methods that set the event number (setEventNumber()) and
the number of guests (setGuests()). The price does not have a set method
because the setGuests() method will calculate the price as the number of
guests multiplied by the price per guest every time the number of guests is set.*/
	public void setEventNumber(int eventNo){
		eventNum = eventNo;
	}
	public void setGuests(){
		price = numOfGuests * pricePerGuest;
	}
/*Three public get methods that return the values in the three nonstatic fields*/
	public int getEventNumber(){
		return eventNum;
	}
	public int getGuests(){
		return numOfGuests;
	}
	public double getPrice(){
		return price;
	}
}