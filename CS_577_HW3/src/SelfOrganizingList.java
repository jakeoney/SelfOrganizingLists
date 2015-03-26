/*0 MW 8 || 3 W 11
1 E 9 || 2 S 10

1, 2, 4, 5

17, 18, 19, 21
71, 81, 91, 12
*/

public class SelfOrganizingList 
{
	public static final int NCAA_TOURNAMENT = 1;

	public static String midwest[] = {"MIDWEST", "Kentucky", "Kansas", "Notre Dame", "Maryland", "West Virginia", "Butler", "Wichita", 
		"Cincinnati", "Purdue", "Indiana", "Texas", "Buffalo", "Valparaiso", "Northeastern", "New Mexico State", "Hampton"};

	public static String west[] = { "WEST", "Wisconsin", "Arizona", "Baylor", "North Carolina", "Arkansas", "Xavier", "VCU", "Oregon", "Oklahoma State",
			"Ohio State", "Mississippi", "Wofford", "Harvard", "Georgia State", "Texas Southern", "Costal Carolina"};
		
	public static String east[] = {"EAST", "Villanova", "Virginia", "Oklahoma", "Louisville", "Northern Iowa", "Providence", "Michigan State", "NC State",
			"LSU", "Georgia", "Dayton", "Wyoming", "UC Irvine", "Albany", "Belmont", "Lafayette"};
		
	public static String south[] = {"SOUTH", "Duke", "Gonzaga", "Iowa State", "Georgetown", "Utah", "Southern Methodist", "Iowa", "San Diego State", 
			"St Johns State", "Davidson", "UCLA", "Stephen F Austin", "Eastern Washington", "UAB", "North Dakota State", "Robert Morris"};
		
	
	public static void main(String[] args){
		boolean modeMTF = false, modeTranspose = false, modeCount = false;
		boolean generateNCAAData = false;
		int scenario = 0;
		int i = 0;

		//parse cmd line args
		while(i < args.length){
			if(args[i].equals("-m")){
				i++;
				if(args[i].equalsIgnoreCase("mtf")){
					modeMTF = true;
				}
				else if(args[i].equalsIgnoreCase("count")){
					modeCount = true;
				}
				else if(args[i].equalsIgnoreCase("transpose")){
					modeTranspose = true;
				}
			}
			else if(args[i].equals("-s")){
				i++;
				if(args[i].equalsIgnoreCase("ncaa")){
					scenario = NCAA_TOURNAMENT; //corresponds to ncaa
				}
			}
			else if(args[i].equals("-g"))
			{
				generateNCAAData = true;
				//then we will want to generate results for NCAA_tournament
			}
			else{
				System.out.println("Usage flags are:\n"
						+ "-m <mode>\t for which mode you want to run in, options are mtf, count, transpose\n"
						+ "-g\t\t to generate new NCAA tournament data\n"
						+ "-s <scenario>\t for the scenario you want to observe, options are ncaa, ...");
				System.exit(1);
			}
			i++;
		}

		
		//pass each query into private self organizing list
		//rounds 1-6 correspond to Midwest

		if(generateNCAAData){
			generateNCAATournamentInfo();
		}
		
		else if(scenario == NCAA_TOURNAMENT){

			if(modeMTF){

			}
			else if(modeCount){

			}
			else if(modeTranspose){

			}
		}

	}
	
	public static void generateNCAATournamentInfo(){
		NCAA tournament = new NCAA();
		int participants[] = null;
		int roundQueries[] = null;
		int winners[] = null; //index into the original participants array
		String filename = "results.txt";
		int finalFourLeft[] = new int[3]; // index starts at 1;
		int finalFourLeftCount = 1;
		int finalFourRight[] = new int[3]; // index starts at 1;
		int finalFourRightCount = 1;
		GenerateQuery queries = null;
		IO io = null;
		
		for(int round = 1; round < 5; round++){
			for(int division = 1; division < 5; division++){
			
				if(round == 1){
					participants = new int[midwest.length];
					for(int l = 0; l < midwest.length; l++){
						participants[l] = l;
					}
				}
				else{
					//reorder the participants such that participants /= 2
					participants = new int[(midwest.length / (2*(round-1)) ) + 1];
					for(int k = 1; k < participants.length; k++){
						participants[k] = winners[k];
					}
				}
				//find the winners for the given round
				winners = tournament.generateWinners(participants, round, division);
				if(round == 4){
					if(finalFourLeftCount == 3){
						finalFourRight[finalFourRightCount] = winners[1];
						finalFourRightCount++;
					}
					else{
						finalFourLeft[finalFourLeftCount] = winners[1];
						finalFourLeftCount++;
					}
					
				}
				//figure out the queries for each team that round
				queries = new GenerateQuery(winners, round, division);
				roundQueries = queries.getQueries();

				//print the names of teams and number of queries per team to a file
				io = new IO(winners, roundQueries, round, division);
				io.writeRoundResultsToFile(filename);
			}	
		}
		//in here we need to do the same thing but with the final 4
		int championship[] = new int[3];
		
		//handle the left side (ie the Midwest and West)
		winners = tournament.generateWinners(finalFourLeft, 5, 5);
		queries = new GenerateQuery(winners, 5, 5);
		roundQueries = queries.getQueries();
		io = new IO(winners, roundQueries, 5, 5);
		io.writeRoundResultsToFile(filename);
		championship[0] = winners[0];
		championship[1] = winners[1]; 
		
		//handle the right side (ie the East and South)
		winners = tournament.generateWinners(finalFourRight, 5, 6);
		queries = new GenerateQuery(winners, 5, 6);
		roundQueries = queries.getQueries();
		io = new IO(winners, roundQueries, 5, 6);
		io.writeRoundResultsToFile(filename);
		championship[0] += winners[0];

		championship[2] = winners[2];
		
		//in here we need to do the same thing but with the final 2
		winners = tournament.generateWinners(championship, 6, 7);
		queries = new GenerateQuery(winners, 6, 7);
		roundQueries = queries.getQueries();
		io = new IO(winners, roundQueries, 6, 7);
		io.writeRoundResultsToFile(filename);
	}
}


