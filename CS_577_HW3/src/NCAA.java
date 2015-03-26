import java.util.Random;


public class NCAA {

	double roundMW[] = 
		{
			//round 1
			-1, 98.5, 96.3, 95.5, 86.1, 68.4, 55.1, 68.2, 47.3, 52.8, 31.8, 44.9, 31.6, 13.9, 4.5, 3.7, 1.5,
			//round2
			-1, 96.3, 65.7, 77.4, 61.1, 27.3, 12.7, 26.9, 1.3, 1.6, 6, 8.3, 6.5, 5.2, 1.5, 1.4, 0.8, 
			//round3
			-1, 90.9, 30, 51.1, 4.4, 1.8, 4.3, 8.9, 0.6, 0.7, 1.8, 2.8, 0.5, 0.4, 0.4, 0.8, 0.6,
			//round4
			-1, 77.7, 5.4, 9.5, 2.1, 0.7, 0.6, 1.3, 0.2, 0.3, 0.4, 0.6, 0.2, 0.2, 0.1, 0.2, 0.5,
			//round5
			-1, 58.7, 2.9, 4.5, 0.9, 0.3, 0.3, 0.5, 0.1, 0.1, 0.2, 0.3, 0.1, 0.1, 0.1, 0.1, 0.2,
			//round6
			-1, 48, 1.8, 2.6, 0.6, 0.2, 0.1, 0.3, 0.1, 0.1, 0.1, 0.2, 0.1, 0.1, 0.05, 0.05, 0.1
		};

	double roundW[] = 
		{
			-1, 97.9, 97.4, 91.6, 89.9, 81.9, 64.1, 42.7, 60.4, 39.6, 57.4, 35.9, 18.1, 10.1, 8.4, 2.6, 2.1,
			-1, 91.8, 84.9, 69, 70.6, 22.6, 18.9, 5.8, 4.6, 2.6, 8.2, 8.9, 2.5, 4.2, 3.3, 1.2, 1.1,
			-1, 71.1, 70.4, 16.4, 20.5, 3.8, 3.5, 2.9, 2, 1, 4.4, 1.2, 0.4, 0.7, 0.5, 0.8, 0.7,
			-1, 41.8, 36.2, 5.1, 9.9, 1.3, 0.9, 0.8, 0.8, 0.3, 1.3, 0.4, 0.2, 0.3, 0.2, 0.2, 0.5,
			-1, 13.9, 10.8, 1, 2.7, 0.3, 0.2, 0.2, 0.3, 0.1, 0.5, 0.1, 0.1, 0.1, 0.1, 0.1, 0.3,
			-1, 9.9, 7.2, 0.4, 1.7, 0.2, 0.1, 0.1, 0.1, 0.1, 0.3, 0.1, 0.05, 0.1, 0.05, 0.05, 0.2
		};
	
	double roundE[] = 
		{
			-1, 97.6, 96, 91.7, 92.3, 77.7, 71.9, 80.8, 57.7, 42.3, 19.2, 28.1, 22.3, 7.7, 8.3, 4, 2.4,
			-1, 83.4, 68.2, 70.6, 62.5, 31.6, 19.3, 27.1, 9.5, 6, 3.2, 6.9, 3.6, 2.3, 3.3, 1.5, 1.1,
			-1, 55.8, 55.3, 18.7, 26.1, 10.2, 3.1, 19.1, 3.8, 2.3, 1.4, 0.9, 0.7, 0.5, 0.6, 0.9, 0.7,
			-1, 30.4, 32.6, 7.1, 12.3, 3.7, 0.8,  9.1, 1.1, 0.8, 0.5, 0.3, 0.2, 0.2, 0.2, 0.2, 0.5,
			-1, 14.2, 15, 2, 4.7, 0.9, 0.8, 3.1, 0.4, 0.3, 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.3,
			-1, 3.5, 3.4, 0.4, 1.1, 0.2, 0.1, 0.9, 0.2, 0.1, 0.1, 0.1, 0.05, 0.05, 0.1, 0.05, 0.1
		};

	double roundS[] = 
		{
			-1, 98.3, 96.1, 94.9, 81.4, 70.6, 68.5, 53.3, 56.8, 43.2, 46.7, 31.5, 29.4, 18.6, 5.1, 3.9, 1.8,
			-1, 93, 82.8, 74.1, 45.2, 37.3, 16.4, 8.6, 3.2, 2.9, 7, 7.7, 12.9, 4.7, 1.7, 1.6, 0.9,
			-1, 82.3, 48.3, 38.7, 7.1, 5.5, 5.4, 2.3, 1.5, 1.2, 1.7, 2.4, 1.1, 0.6, 0.4, 0.9, 0.6,
			-1, 52.3, 21.9, 16.3, 2.6, 1.6, 1.4, 0.6, 0.4, 0.4, 0.4, 0.6, 0.3, 0.2, 0.2, 0.2, 0.5,
			-1, 34.4, 12.4, 8, 1, 0.5, 0.5, 0.2, 0.2, 0.1, 0.2, 0.3, 0.1, 0.1, 0.1, 0.1, 0.2,
			-1, 9.3, 2.9, 1.6, 0.3, 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.05, 0.1, 0.1
		};

	public NCAA(){
		
	}
	
	public void moveToFront(){

	}

	public void count(){

	}

	public void transpose(){

	}
	

	public int[] generateWinners(int[] roundParticipants, int roundNumber, int division) {
		
		//Store winners in first half of the array and losers in the second half of it
		int winnersLosers[] = new int[roundParticipants.length];
		winnersLosers[0] = -1;
		int j = roundParticipants.length-1;
		int winner;
		int loserIndex = roundParticipants.length-1;	
				
		for(int i = 1; i < (roundParticipants.length/2)+1; i++){
			int highSeed = roundParticipants[i];
			int lowSeed = roundParticipants[j];

			winner = playGame(highSeed, lowSeed, roundNumber, division);
			if(winner == highSeed){
				winnersLosers[i] = highSeed;
				winnersLosers[loserIndex] = lowSeed;
			}
			else if(winner == lowSeed){
				winnersLosers[i] = lowSeed;
				winnersLosers[loserIndex] = highSeed;
			}
			else{
				System.out.println("Something went wrong. We should have a winner...");
			}
			loserIndex--;
			j--;
		}
		return winnersLosers;
	}
	
	// Return winner
	private int playGame(int highSeed, int lowSeed, int round, int division){
		
		int winner = -1;
		int highSeedChanceToWin = 0;
		double highSeedArrayValues = 0;
		double lowSeedArrayValues = 0;
		double totalProbability = 0;
		// Switch based on what Region we are trying to determine the winners for
		switch (division ){
			case 1 : {
				highSeedArrayValues = roundMW[highSeed + (17*(round-1))]; 
				lowSeedArrayValues = roundMW[lowSeed + (17*(round-1))];
				break;
			}
			case 2 :
				highSeedArrayValues = roundW[highSeed + (17*(round-1))]; 
				lowSeedArrayValues = roundW[lowSeed + (17*(round-1))];
				break;
			case 3: 
				highSeedArrayValues = roundE[highSeed + (17*(round-1))]; 
				lowSeedArrayValues = roundE[lowSeed + (17*(round-1))];
				break;
			case 4: 
				highSeedArrayValues = roundS[highSeed + (17*(round-1))]; 
				lowSeedArrayValues = roundS[lowSeed + (17*(round-1))];
				break;
			default :
				System.out.println("Something went wrong in generate winner");
				break;
		}
		
		// Calculate the odds that each team will win
		totalProbability = lowSeedArrayValues + highSeedArrayValues;
		highSeedChanceToWin = (int) (highSeedArrayValues*100 / totalProbability) ;

		//Generate Random number between 0 and totalProbabilty
		Random rand = new Random();

	    // I think this is going to give me numbers between 1 and 100
	    int randomNum = rand.nextInt((int)totalProbability) + 1;
	    
		if(randomNum <= highSeedChanceToWin){
			winner = highSeed;
		}
		else{
			winner = lowSeed;
		}

		return winner;
	}
}

