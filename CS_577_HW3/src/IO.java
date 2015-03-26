import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class IO 
{
	private final String midwest[] = {"MIDWEST", "Kentucky", "Kansas", "Notre Dame", "Maryland", "West Virginia", "Butler", "Wichita", 
			"Cincinnati", "Purdue", "Indiana", "Texas", "Buffalo", "Valparaiso", "Northeastern", "New Mexico State", "Hampton"};

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
