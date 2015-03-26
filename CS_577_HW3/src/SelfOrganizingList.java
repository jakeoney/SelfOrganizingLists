
public class SelfOrganizingList 
{
	public static final int NCAA_TOURNAMENT = 1;
	
	public static String midwest[] = {"", "Kentucky", "Kansas", "Notre Dame", "Maryland", "West Virginia", "Butler", "Wichita", 
		"Cincinnati", "Purdue", "Indiana", "Texas", "Buffalo", "Valparaiso", "Northeastern", "New Mexico State", "Hampton"};
	
	public static void main(String[] args){
		boolean modeMTF = false, modeTranspose = false, modeCount = false;
		int scenario = 0;
		int i = 0;
		NCAA tournament = null;
		
		//parse cmd line args
		if(args.length == 4){
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
						tournament = new NCAA();
					}
				}
				i++;
			}
		}
		
		//pass each query into private self organizing list
		//rounds 1-6 correspond to Midwest
		int winners[] = null; //index into the original participants array

		if(scenario == NCAA_TOURNAMENT){
			String participants[] = null;
			int roundQueries[] = null;
			for(int round = 1; round < 2; round++){
				if(round == 1){
					participants = midwest;
				}

				if(modeMTF){
					//find the winners for the given round
					winners = tournament.generateWinners(participants, round);
					//figure out the queries for each team that round
					GenerateQuery queries = new GenerateQuery(winners, round);
					roundQueries = queries.getQueries();
					//print the names of teams and number of queries per team to a file
					
					//reorder the participants such that participants /= 2
				}
				else if(modeCount){
					
				}
				else if(modeTranspose){
					
				}
			}	
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
		//count number of times each team gets generated

	}

}


