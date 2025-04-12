package Practice2;

import java.util.*;

public class HashMap2 {

	class Node{
		int key;
		String value;
		
		Node(int key, String value){
			this.key = key;
			this.value = value;
			
	}}
	
	

	private LinkedList<Node>[] buckets;
	private int n; //  no of nodes
	private int N; // size
	
	public HashMap2{
		N=4;
		buckets = new LinkedList[N];
		for(int i=0;i<N;i++) {
			buckets[i] = new LinkedList<>();
		}
		n=0;
			
		}
	
	private int hashFunction(int key) {
		return Math.abs(Objects.hash(key)) % N;
	}
	
	
	
	
	
	
	
		
	}
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
}
