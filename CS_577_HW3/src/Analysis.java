import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;


public class Analysis
{
	private String filename;
	private int type;
	private LinkedList<LinkedNode> list;
	
	public Analysis(String filename, int type){
		this.type = type;
		this.filename = filename;
		this.buildList();
		
		if(type == SelfOrganizingList.MTF){
			this.moveToFront();
		}
		else if(type == SelfOrganizingList.COUNT){
			this.count();
		}
		else if(type == SelfOrganizingList.TRANSPOSE){
			this.transpose();
		}
	}

	private void moveToFront() 
	{	
		boolean found = false;
		String line;
		int value;
		int index;
		BufferedReader br = null;
		Iterator<LinkedNode> itr;
		LinkedNode currNode, addToFront;
		try{
			br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			
			//this will get the file reader to the correct location
			while(!(line.equals("#queries"))){
				line = br.readLine();
			}
			
			double startTime = System.currentTimeMillis();
			//for each line. find the corresponding index in the Linked List and move it to the front
			while(line != null){
				line = br.readLine();
				value = Integer.parseInt(line);
				itr = this.list.iterator();
				index = 0;
				while(!found && itr.hasNext()){
					currNode = itr.next();
					index++;
					if(currNode.getValue() == value){
						found = true;
						addToFront = this.list.remove(index);
						this.list.add(0, addToFront);
					}
				}
				
			}

			
		} catch(IOException e){
			System.out.println("File IO problems");
			System.exit(1);
		} catch(NumberFormatException e){
			System.out.println("Value was not in correct format");
			System.exit(2);
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("File IO problems");
				System.exit(1);
			}
		}
	}
	
	private void transpose() {
		// TODO Auto-generated method stub
		
	}

	private void count() {
		// TODO Auto-generated method stub
		
	}

	private void buildList() {
		boolean done = false;
		this.list = new LinkedList<LinkedNode>();
		String line;
		String name;
		int value;
		LinkedNode toAdd;
		int count = 0;
		BufferedReader br = null;
		try{
			br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			if(!(line.equals("#defs"))){
				System.out.println("file in a bad format...");
				System.exit(3);
			}
			while(!done){
				line = br.readLine();
				if(line.equals("#queries"))
				{
					done = true;
				}
				else{
					name = line;
					line = br.readLine();
					value = Integer.parseInt(line);
					toAdd = new LinkedNode(name, value, count);
					this.list.add(toAdd);
				}
			}			
		} catch(IOException e){
			System.out.println("File IO problems");
			System.exit(1);
		} catch(NumberFormatException e){
			System.out.println("Value was not in correct format");
			System.exit(2);
		} finally{
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("File IO problems");
				System.exit(1);
			}
		}
	}

}
