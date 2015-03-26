import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class IO 
{
	private final String midwest[] = {"MIDWEST", "Kentucky", "Kansas", "Notre Dame", "Maryland", "West Virginia", "Butler", "Wichita", 
			"Cincinnati", "Purdue", "Indiana", "Texas", "Buffalo", "Valparaiso", "Northeastern", "New Mexico State", "Hampton"};

	public final String west[] = { "Wisconsin", "Arizona", "Baylor", "North Carolina", "Arkansas", "Xavier", "VCU", "Oregon", "Oklahoma State",
		"Ohio State", "Mississippi", "Wofford", "Harvard", "Georgia State", "Texas Southern", "Costal Carolina"};
	
	public final String east[] = {"Villanova", "Virginia", "Oklahoma", "Louisville", "Northern Iowa", "Providence", "Michigan State", "NC State",
		"LSU", "Georgia", "Dayton", "Wyoming", "UC Irvine", "Albany", "Belmont", "Lafayette"};
	
	public final String south[] = {"Duke", "Gonzaga", "Iowa State", "Georgetown", "Utah", "Southern Methodist", "Iowa", "San Diego State", 
		"St Johns State", "Davidson", "UCLA", "Stephen F Austin", "Eastern Washington", "UAB", "North Dakota State", "Robert Morris"};
	
	private int participants[];
	private int queries[];
	private int round;

	public IO(int[] participants, int[] queries, int round){
		this.participants = participants;
		this.queries = queries;
		this.round = round;
	}

	public boolean writeRoundResultsToFile(String filename){
		boolean writeSuccessful = false;
		try{
		BufferedWriter outputWriter = null;
		if(round == 1){
			outputWriter = new BufferedWriter(new FileWriter(filename));
		}
		else{
			outputWriter = new BufferedWriter(new FileWriter(filename, true));
		}
		outputWriter.write(midwest[0] + " Round " + round);
		outputWriter.newLine();
		for (int i = 1; i < participants.length; i++) {
			
			// write name of team
			outputWriter.write(midwest[participants[i]] + ", ");
			
			outputWriter.write(Integer.toString(queries[i]));
			outputWriter.newLine();
		}
		outputWriter.newLine();
		writeSuccessful = true;
		outputWriter.flush();  
		outputWriter.close();
		} catch (IOException e){
			System.out.println("Error Writing to File");
			System.exit(2);
		} catch (NumberFormatException e){
			System.out.println("Query number wasn't a number?");
			System.exit(2);
		}
		
		return writeSuccessful;
	}
}
