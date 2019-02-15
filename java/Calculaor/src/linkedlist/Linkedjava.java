package linkedlist;

public class Linkedjava 
{
  Node head;
  
  public void insert(int data)
  {
	  Node node=new Node();
	  Node.Data=data;
	  node.next=null;
	  
	  if(head==null)
	  {
		  head=node;
	  }
	  else
	  {
		  
		  Node n=head;
		  while(n.next!=null)
		  {
			  n=n.next;
		  }
		  n.next = node;
	  }
	  
  }
  
  public void show()
  {
	  Node node=head;
	  
	  while(node.next!= null)
	  {
		  System.out.println(node.Data);
		  node=node.next;
	  }
	 // System.out.println(node.Data);
  }
  
  


  
  
  
  
  
  
  
  
  }
	
	
	

