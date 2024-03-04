

import java.util.*;

class guess{
	
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	private int win;
	private int count;
	private int limit;
	
	public guess() {
		
		win = random.nextInt(100); 
		
	}
	
	public int getWinner() {
		
		System.out.println("The guessing limit is 5 only...");
		limit = 5;
		
		System.out.println("Guess number between 1 to 100 : ");
		int numb = sc.nextInt();
		count = 1;
		while(true ) {
			
			if(numb == win) {
				System.out.println("Congratulation! You win...");
				System.out.printf("You guessed Number in %d guess",count);
				
				break;
			}
			
			else if(numb > win && limit != 1) {
				limit --;
				System.out.println("remaining : "+limit);
				System.out.println("Too big...");
				count ++;
				System.out.println("Guess again : ");
				numb = sc.nextInt();
			}
			
			else if(numb < win && limit != 1) {
				limit --;
				System.out.println("remaining : "+limit);
				System.out.println("Too low...");
				System.out.println("Guess again : ");
				count ++;
				numb = sc.nextInt();
			}
			
			else if(limit == 1 ) {
				
				System.out.println("Game over... Guess limit is over");
				return 0;
				
			}
			
			else {
				if(numb < 1 && numb > 100)
				System.out.println("Enter number between 1 to 100 : ");
				System.out.println("Guess again : ");
				numb = sc.nextInt();
				
			}
			
		}
		
		return count;
		
	}
	
	
}

public class g {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		guess g = new guess();
		int score;
		while(true) {
			
			System.out.println("1) Start ");
			System.out.println("2) exit");
			int numb = sc.nextInt();
			
			if(numb == 1) {
				
				int count = g.getWinner();
				score = 0;
				if(count == 0) {
					System.out.println("Next time!");
			
				}
				
				else
				{
					if(count == 1)
						score = 100;
					
					else if(count == 2 )
						score = 80;
					else if(count == 3)
						score = 60;
					
					else if(count == 4)
						score = 40;
					
					else if(count == 5)
						score = 40;
					
					System.out.println("Your Score is "+ score);
					
				}
				
			}
			
			else if(numb == 2)
			{
				System.out.println("Thanks for visit...");
				break;
			}
			
			
		}
		
	}
	
}