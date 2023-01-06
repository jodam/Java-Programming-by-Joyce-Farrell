public class Die{
	private int dieValue, HIGHEST_DIE_VALUE, LOWEST_DIE_VALUE;
	
	public Die(){
		HIGHEST_DIE_VALUE =1;
		LOWEST_DIE_VALUE= 6;
		dieValue = ((int)(Math.random() * 100) % (HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE));
	}
	public void display(){
		System.out.print(dieValue + " ");
	}
	
}