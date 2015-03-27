
public class Team 
{ 	
	private String name;
	private int index;
	private double round1;
	private double round2;
	private double round3;
	private double round4;
	private double round5;
	private double round6;
	private int queries;

	public Team(String name, int index, double round1, double round2, double round3, double round4, double round5, double round6)
	{
		this.name = name;
		this.index = index;
		this.round1 = round1;
		this.round2 = round2;
		this.round3 = round3;
		this.round4 = round4;
		this.round5 = round5;
		this.round6 = round6;
		queries = 0;
	}

	public String getName(){
		return this.name;
	}

	public int getIndex(){
		return this.index;
	}

	public double getRoundPercent(int round){
		if(round == 1){
			return this.round1;
		}
		if(round == 2){
			return this.round2;
		}
		if(round == 3){
			return this.round3;
		}
		if(round == 4){
			return this.round4;
		}
		if(round == 5){
			return this.round5;
		}
		else
			return this.round6;
	}
	
	public void setQueries(int queries){
		this.queries = queries;
	}
	
	public int getQueries(){
		return this.queries;
	}
	
	public void decrementQueries(){
		this.queries = this.queries - 1;
	}
}




