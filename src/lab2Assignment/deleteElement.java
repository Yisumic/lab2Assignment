package lab2Assignment;



public class deleteElement {
	
	ListElement Delete(ListElement head, int position) {
	  
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
