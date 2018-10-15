package Lab2Assignment2;

import org.w3c.dom.Node;

public class doubleLinkedList{
	
	
	public Node next;
	public Node prev;
	//private ListEl
	private int data;
	
	
	public doubleLinkedList(){
		
		this.next = null;
		this.prev = null;
		this.data = 0;
		
	}
	
	
	public void setData(int data){
		
		this.data = data;
	}

	
	public int getData(){
		
		return this.data;
		
	}
}
