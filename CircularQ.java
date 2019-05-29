import java.util.Scanner;
public class CircularQ {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DemoCirQ queue = new DemoCirQ();
		
		while(true)
		{
			System.out.println("1.EnQueue\n2.DeQueue\n3.Display\n4.Exit");
			char ch = sc.next().charAt(0);
			
			switch(ch)
			{
			case '1':
				System.out.println("Enter the number you want to Push");
				int x = sc.nextInt();
				queue.enQueue(x);
				break;
			case '2':
				queue.deQueue();
				break;
			case '3':
				queue.display();
				break;
			case '4':
				System.exit(0);
				break;
			default :
				System.out.println("Enter correct choice");
			}
		}
		//sc.close();
	}
}

class DemoCirQ
{
	int MAX_LENGTH = 5;
	int arr[] = new int[MAX_LENGTH];
	int front=-1;						//if front and rear are -1 then make one case to insert first element
	int rear=-1;
	
	public void enQueue(int value)
	{
		if ((rear+1)%MAX_LENGTH == front) 
	    { 
			System.out.println("OVERFLOW"); 
	    } 
	  
	    else if (front == -1) /* Insert First Element */
	    { 
	        front = rear = 0; 
	        arr[rear] = value; 
	    } 
	  
	    else if (rear == MAX_LENGTH-1 && front != 0)		//to return back to 0 in circle
	    { 
	        rear = 0; 
	        arr[rear] = value; 
	    } 
	  
	    else
	    { 
	        rear++; 
	        arr[rear] = value; 
	    } 
	
	}
	public void deQueue()		//in this we just move front one ahead
	{
		if(front==-1 && rear==-1)		//no element entered and removing
		{
			System.out.println("UNDERFLOW");
		}
		else if(front == MAX_LENGTH-1)  
        {  
			front = 0;  
		} 
		else if(front == rear)		//if last elements at any location is removed
		{  
	        front = -1;  
	        rear = -1;  
	    }
	    else   
	        front = front + 1;  	
	}
	public void display()
	{
		 if (front == -1) 
		    { 
			 System.out.println("Queue is Empty"); 
		    } 
		 //System.out.println("Elements in Circular Queue are: "); 
		 else if (rear >= front)		//check for greater or equal
		    { 
		        for (int i = front; i <= rear; i++) 
		        	System.out.print(arr[i]+"\t"); 
		    } 
		    else
		    { 
		        for (int i = front; i < MAX_LENGTH; i++) 
		        	System.out.print(arr[i]+"\t"); 
		  
		        for (int i = 0; i <= rear; i++) 
		        	System.out.print(arr[i]+"\t"); 
		    }
		    System.out.println();
	}
}