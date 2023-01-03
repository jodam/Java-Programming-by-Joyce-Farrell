import java.util.Scanner;
public class PickTwoCards{
	public static void main(String[] args){
		int randomNumber;
		char suit;
		final int CARDS_IN_SUIT = 13;
	
		
		Card firstCard = new Card();
		Card secondCard = new Card();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter suit(s for spades, h for hearts, d for diamonds, or c for clubs) >> ");
		suit = input.next().charAt(0);
		firstCard.setSuit(suit);
		
		randomNumber = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		firstCard.setRandomNumber(randomNumber);
		
		
		System.out.print("Enter suit(s for spades, h for hearts, d for diamonds, or c for clubs) >> ");
		suit = input.next().charAt(0);
		secondCard.setSuit(suit);
				
		randomNumber = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
		secondCard.setRandomNumber(randomNumber);
		
		System.out.println("First Card");
		System.out.println("The suit is "+ firstCard.getSuit()+ " and the value is "
							+ firstCard.getRandomNumber());
							
		System.out.println("Second Card");
		System.out.println("The suit is "+ secondCard.getSuit()+ " and the value is "
							+ secondCard.getRandomNumber());
		
		
	}
}