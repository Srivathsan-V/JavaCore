package capgemini.day5;
import java.util.Scanner;
//Write a program to print the duplicate characters in a string

public class Duplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String S1 = "Srivathsan";
		int count;
		Scanner sc = new Scanner(System.in);
		
		//declare a character array with length 10
		//Read the string from user and add it into the character array.
		char[] ch1 = new char[10];
		System.out.println("Enter the string: ");
		String S1 = sc.next();
		
		for(int i=0;i<10;i++) {
			char ch2 = S1.charAt(i);
			ch1[i] = ch2;
		}
		
		System.out.println(ch1);
		

		//char string[] = S1.toCharArray();

		System.out.println("Duplicate characters: ");
		for (int i = 0; i < ch1.length; i++) {
			count = 1;
			for (int j = i + 1; j < ch1.length; j++) {
				if (ch1[i] == ch1[j] && ch1[i] != ' ') {
					count++;
					ch1[j] = '0';
				}
			}
			if (count > 1 && ch1[i] != '0')
				System.out.println(ch1[i]);
		}
	}
}
