package lab2Assignment;

import java.util.LinkedList;
import java.util.Scanner;

public class UI {
	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		ListElement head = null;
		ListElement linkedList = null;
		ListElement revise = null;
		String element = null;
		int number = 0;
		int position = 0;
	
		while(number != 5) {	
			
		Scanner Sc= new Scanner(System.in);
		System.out.println("Please enter the the number ");
		System.out.println("1 : Add Element ");
		System.out.println("2 : Delete Element ");
		System.out.println("3 : Print Elemnet From Head ");
		System.out.println("4 : Print Elemnet From Tail ");
		System.out.println("5: quit");
		
		number = Sc.nextInt();
		
		
		
		switch(number){
		case 1: addElements(element);break;
		case 2: delete(head,position);break;
		case 3: System.out.println(linkedList);break;
		case 4: System.out.println(revise);break;
		case 5: break;
		
		}
		}
	}

public static void addElements(String element) {
		
		String list;
		LinkedList<String> ListElement = new LinkedList<String>();
		
		System.out.println("Please enter the the elements ");
		Scanner ele= new Scanner(System.in);
		list = ele.nextLine();
		
		ListElement.add(list);
		
		
		
}

public static ListElement delete(ListElement head, int position) {
	  
    ListElement current = head;
    ListElement parent = null;
    
    int index = 0;
    
    System.out.println("Please enter the the elements position ");
    Scanner po= new Scanner(System.in);
    position = po.nextInt();
    
    
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
	