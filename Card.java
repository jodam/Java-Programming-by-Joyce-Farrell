public class Card{
	private char suits;
	int randNum;
	
	
	public void setSuit(char suit){
		suits = suit;
	}
	public void setRandomNumber(int num){
		randNum = num;
	}
	
	public char getSuit(){
		return suits;
	}
	public int getRandomNumber(){
		return randNum;
	}
	
}