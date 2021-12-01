package DataStructurePrograms.Ordered_LinkedList;

import java.util.Scanner;

public class OrderedListDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter how many numbers to be printed: ");
		int N = sc.nextInt();
		
		OrderedListService list = new OrderedListService();
		
		//adding the numbers to a linkedList in an ascending order 
		System.out.println("Enter all numbers: ");
		int i=0;
		while(i<N) {
			int addNumber = sc.nextInt();
			list.insertInOrder(addNumber);
			i++;
		}
		System.out.println("You entered the following list:");
		list.displayList();
		System.out.println();
		
		System.out.println("Enter a number you want to pop out or insert:");
		int searchNumber = sc.nextInt();
		list.searchNode(searchNumber);
		list.displayList();

	}
	
}
