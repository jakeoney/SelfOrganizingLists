import java.util.ArrayList;

public class SelfOrganizingList 
{
	public static final int NCAA_TOURNAMENT = 1;
	
	
	public static void main(String[] args){
		boolean modeMTF = false, modeTranspose = false, modeCount = false;
		int scenario = 0;
		int i = 0;
		NCAA tournament;
		
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
		if(scenario == NCAA_TOURNAMENT){
			if(modeMTF){
				
			}
				
		}
		//count number of times each team gets generated

	}

}


