package capgemini.day5;
// Write a program to check whether the given strings are anagram or not
import java.util.Scanner;
public class Counttheoccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S1 = "srivathsan";
		char[] c1 = S1.toCharArray();
		char c2;
		System.out.println("Enter a character:");
		Scanner sc = new Scanner(System.in);
		c2 = sc.next().charAt(0);
		int count = 0;
		
		for(int i =0;i<S1.length();i++) {
			if(c2== c1[i]) {
				count++;
				
			}
		}
		System.out.println("The character is occured: "+count+" times");
		

	}

}
