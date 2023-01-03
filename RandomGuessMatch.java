import javax.swing.JOptionPane;
public class RandomGuessMatch{
	public static void main(String[] args){
		String numGuess;
		int guess, randomNum, diff;
		Boolean isEqual;
		numGuess = JOptionPane.showInputDialog(null, "Guess a number between 1 and 5");
		guess = Integer.parseInt(numGuess);
		//randNum = JOptionPane.showMessageDialog(null, "The number is "+ (1+(int)(Math.random() * 5)));
		randomNum = 1+(int)(Math.random() * 5);
		diff = Math.abs(randomNum - guess);
		JOptionPane.showMessageDialog(null, "The difference between the random number and the your guess is "+diff);
		
		if (guess == randomNum){
			isEqual = true;
		} else{
			isEqual = false;
		}
		JOptionPane.showMessageDialog(null, "The random number is "+ randomNum + " - "+ isEqual);
	}
}