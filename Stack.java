import java.util.*;
public class Stack {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DemoStack stack = new DemoStack();
		
		while(true)
		{
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit\n5.Peek\n6.SizeOfArray\n7.IsEmpty");
			char ch = sc.next().charAt(0);
			
			switch(ch)
			{
			case '1':
				System.out.println("Enter the number you want to push :");
				int x = sc.nextInt();
				stack.push(x);
				System.out.println("--------------------------------------------------------");
				break;
			case '2':
				int y = stack.pop();
				System.out.println("--------------------------------------------------------");
				break;
			case '3':
				stack.show();
				System.out.println("--------------------------------------------------------");
				break;
			case '4':
				System.exit(0);
				break;
			case '5':
				stack.peek();
				System.out.println("--------------------------------------------------------");
				break;
			case '6':
				stack.SizeOfStack();
				System.out.println("--------------------------------------------------------");
				break;
			case '7':
				boolean state = stack.IsEmpty();
				if (state == true)
				System.out.println("Stack is Empty");
				else
				{
					//System.out.println("Stack is Not Empty");
					stack.show();
				}	
				System.out.println("--------------------------------------------------------");
				break;
			default :
				System.out.println("Enter correct choice");
			}
		}
	//sc.close();
	}
}

class DemoStack
{
	int MAX_LENGTH = 5;
	int arr[] = new int[MAX_LENGTH];
	int top = 0;
	public void push(int a)
	{
		if(top < MAX_LENGTH)
		{
			arr[top] = a;
			System.out.println("pushed "+a);
			top++;
		}
		else
			System.out.println("OVERFLOW");
	}
	public int pop()
	{
		int z=0;
		if(top >= 0)
		{
			z = arr[top-1];		//remember always pop from top-1;
			System.out.println("Popped "+z);
			top--;
		}
		else
			System.out.println("UNDERFLOW");
		
		return z;
	}
	public void show()
	{
		if(top==0)
			System.out.println("Stack is empty");
		else
		{
			for(int i=top-1;i>=0;i--)
				System.out.println(arr[i]);	
		}
	}
	public void peek()
	{
		if(IsEmpty())
		{
			System.out.println("Stack is empty");
		}
		else	
		System.out.println(arr[top-1]);
	}
	public void SizeOfStack()
	{
		System.out.println(top);
	}
	public boolean IsEmpty()
	{
		return top<=0;		//if top is at 0 means stack is empty
	}
}
