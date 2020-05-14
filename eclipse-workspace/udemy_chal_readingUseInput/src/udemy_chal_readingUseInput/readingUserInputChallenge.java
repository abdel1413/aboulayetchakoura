package udemy_chal_readingUseInput;

import java.util.Scanner;

public class readingUserInputChallenge {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		
		
		
		//we can use while(counter <10) instead of endless loop
		 // and then delete break statement 
		// while (counter <10)
		while (true)  // endless loop so we need a break statment inside;
		{
		int  order  = counter +1;
	     System.out.println("Enter number # "+order+ ":");
		
		boolean isAnInt = scanner.hasNextInt(); // check input validity
		if(isAnInt)
		{    
			
			
			int number = scanner.nextInt();  // save each entry into number;
			
			sum += number;
			counter ++;
			
			
		}else
		{
		 System.out.println("Invalid Entry, try again");	
		}
		scanner.nextLine();
		
		  if (counter == 10)
		  {
			  break;
		  }
		}
		
      System.out.println("The sum of all numbers are "+ sum);
      scanner.close();
	}
    
	}
