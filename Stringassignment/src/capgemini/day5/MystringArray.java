package capgemini.day5;
import java.util.Arrays;
import java.util.Scanner;
public class MystringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = sc.nextInt();
		String[] strarr = new String[size];
		for(int i=0;i<strarr.length;i++) {
			System.out.println("Enter the string");
			strarr[i] = sc.next();
		}
		System.out.println("STRING ARRAY: "+Arrays.toString(strarr));
	}

}
