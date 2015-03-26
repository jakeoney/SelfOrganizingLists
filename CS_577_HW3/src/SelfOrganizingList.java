
public class SelfOrganizingList 
{
	public static final int NCAA_TOURNAMENT = 1;

	public static String midwest[] = {"", "Kentucky", "Kansas", "Notre Dame", "Maryland", "West Virginia", "Butler", "Wichita", 
		"Cincinnati", "Purdue", "Indiana", "Texas", "Buffalo", "Valparaiso", "Northeastern", "New Mexico State", "Hampton"};

	public static void main(String[] args){
		boolean modeMTF = false, modeTranspose = false, modeCount = false;
		boolean generateNCAAData = false;
		int scenario = 0;
		int i = 0;
		NCAA tournament = null;

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
		int winners[] = null; //index into the original participants array

		if(generateNCAAData){
			tournament = new NCAA();
			String participants[] = null;
			int roundQueries[] = null;
			String filename = "Round 1 Midwest Results.txt";
			for(int round = 1; round < 2; round++){
				if(round == 1){
					participants = midwest;
				}
				//find the winners for the given round
				winners = tournament.generateWinners(participants, round);
				
				//figure out the queries for each team that round
				GenerateQuery queries = new GenerateQuery(winners, round);
				roundQueries = queries.getQueries();
				
				//print the names of teams and number of queries per team to a file
				IO io = new IO(winners, roundQueries, round);
				io.writeRoundResultsToFile(filename);
				
				//reorder the participants such that participants /= 2
			}	
			
			//TESTING INFO//
			for(int z = 1; z < 17; z++){
				if(z == 1){
					System.out.println("--winners--");
				}
				else if(z == 9){
					System.out.println("--losers--");
				}
				System.out.println(midwest[winners[z]]);
				System.out.println(roundQueries[z]);
			}
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

}


