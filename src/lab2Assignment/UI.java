package lab2Assignment;

import java.util.LinkedList;
import java.util.Scanner;

public class UI {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the the number ");
		System.out.println("1 : Add Element ");
		System.out.println("2 : Delete Element ");
		System.out.println("3 : Print Elemnet From Head ");
		System.out.println("4 : Print Elemnet From Tail ");
		int number = sc.nextInt();
		
		String element = null;
		int position = 0;
		ListElement head = null;
		
		switch(number){
		case 1: addElements(element);
		case 2: delete(head,position);
		case 3: System.out.println("list");
		
	}

}

public static void addElements(String element) {
		
		String list = null;
		
		LinkedList<String> ListElement = new LinkedList<String>();
		
		ListElement.add(list);
	
	}

public static ListElement delete(ListElement head, int position) {
	  
    ListElement current = head;
    ListElement parent = null;
    
    int index = 0;
    
    while (current != null && index < position) {
    	
        parent = current;
        current = current.next;
        
        index++;
        
    }
    
    if (current != null && parent == null) {
        
        if (current.next != null) {
           
            head = current.next;
            
        }else {
            
            head = null;
            
        }
    }else if (current != null) {
       
        parent.next = current.next;
        
    }
    
    return head;
}
}
	