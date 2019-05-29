import java.util.Scanner;

public class LinkedList {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		DemoLinkList list = new DemoLinkList();
		
		while(true)
		{
			System.out.println("1.Insert\n2.DeleteAt\n3.Display\n4.Exit\n5.Insert_Begin\n6.InsertAt\n7.Size");
			char ch = sc.next().charAt(0);
			
			switch(ch)
			{
			case '1':
				System.out.println("Enter the number you want to insert :");
				int x = sc.nextInt();
				list.insert(x);
				System.out.println("--------------------------------------------------------");
				break;
			case '2':
				System.out.println("Enter the node you want to delete :");
				int x2 = sc.nextInt();
				list.deleteAt(x2);
				System.out.println("--------------------------------------------------------");
				break;
			case '3':
				list.show();
				System.out.println("--------------------------------------------------------");
				break;
			case '4':
				System.exit(0);
				break;
			case '5':
				System.out.println("Enter the number you want to insert :");
				int x5 = sc.nextInt();
				list.insertBegin(x5);
				System.out.println("--------------------------------------------------------");
				break;
			case '6':
				System.out.println("Enter the index position and data to insert :");
				int index = sc.nextInt();
				int x6 = sc.nextInt();
				list.insertAt(index,x6);
				System.out.println("--------------------------------------------------------");
				break;
			case '7':
				list.Size();
				System.out.println("--------------------------------------------------------");
				break;
			default :
				System.out.println("Enter correct choice");
			}
		}
	}
}

class DemoLinkList
{
	Node head;
	
	class Node
	{
		int data;
		Node next;
		Node(int value)
		{
			//System.out.println("In node class");
			data = value;
			next = null;
		}
	}
	public void insert(int data)
	{
		Node node = new Node(data);
		
		if(head==null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next!=null){
				temp = temp.next;
			}
			temp.next = node;
		}
		
	}
	public void insertBegin(int data)
	{
		Node node = new Node(data);
		node.next = head;
		head = node;
	}
	public void insertAt(int index,int data) {
		Node node = new Node(data);
		
		Node temp = head;
		for(int i=0;i<index-1;i++){
			temp = temp.next;
		}
		node.next = temp.next;
		temp.next = node;
	}
	public void deleteAt(int pos)
	{
		if(pos == 0){
			head = head.next;
		}
		else{
			Node temp = head;
			
			for(int i=0;i<pos-1;i++){
				temp = temp.next;
			}
			
			Node temp1 = temp.next;
			temp.next = temp1.next;
		}
	}
	public void show()
	{
		Node temp = head;
		while(temp.next!=null){
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.print(temp.data);
		System.out.println();
	}
	public void Size()
	{
		Node temp=head;
		int count=0;
		while(temp.next!=null){
			count++;
			temp = temp.next;
		}
		count++;
		System.out.println("Number of nodes = "+count);
	}
}