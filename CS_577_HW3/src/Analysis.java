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
		else{
			this.normal();
		}
	}

	private void normal() {
		boolean found = false;
		String line;
		int value;
		long stepCount = 0;
		BufferedReader br = null;
		Iterator<LinkedNode> itr;
		LinkedNode currNode;
		try{
			br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			
			//this will get the file reader to the correct location
			while(!(line.equals("#queries"))){
				line = br.readLine();
			}
			
			line = br.readLine();
			//for each line. find the corresponding index in the Linked List and move it to the front
			while(line != null){
				value = Integer.parseInt(line);
				//split between two rounds
				if(value == -1){	
					System.out.println("Step Count = " + stepCount);	
				}
				itr = this.list.iterator();
				found = false;
				while(!found && itr.hasNext()){
					currNode = itr.next();
					stepCount++;
					if(currNode.getValue() == value){
						found = true;
					}
				}
				line = br.readLine();
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
		/*for(int i = 0; i < this.list.size(); i++){
			System.out.println(this.list.get(i).getName());
		}*/
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
		long stepCount = 0;
		try{
			br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			
			//this will get the file reader to the correct location
			while(!(line.equals("#queries"))){
				line = br.readLine();
			}
			
			line = br.readLine();
			//for each line. find the corresponding index in the Linked List and move it to the front
			while(line != null){
				value = Integer.parseInt(line);
				//split between two rounds
				if(value == -1){
					System.out.println("Step count is = " + stepCount);
				}
				itr = this.list.iterator();
				index = 0;
				found = false;
				while(!found && itr.hasNext()){
					currNode = itr.next();
					stepCount++;
					if(currNode.getValue() == value){
						found = true;
						if(index != 0){
							addToFront = this.list.remove(index);
							stepCount += index-1; 
							this.list.add(0, addToFront);
							stepCount += 3;
						}
					}
					index++;
				}
				line = br.readLine();
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
		/*for(int i = 0; i < this.list.size(); i++){
			System.out.println(this.list.get(i).getName());
		}*/
	}
	
	private void transpose() {
		boolean found = false;
		String line;
		int value;
		int index;
		long stepCount = 0;
		BufferedReader br = null;
		Iterator<LinkedNode> itr;
		LinkedNode currNode, swap;
		try{
			br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			
			//this will get the file reader to the correct location
			while(!(line.equals("#queries"))){
				line = br.readLine();
			}
			
			line = br.readLine();
			//for each line. find the corresponding index in the Linked List and move it to the front
			while(line != null){
				value = Integer.parseInt(line);
				//split between two rounds
				if(value == -1){
					System.out.println("step count is = " + stepCount);
				}
				itr = this.list.iterator();
				index = 0;
				found = false;
				while(!found && itr.hasNext()){
					stepCount++;
					currNode = itr.next();
					if(currNode.getValue() == value){
						found = true;
						if(index != 0){
							stepCount += index - 1 + 2; //2 is for storing two nodes
														//i-1 getting up to previous node
							swap = this.list.remove(index);
							this.list.add(index - 1, swap);
							stepCount += 3; //3 for swap operation
						}
					}
					index++;
				}
				line = br.readLine();
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
		/*for(int i = 0; i < this.list.size(); i++){
			System.out.println(this.list.get(i).getName());
		}*/
	}

	private void count() {
		boolean found = false;
		boolean done = false;
		String line;
		int value;
		int index;
		long stepCount = 0;
		BufferedReader br = null;
		Iterator<LinkedNode> itr;
		LinkedNode currNode;
		int temp = 0;
		LinkedNode swapPosition;
		try{
			br = new BufferedReader(new FileReader(filename));
			line = br.readLine();
			
			//this will get the file reader to the correct location
			while(!(line.equals("#queries"))){
				line = br.readLine();
			}
			
			line = br.readLine();
			//for each line. find the corresponding index in the Linked List and move it to the front
			while(line != null){
				value = Integer.parseInt(line);
				//split between two rounds
				if(value == -1){
					System.out.println("Step count is = " + stepCount);
				}
				itr = this.list.iterator();
				index = 0;
				found = false;
				done = false;
				while(!found && itr.hasNext()){
					currNode = itr.next();
					stepCount++;
					if(currNode.getValue() == value){
						found = true;
						int currCount = this.list.get(index).incrementCount();
						done = false;
						while(!done){
							if(index != 0){
								stepCount += index - 1;
								stepCount++; //for comparison
								if(currCount > this.list.get(index - 1).getCount()){
									stepCount += 3;//swap
									swapPosition = this.list.remove(index);
									this.list.add(index - 1, swapPosition);
									index = index - 1;
									temp++;
								}
								else{
									done = true;
								}
							}
							else{
								done = true;
							}
						}

					}
					index++;
				}
				line = br.readLine();
			}
			//once the file is over, take system time and note the time
			System.out.println("number of times we \"flopped\" nodes "+temp);

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
		/*for(int i = 0; i < this.list.size(); i++){
			System.out.println(this.list.get(i).getName());
		}*/
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
				System.exit(3);
			}
			while(!done){
				line = br.readLine();
				if(line.equals("#queries"))
				{
					done = true;
				}
				else{
					value = Integer.parseInt(line);
					line = br.readLine();
					name = line;
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
