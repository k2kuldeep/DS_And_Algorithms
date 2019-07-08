import java.util.Scanner;
public class DoublyLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DemoDoublyLinkedList dlist = new DemoDoublyLinkedList();
		
		while(true)
		{
			System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
			char ch = sc.next().charAt(0);
			
			switch(ch)
			{
			case '1':
				System.out.println("Enter the number you want to insert :");
				int x = sc.nextInt();
				dlist.insert(x);
				System.out.println("--------------------------------------------------------");
				break;
			case '2':
				System.out.println("Enter the node you want to delete :");
				int x2 = sc.nextInt();
				dlist.deleteAt(x2);
				System.out.println("--------------------------------------------------------");
				break;
			case '3':
				dlist.show();
				System.out.println("--------------------------------------------------------");
				break;
			case '4':
				System.exit(0);
				break;
			default :
				System.out.println("Enter correct choice");
			}
		}
	}
}
class DemoDoublyLinkedList
{
	Node head;
	class Node
	{
		int data;
		Node prev;
		Node next;
		Node(int d){
			data = d;
			prev = null;
			next = null;
		}
	}
	public void insert(int x) {
		// TODO Auto-generated method stub
		Node node = new Node(x);
		if(head == null){
			head = node;
		}
		else{
			Node temp = head;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = node;
			node.prev = temp;
		}
		System.out.println(x+" inserted");
	}
	public void deleteAt(int x2) {
		// TODO Auto-generated method stub
		Node temp = head;
		if(x2 == 0){
			head = head.next;
		}
		else{
			while(x2 != 0){
				temp = temp.next;
				x2 -= 1;
			}
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}
		
		System.out.println(temp.data+" deleted");
		
	}
	public void show() {
		// TODO Auto-generated method stub
		Node temp = head;
		while(temp.next != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
		System.out.println(temp.data);
		
		System.out.println("list in reverse order");
		while(temp.prev != null){
			System.out.println(temp.data);
			temp = temp.prev;
		}
		System.out.println(temp.data);
	}
}