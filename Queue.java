import java.util.*;
public class Queue {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DemoQ queue = new DemoQ();
		
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

class DemoQ
{
	int MAX_LENGTH = 5;
	int arr[] = new int[MAX_LENGTH];
	int size=0;
	int front=0;
	int rear=0;
	
	public void enQueue(int a)
	{
		if(rear < MAX_LENGTH)
		{
			arr[rear] = a;
			rear++;
			size++;
		}
		else
			System.out.println("OVERFLOW");
	}
	
	public void deQueue()
	{
		if(front != rear)			//remember the condition
		{
			System.out.println("Removed "+arr[front]);
			front++;
			size--;
		}
		else
		{
			System.out.println("UNDERFLOW");		//remember the next two lines.
			front=0;
			rear=0;
		}
		
		
			
	}
	public void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}
}