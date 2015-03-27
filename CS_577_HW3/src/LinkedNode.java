
public class LinkedNode 
{
	private String name;
	private int value;
	private int count;
	
	public LinkedNode(String name, int value, int count){
		this.name = name;
		this.value = value;
		this.count = count;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public int getCount(){
		return this.count;
	}
	
	public void incrementCount(){
		this.count = this.count + 1;
	}
}
