import java.util.Random;
import java.io.*;
import java.util.Scanner;
public class Showcase {
	public static final String DELIM = "\t";
	   private Prize prizes[];

	   public Showcase() 
	   {
	       prizes = new Prize[50];
	       readDataFromFile(null);
	   }
	   public Prize[] select5RandomPrizes(String prizeName, int prizeValue) 
	   {
	       int i;
	       Prize randomPrizes[] = new Prize[5];
	       Random rand = new Random();
	       for (int j = 0; j < 5; j++) {

	           Prize randomPrize;
	           while (true) {

	               i = rand.nextInt(50) % 50;
	               randomPrize = prizes[i];
	           }
	           
	       }
	       return randomPrizes;
	   }
	   public void readDataFromFile(String fileName) {

		   try 
		   {
			   Scanner fileScanner = new Scanner(new File(fileName));
				while(fileScanner.hasNextLine())
				{
					String fileLine = fileScanner.nextLine();
					
					String[] splitLine = fileLine.split(DELIM);
					
					if(splitLine.length != 2)
						continue;
					this.select5RandomPrizes(splitLine[0], Integer.parseInt(splitLine[1]));	
				}
				fileScanner.close();
	       } 
		   catch(Exception e)
		   {
			   e.printStackTrace();
		   }
	   }
}

	

	       
