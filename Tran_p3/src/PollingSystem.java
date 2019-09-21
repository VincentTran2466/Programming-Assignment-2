import java.util.Scanner;

public class PollingSystem {

	public static void main(String[] args) {
		String topics[] = {"LOL", "CS:GO", "Siege", "PUBG", "Smash"};
		int response[][] = new int [5][10];
		int rating = 0;
		int numResponse = 0;
		Scanner scnr = new Scanner(System.in);
		char c = 'Y';
		int i = 0;
		double avg = 0;
		int results[] = new int[5];
		int high = 0;
		int low = 0;
		
		//while loop to store the rating for each topics.
		while(rating != -1 && rating <= 10 && numResponse < 10 && c != 'n' && c != 'N')
		{
			System.out.println("Enter your rating for the following topics: ");
			
			for(i = 0; i <= 4; i++)
			{
			System.out.print(topics[i] + ": ");
			rating = scnr.nextInt();
			response[i][numResponse] = rating;
			
			//checks to see if the rating that is entered is a valid number.
			if(rating < 0 || rating > 10)
			{
				System.out.print("Invalid number. Please enter again.\n");
				i--;
				continue;
			}
			}
			numResponse++;
			
			//prompts user if want to add more users to the poll
			System.out.println("Continue with another user? Y/N");
			c = scnr.next().charAt(0);
			if(c == 'n' || c == 'N') break;
		}
		
		//formatting
		System.out.print("Response# ");
		for(i = 0; i < numResponse; i++)
		{
			System.out.print(i + 1 + "  ");
		}
		System.out.print("AVG");
		System.out.println();
		
		//formatting ratings per user
		for(i = 0; i <= 4; i++) 
		{
			System.out.print(topics[i] + "	  ");
			
			for(int j = 0; j < numResponse; j++) 
				{
				System.out.print(response[i][j] + "  ");
				avg += response[i][j];
				}
			
			//displays the avg per user and their ratings for each topic.
			System.out.printf("%.2f", avg/numResponse);
			results[i] = (int) avg;
			avg = 0;
				System.out.println();
		
		}
		
		//determines the highest and lowest polled issue
		for(i = 0; i <= 3; i++)
		{
			if(results[high] <= results[i+1])
			{
				high = i+1;
			}
			if(results[low] >= results[i+1])
				low = i+1;
		}
		System.out.println("The topic that received the highest point total is: " + topics[high] + " " + results[high]);
		System.out.println("The topic that received the lowest point total is: " + topics[low] + " " + results[low]);
		scnr.close();
	}

}
