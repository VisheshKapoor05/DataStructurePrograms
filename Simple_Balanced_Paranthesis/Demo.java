package DataStructurePrograms.Simple_Balanced_Paranthesis;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the whole String having paranthesis: ");
		String string = sc.next();
		
		BalancedParanthesisCheck obj = new BalancedParanthesisCheck();
		boolean result = obj.paranthesisCheck(string);
		System.out.println(result);
	}

}
