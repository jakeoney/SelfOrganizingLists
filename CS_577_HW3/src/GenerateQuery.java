
public class GenerateQuery {
	/*public enum MIDWEST {
		Kentucky, Kansas, NotreDame, Maryland, WestVirginia, Butler, Wichita, Cincinnati, 
		Purdue, Indiana, Texas, Buffalo, Valparaiso, Northeastern, NewMexicoState, Hampton
	}

	public enum WEST { 
		Wisconsin, Arizona, Baylor, NorthCarolina, Arkansas, Xavier, VCU, Oregon, OklahomaState,
		OhioState, Mississippi, Wofford, Harvard, GeorgiaState, TexasSouthern, CostalCarolina		
	}

	public enum EAST { 
		Villanova, Virginia, Oklahoma, Louisville, NorthernIowa, Providence, MichiganState, NCState,
		LSU, Georgia, Dayton, Wyoming, UCIrvine, Albany, Belmont,Lafayette
	}

	public enum SOUTH {
		Duke, Gonzaga, IowaState, Georgetown, Utah, SouthernMethodist, Iowa, SanDiegoState, StJohnsState,
		Davidson, UCLA, StephenFAustin, EasternWashington, UAB, NorthDakotaState, RobertMorris
	}

	double round1MW[] = 
		{98.5, 96.3, 95.5, 86.1, 68.4, 55.1, 68.2, 47.3, 52.8, 31.8, 44.9, 31.6, 13.9, 4.5, 3.7, 1.5};
	double round2MW[] = 
		{96.3, 65.7, 77.4, 61.1, 27.3, 12.7, 26.9, 1.3, 1.6, 6, 8.3, 6.5, 5.2, 1.5, 1.4, 0.8};
	double round3MW[] =
		{90.9, 30, 51.1, 4.4, 1.8, 4.3, 8.9, 0.6, 0.7, 1.8, 2.8, 0.5, 0.4, 0.4, 0.8, 0.6};
	double round4MW[] = 
		{77.7, 5.4, 9.5, 2.1, 0.7, 0.6, 1.3, 0.2, 0.3, 0.4, 0.6, 0.2, 0.2, 0.1, 0.2, 0.5};
	double round5MW[] =
		{58.7, 2.9, 4.5, 0.9, 0.3, 0.3, 0.5, 0.1, 0.1, 0.2, 0.3, 0.1, 0.1, 0.1, 0.1, 0.2};
	double round6MW[] = 
		{48, 1.8, 2.6, 0.6, 0.2, 0.1, 0.3, 0.1, 0.1, 0.1, 0.2, 0.1, 0.1, 0.05, 0.05, 0.1};

	double round1W[] = 
		{97.9, 97.4, 91.6, 89.9, 81.9, 64.1, 42.7, 60.4, 39.6, 57.4, 35.9, 18.1, 10.1, 8.4, 2.6, 2.1};
	double round2W[] = 
		{91.8, 84.9, 69, 70.6, 22.6, 18.9, 5.8, 4.6, 2.6, 8.2, 8.9, 2.5, 4.2, 3.3, 1.2, 1.1};
	double round3W[] =
		{71.1, 70.4, 16.4, 20.5, 3.8, 3.5, 2.9, 2, 1, 4.4, 1.2, 0.4, 0.7, 0.5, 0.8, 0.7};
	double round4W[] = 
		{41.8, 36.2, 5.1, 9.9, 1.3, 0.9, 0.8, 0.8, 0.3, 1.3, 0.4, 0.2, 0.3, 0.2, 0.2, 0.5};
	double round5W[] =
		{13.9, 10.8, 1, 2.7, 0.3, 0.2, 0.2, 0.3, 0.1, 0.5, 0.1, 0.1, 0.1, 0.1, 0.1, 0.3};
	double round6W[] = 
		{9.9, 7.2, 0.4, 1.7, 0.2, 0.1, 0.1, 0.1, 0.1, 0.3, 0.1, 0.05, 0.1, 0.05, 0.05, 0.2};

	double round1E[] = 
		{97.6, 96, 91.7, 92.3, 77.7, 71.9, 80.8, 57.7, 42.3, 19.2, 28.1, 22.3, 7.7, 8.3, 4, 2.4};
	double round2E[] = 
		{83.4, 68.2, 70.6, 62.5, 31.6, 19.3, 27.1, 9.5, 6, 3.2, 6.9, 3.6, 2.3, 3.3, 1.5, 1.1};
	double round3E[] =
		{55.8, 55.3, 18.7, 26.1, 10.2, 3.1, 19.1, 3.8, 2.3, 1.4, 0.9, 0.7, 0.5, 0.6, 0.9, 0.7};
	double round4E[] = 
		{30.4, 32.6, 7.1, 12.3, 3.7, 0.8,  9.1, 1.1, 0.8, 0.5, 0.3, 0.2, 0.2, 0.2, 0.2, 0.5};
	double round5E[] =
		{14.2, 15, 2, 4.7, 0.9, 0.8, 3.1, 0.4, 0.3, 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.3};
	double round6E[] = 
		{3.5, 3.4, 0.4, 1.1, 0.2, 0.1, 0.9, 0.2, 0.1, 0.1, 0.1, 0.05, 0.05, 0.1, 0.05, 0.1};

	double round1S[] = 
		{98.3, 96.1, 94.9, 81.4, 70.6, 68.5, 53.3, 56.8, 43.2, 46.7, 31.5, 29.4, 18.6, 5.1, 3.9, 1.8};
	double round2S[] = 
		{93, 82.8, 74.1, 45.2, 37.3, 16.4, 8.6, 3.2, 2.9, 7, 7.7, 12.9, 4.7, 1.7, 1.6, 0.9};
	double round3S[] =
		{82.3, 48.3, 38.7, 7.1, 5.5, 5.4, 2.3, 1.5, 1.2, 1.7, 2.4, 1.1, 0.6, 0.4, 0.9, 0.6};
	double round4S[] = 
		{52.3, 21.9, 16.3, 2.6, 1.6, 1.4, 0.6, 0.4, 0.4, 0.4, 0.6, 0.3, 0.2, 0.2, 0.2, 0.5};
	double round5S[] =
		{34.4, 12.4, 8, 1, 0.5, 0.5, 0.2, 0.2, 0.1, 0.2, 0.3, 0.1, 0.1, 0.1, 0.1, 0.2};
	double round6S[] = 
		{9.3, 2.9, 1.6, 0.3, 0.2, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.1, 0.05, 0.1, 0.1};
*/
	
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
	
	int winnerQueries[] = {100, 90, 80, 70, 60, 50, 40, 30, 20, 10};
	int loserQueries[] = {1, 5, 10, 15, 20, 25, 30, 35, 40, 45};
	
	// Round Results stores the index for each team
	private int[] roundResults;
	int currentRound;
	int queries[];
	
	public GenerateQuery(int[] results, int round){
		roundResults = results;
		currentRound = round;
		queries = this.tallyQueries();
	}
	
	public int[] getQueries(){
		return queries;
	}
	
	/*If a team is expected to win, less queries. If a team not expected to win, more queries*/
	
	private int[] tallyQueries(){
		int totalQueries[] = new int[roundResults.length];
		boolean winning;
		
		for(int i = 1; i< roundResults.length; i++){
			
			//finds the interest level (given by percentages above) for the given winner/loser
			int range = this.whichRangeForQueries((int)roundMW[roundResults[i]]);
			
			if(i < (roundResults.length/2) + 1){ //then we are working with winning query numbers
				winning = true;
			}
			else{ //we are working with the losing queries (stored in second half of array) because 
				//losing teams should get queries too.
				winning = false;
			}
			switch(range) {
				case 0 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 1 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 2 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 3 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 4 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 5 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 6 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 7 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				case 8 : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
				//default is case 9
				default : {
					if(winning){
						totalQueries[i] = winnerQueries[range];
					} else{
						totalQueries[i] = loserQueries[range];
					}
				}
			}
		}
		return totalQueries;
	}

	/*Returns range for what query falls into: 
	 * 0 - 9 = 0
	 * 10 - 19 = 1
	 * 20 - 29 = 2
	 * etc..*/
	private int whichRangeForQueries(int num){
		if(num < 10)
			return 0;
		else if(num < 20)
			return 1;
		else if(num < 30)
			return 2;
		else if(num < 40)
			return 3;
		else if(num < 50)
			return 4;
		else if(num<60)
			return 5;
		else if(num<70)
			return 6;
		else if(num<80)
			return 7;
		else if(num<90)
			return 8;
		else 
			return 9;
	}
}
