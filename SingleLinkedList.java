import java.util.Scanner;
class node
{
	int info;
	node next;
}
public class SingleLinkedList 
{
	static node start=null;
	public static void insany()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter position");
		int pos=sc.nextInt();
		int count=0;
		node q=start;
		while(q!=null)
		{
			count++;
			q=q.next;
		}
		if(pos>(count+1))
		{
			System.out.println("Insertion not possible");
		}
		else
		{
			if(pos==1)
			{
				insbeg();
			}
			else if(pos==(count+1))
			{ 
			insend();
			}
			else
			{
				node p=new node();
				System.out.println("Enter info");
				p.info=sc.nextInt();
			    q=start;
				int i=1;
				while(i<=(pos-2))
				{
					q=q.next;
					i++;
				}
				p.next=q.next;
				q.next=p;
			}
		}
	}
	public static void insend()
	{
		node p=new node();
		Scanner sc = new  Scanner(System.in);
		System.out.println("Enter info");
		p.info=sc.nextInt();
		p.next=null;
		if(start!=null)
		{
			node q=start;
			while(q.next!=null) 
			{
			 q=q.next;	
			}
			q.next=p;
		}
		else
		{
			start=p;
		}
	}
	public static void insbeg()
	{
		node p = new node();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter info to insert at beginning");
		p.info=sc.nextInt();
		p.next=start;
		start=p;
	}
	public static void delbeg()
	{
		if(start==null)
		{
			System.out.println("Linked List is empty");
		}
		else
		{
			node q=start;
			start=q.next;
			q.next=null;
			System.out.println("Deleted node is"+ q.info);
		}
	}
	public static void delend()
	{
		if(start==null)
		{
			System.out.println("Linked list is empty");
		}
		else if(start.next==null)
		{
			System.out.println("deleted node is"+start.info);
		}
		else
		{
			node q=start;
			while(q.next.next!=null)
			{
				q=q.next;
			}
			System.out.println("deleted node is"+q.next.info);
			q.next=null;
		}
	}
	public static void delany()
	{
		if(start==null)
		{
			System.out.println("Linked List is Empty");
		}
		else
		{
			int count=0;
			node q = start;
			while(q!=null)
			{
				q=q.next;
				count++;
			}
			Scanner sc=new Scanner(System.in);
			System.out.println("enter position");
			int pos=sc.nextInt();
			if(pos>count) 
			{
				System.out.println("deletion not possible");
			}
			else
			{
				if(pos==1)
				{
					delbeg();
				}
				else if(pos==count)
				{
					delend();
				}
				else
				{
					q=start;
					int i=1;
					while(i<=pos-2)
					{
						i++;
						q=q.next;
					}
					node t=q.next;
					q.next=t.next;
					t.next=null;
					System.out.println("deleted node is"+t.info);
				}
			}
		}
	}
	public static void Search()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter key");
		int k=sc.nextInt();
		node q= start;
		int pos=1;
		int flag=0;
		while(q!=null)
		{
			if(q.info==k)
			{
				flag=1;
				System.out.println("search is successful & node found is"+pos);
				break;
			}
			pos++;
			q=q.next;
		}
		if(flag==0)
		{
			System.out.println("serach is unsuccessful");
		}
	}
	public static void Reverse()
	{
		if(start==null)
		{
			System.out.println("Linked List is empty");
		}
		else if(start.next==null)
		{
			System.out.println("Reversal is not required");
		}
		else
		{
		node p=null,q=start,r=start.next;
		while(r!=null)
		{
			p=q;
			q=r;
			r=r.next;
			q.next=p;
		}
		start.next=null;
		start=q;
		}
	}
	public static void Sort()
	{
		int t;
		node p=start,q;
		while(p!=null)
		{
			q=p.next;
			while(q!=null)
			{
				if(p.info>q.info)
				{
					t=p.info;
					p.info=q.info;
					q.info=t;
				}
				q=q.next;
			}
			p=p.next;
		}
	}
	public static void create() 
	{
	
		Scanner sc = new Scanner(System.in);
		node q = new node();
		char ch;
		do
		{	node p = new node();
			System.out.println("Enter info ");
		    p.info=sc.nextInt();
		    p.next=null;
		    if(start==null)
		    {
		    	start=p;
		    	q=p;
		    }
		    else
		    {
		    	q.next=p;
		    	q=p;
		    }
		    System.out.println("Do you want to create more nodes(y/n");
		    ch=sc.next().charAt(0);
		}while(ch!='n');
	}
	public static void display()
	{
		if(start==null)
		{
			System.out.println("Linked List is Empty");
		}
		
		{
			node q=start;
			while(q!=null)
			{
				System.out.print(q.info+"---->");
				q=q.next;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("*****MENU****");
			System.out.println("0: Exit");
			System.out.println("1: Creation");
			System.out.println("2: Display");
			System.out.println("3: Insert at Beginning");
			System.out.println("4: insert at end");
			System.out.println("5: insert at any point");
			System.out.println("6: delete at beginning");
			System.out.println("7: delete at end");
			System.out.println("8: delete at any point");
			System.out.println("9: let's Search");
			System.out.println("10:let's Reverse");
			System.out.println("11:let's Sort");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			  case 0:
				  System.exit(0);
			  case 1:
				  create();
				  break;
			  case 2:
				  display();
				  break;
			  case 3:
				  insbeg();
				  break;
			  case 4:
				  insend();
				  break;
			  case 5:
				  insany();
				  break;
			  case 6:
				  delbeg();
				  break;
			  case 7:
				  delend();	
				  break;
			  case 8:
				  delany();
				  break;
			  case 9:
			      Search();
			      break;
			  case 10:
				  Reverse();
				  break;
			  case 11:
				  Sort();
				  break;
			  default:
			      System.out.println("Wrong choice");
				
			
			}
		}
		

	}

}