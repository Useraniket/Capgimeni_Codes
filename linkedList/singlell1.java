package linkedList;



public class singlell1 {
 private Node head;
 private Node tail;
 private int size=0;
 private class Node
 {
	 int value;
	 Node next;
	 Node(int value)
	 {
		 this.value=value;
	 }
 }
 public boolean delete(int value)
 {
	 if(isemppty())
	 {
		 return false;
	 }
	 if (head.value == value) {
         if (head == tail) { 
             head = tail = null;
         } else {
             head = head.next;
         }
         size--;
         return true;
     }

  
     Node temp = head;
     while (temp != null && temp.next != null) {
         if (temp.next.value == value) {
      
             if (temp.next == tail) {
                 tail = temp;
             }
             temp.next = temp.next.next;
             size--;
             return true;
         }
         temp = temp.next;
     }

     return false; 
 }
 public boolean deletelast(int value) {
     if (isemppty()) {
         return false;
     }
     if (head.value == value) {
         if (head == tail) {
             head = tail = null;
         } else {
             head = head.next;
         }
         size--;
         return true;
     }

     Node temp = head;
     while (temp != null && temp.next != null) {
         if (temp.next.value == value) {
             if (temp.next.next == null) {
                 temp.next = null;
             }
             size--;
             return true;
         }
         temp = temp.next;
     }

     return false;
 }

 public boolean deleteAtIndex(int index) {
	    if (isemppty()) {
	        return false;
	    }
	    if (index == 0) {
	        head = head.next;
	        if (head == null) {
	            tail = null;
	        }
	        size--;
	        return true;
	    }
	    Node temp = head;
	    for (int i = 0; i < index - 1; i++) {
	        temp = temp.next;
	    }
	    if (temp.next == tail) {
	        tail = temp;
	    }
	    temp.next = temp.next.next;
	    size--;
	    return true;
	}
public int getSize()
{
	int count=0;
	for(int i=0;i<size;i++)
	{
		if(head.next==null)
		{
			count++;
		}
	}
	return count;
}
 public boolean insert(int value,int index)
 {
	 
	 if(index<=0)
	 {
		return prepend(value);
	 }
	 else if(index>=size)
	 {
		 return append(value);
	 }
	 Node node=new Node(value);
	 Node temp=head;
	 Node prev=null;
	 int i=0;
	 while(i!=index)
	 {
		 prev=temp;
		 temp=temp.next;
		 i++;
	 }
	 prev.next=node;
	 node.next=temp;
	 size++;
	 return true;
 }
 public boolean reverse()
 {
	 if(isemppty())
	 {
		 return false;
	 }
	 Node prev=null;
	 Node current=head;
	 Node next=null;
	 tail=head;
	 while(current!=null)
	 {
		 next=current.next;
		 current.next=prev;
		 prev=current;
		 current=next;
	 }
	 head=prev;
	return true;
}
 public  boolean prepend(int value)//preponed at the first position
 { 
	 Node node=new Node(value);
	 if(isemppty())
	 {
		 head=node;
		 tail=node;
	 }
	 else
	 {
		 node.next=head;
		 head=node;
	 }
	 return true;
 }
 public void display()//to display the ll
 {
	  Node temp=head;
	  StringBuffer sb=new StringBuffer("[");
	  while(temp!=null)
	  {
		  sb.append(temp==head?temp.value:temp.value+",");
		  temp=temp.next;
	  }
	  sb.append("]");
	  System.out.println(sb);
 }
 public boolean append(int value)//to append values in the ll
 {
	 Node node=new Node(value);
	 if(isemppty())
	 {
		 head=node;
		 tail=node;
	 }
	 else
	 {
		 tail.next=node;
		 tail=node;
	 }
	 size++;
	 return true;
 }
private boolean isemppty() {//to check wheather the ll is empty or not
	return head==null&& tail==null;
}

}
