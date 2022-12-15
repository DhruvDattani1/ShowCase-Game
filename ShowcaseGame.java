import java.util.Scanner;
public class ShowcaseGame {

	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);
		
	    Showcase showcase = new Showcase();

	       while (true) {
	          
	           System.out.println("Welcome to the showcase show down! \nYour 5 prizes are: ");
	           Prize[] randomPrizes = showcase.select5RandomPrizes(prizeName,prizeValue);
	           int prizeValue=0;
	          
	           for (int i = 0; i < randomPrizes.length; i++) 
	           {
	               System.out.println(randomPrizes[i].getName());
	               prizeValue =(int) (prizeValue+ randomPrizes[i].getPrice());
	           }
	           System.out.println("\n \nYou must guess the total cost of all without going over\nEnter your guess ");
	           int guess = keyboard.nextInt();
	          
	           if (prizeValue - 2000 <= guess && prizeValue + 2000 >= guess) 
	           {
	               System.out.println("You guessed " + guess + " the actual price is "+ prizeValue);
	               System.out.println("Your guess was under! You win! ");
	           }
	           else 
	           {
	               System.out.println("You guessed " + guess + " the actual price is "+ prizeValue);
	               System.out.println("I'm sorry but that guess was bad. You lose for being bad. ");
	           }
	          
	           System.out.println("Would you like to play again? Enter 'no' to quit");
	           String keepPlaying = keyboard.nextLine();
	          
	           if (keepPlaying.equals("no")) {
	               System.out.println("Goodbye");
	               System.exit(0);
	           }
	       }
	   }

	}

	

