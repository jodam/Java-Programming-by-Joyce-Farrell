import javax.swing.JOptionPane;
public class CarlysEventPrice{
	public static void main(String[] args){
		String eventInput;
		int noGuests;
		double price = 35;
		Boolean largeEvent;
		eventInput = JOptionPane.showInputDialog(null, "Enter the number of guests attending an event:");
		noGuests = Integer.parseInt(eventInput);
		
		if (noGuests >= 50){
			largeEvent = true;
		} else {
			largeEvent = false;
		}
		JOptionPane.showMessageDialog(null, "**************************************************\n"
		+ "Carly's makes the food that makes it a party.\n"
		+ "**************************************************\n"
		+ "Number of guests: "+ noGuests
		+ "\nPrice per guest: "+ "R"+(String.format("%.2f", price))
		+ "\nTotal price: " + "R"+(String.format("%.2f",noGuests * price))
		+ "\nLarge event? : "+ largeEvent);
	}
}