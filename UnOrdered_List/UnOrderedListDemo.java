package DataStructurePrograms.UnOrdered_List;

import java.util.Scanner;

public class UnOrderedListDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of words to be printed: ");
		int N = sc.nextInt();
		
		UnOrderedListServices list = new UnOrderedListServices();
		
		//adding the words to a linkedList 
		System.out.println("Enter all the words with spaces in between: ");
		int i=0;
		while(i<N) {
			String addWord = sc.next();
			list.insertNode(addWord);
			i++;
		}
		System.out.println("You entered the following list:");
		list.displayList();
		System.out.println();
		
		System.out.println("Enter a word to search and remove or add it: ");
		String searchWord = sc.next();
		list.searchNode(searchWord);
	}

}
