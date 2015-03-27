
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
	
	//this returns its value so that we can compare it to the other values
	public int incrementCount(){
		this.count = this.count + 1;
		return this.count;
	}
}
