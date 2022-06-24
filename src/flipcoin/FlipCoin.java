package flipcoin;
import java.util.Random;
import java.util.Scanner;
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result;
		int heads = 0;
		int tails = 0;
		int numofFlips;
		double percentageofHeads;
		double percentageofTails;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter number of times coins to be flip");
		numofFlips = Scanner.nextInt();
		Random random = new Random();
		int i =1;
		while(i <= numofFlips) {
			result = random.nextInt(2);
			if(result < 0.5)
				heads++;
			else
				tails++;
			i++;
		}
		System.out.println("Head " + heads + " number of times");
		System.out.println("Tail " + tails + " number of times");
		percentageofHeads = heads/numofFlips * 100;
		System.out.println("percent of Heads is" + percentageofHeads);
		percentageofTails = tails/numofFlips * 100;
		System.out.println("percent of Tails is" + percentageofTails);
		}
		

	}


