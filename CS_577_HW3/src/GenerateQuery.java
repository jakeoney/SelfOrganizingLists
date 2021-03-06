
public class GenerateQuery {
	
	public static String midwest[] = {"MIDWEST", "Kentucky", "Kansas", "Notre Dame", "Maryland", "West Virginia", "Butler", "Wichita", 
		"Cincinnati", "Purdue", "Indiana", "Texas", "Buffalo", "Valparaiso", "Northeastern", "New Mexico State", "Hampton"};

	public static String west[] = { "WEST", "Wisconsin", "Arizona", "Baylor", "North Carolina", "Arkansas", "Xavier", "VCU", "Oregon", "Oklahoma State",
			"Ohio State", "Mississippi", "Wofford", "Harvard", "Georgia State", "Texas Southern", "Costal Carolina"};
		
	public static String east[] = {"EAST", "Villanova", "Virginia", "Oklahoma", "Louisville", "Northern Iowa", "Providence", "Michigan State", "NC State",
			"LSU", "Georgia", "Dayton", "Wyoming", "UC Irvine", "Albany", "Belmont", "Lafayette"};
		
	public static String south[] = {"SOUTH", "Duke", "Gonzaga", "Iowa State", "Georgetown", "Utah", "Southern Methodist", "Iowa", "San Diego State", 
			"St Johns State", "Davidson", "UCLA", "Stephen F Austin", "Eastern Washington", "UAB", "North Dakota State", "Robert Morris"};
	
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
	
	int winnerQueries[] = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100};
	int loserQueries[] = {10, 50, 100, 150, 200, 250, 300, 350, 400, 450};
	
	// Round Results stores the index for each team
	private int[] roundResults;
	private int currentRound;
	private int queries[];
	private int division;
	private NCAA teams;
	
	public GenerateQuery(int[] results, int round, int division, NCAA teams){
		this.roundResults = results;
		this.currentRound = round;
		this.division = division;
		this.teams = teams;
		queries = this.tallyQueries();
	}
	
	public int[] getQueries(){
		return queries;
	}
	
	/*If a team is expected to win, less queries. If a team not expected to win, more queries*/
	
	private int[] tallyQueries(){
		int totalQueries[] = new int[roundResults.length];
		boolean winning;
		int range = 0;
		Team curr = null;
		int j = roundResults.length -1;
		for(int i = 1; i< roundResults.length; i++){
			
			if(i <= (roundResults.length/2)){ //then we are working with winning query numbers
				winning = true;
			}
			else{ //we are working with the losing queries (stored in second half of array) because 
				//losing teams should get queries too.
				winning = false;
			}
			switch(division){
				case 1 :{
					double totalProbability = roundMW[roundResults[i]+ (17*(currentRound-1))] + roundMW[roundResults[j]+ (17*(currentRound-1))];
					//finds the interest level (given by percentages above) for the given winner/loser
					range = this.whichRangeForQueries((int)((roundMW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
					curr = teams.getTeams().get(roundResults[i]);
					if(winning){
						totalQueries[i] = winnerQueries[range];
						curr.setQueries(winnerQueries[range]);
					} else{
						totalQueries[i] = loserQueries[range];
						curr.setQueries(loserQueries[range]);
					}
					break;
				}
				case 2 :{
					double totalProbability = roundW[roundResults[i]+ (17*(currentRound-1))] + roundW[roundResults[j]+ (17*(currentRound-1))];
					//finds the interest level (given by percentages above) for the given winner/loser
					range = this.whichRangeForQueries((int)((roundW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
					curr = teams.getTeams().get(roundResults[i]+15);
					if(winning){
						totalQueries[i] = winnerQueries[range];
						curr.setQueries(winnerQueries[range]);
					} else{
						totalQueries[i] = loserQueries[range];
						curr.setQueries(loserQueries[range]);
					}
					break;
				}
				case 3 :{
					double totalProbability = roundE[roundResults[i]+ (17*(currentRound-1))] + roundE[roundResults[j]+ (17*(currentRound-1))];
					//finds the interest level (given by percentages above) for the given winner/loser
					range = this.whichRangeForQueries((int)((roundE[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
					curr = teams.getTeams().get(roundResults[i]+31);
					if(winning){
						totalQueries[i] = winnerQueries[range];
						curr.setQueries(winnerQueries[range]);
					} else{
						totalQueries[i] = loserQueries[range];
						curr.setQueries(loserQueries[range]);
					}
					break;
				}
				case 4 :{ 
					double totalProbability = roundS[roundResults[i]+ (17*(currentRound-1))] + roundS[roundResults[j]+ (17*(currentRound-1))];
					//finds the interest level (given by percentages above) for the given winner/loser
					range = this.whichRangeForQueries((int)((roundS[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
					curr = teams.getTeams().get(roundResults[i] + 47);
					if(winning){	
						totalQueries[i] = winnerQueries[range];
						curr.setQueries(winnerQueries[range]);
					} else{
						totalQueries[i] = loserQueries[range];
						curr.setQueries(loserQueries[range]);
					}
					break;
				}
				default :{ 
					if(roundResults[0] == 0){
						double totalProbability = roundMW[roundResults[i]+ (17*(currentRound-1))] + roundW[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundMW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 3){
						double totalProbability = roundW[roundResults[i]+ (17*(currentRound-1))] + roundMW[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+15);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 1){
						double totalProbability = roundE[roundResults[i]+ (17*(currentRound-1))] + roundS[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundE[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+31);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 2){
						double totalProbability = roundS[roundResults[i]+ (17*(currentRound-1))] + roundE[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundS[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+47);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					
					else if(roundResults[0] == 17){
						double totalProbability = roundMW[roundResults[i]+ (17*(currentRound-1))] + roundE[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundMW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 18){
						double totalProbability = roundMW[roundResults[i]+ (17*(currentRound-1))] + roundS[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundMW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 19){
						double totalProbability = roundW[roundResults[i]+ (17*(currentRound-1))] + roundE[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+15);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 21){
						double totalProbability = roundW[roundResults[i]+ (17*(currentRound-1))] + roundS[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundW[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+15);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 71){
						double totalProbability = roundE[roundResults[i]+ (17*(currentRound-1))] + roundMW[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundE[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+31);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 81){
						double totalProbability = roundS[roundResults[i]+ (17*(currentRound-1))] + roundMW[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundS[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+47);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 91){
						double totalProbability = roundE[roundResults[i]+ (17*(currentRound-1))] + roundW[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundE[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+31);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					else if(roundResults[0] == 12){
						double totalProbability = roundS[roundResults[i]+ (17*(currentRound-1))] + roundW[roundResults[j]+ (17*(currentRound-1))];
						//finds the interest level (given by percentages above) for the given winner/loser
						range = this.whichRangeForQueries((int)((roundS[roundResults[i]+ (17*(currentRound-1))]/totalProbability) * 100));
						curr = teams.getTeams().get(roundResults[i]+47);
						if(winning){
							totalQueries[i] = winnerQueries[range];
							curr.setQueries(winnerQueries[range]);
						} else{
							totalQueries[i] = loserQueries[range];
							curr.setQueries(loserQueries[range]);
						}
					}
					break;
				}
			}
			j--;
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
