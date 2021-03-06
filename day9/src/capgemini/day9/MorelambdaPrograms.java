package capgemini.day9;
import java.util.Scanner;
import java.util.*;
import java.lang.StringBuffer;


interface strstartswitha{
	public void strarraywithA(StringBuffer[] strarray);
}
interface concattwostrings{
	public void combinetwostr(String s1,String S2);
}

interface printnum{
	public void printnumbers();
}

interface chartonum{
	public void convert(char c1);
}

interface maxnum{
	public void maximumnum(int a,int b,int c);
}

interface minnum{
	public void minimumnum(int a,int b,int c);
}

interface avgnum{
	public void averagenum(int[] arr1);
}
public class MorelambdaPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String1");
		String s3 = sc.next();
		System.out.println("Enter String2");
		String s4 = sc.next();
		
		concattwostrings combine = (x1,x2)->{
			System.out.println("After Combining two Strings "+x1.concat(x2));
		};
		combine.combinetwostr(s3, s4);
		
		printnum pn = ()->{
			for(int i=0;i<101;i++) 
				System.out.println("Numbers From 1 to 100 "+i);
		};
		pn.printnumbers();
		
		
		System.out.println("Enter the character");
		char c2 = sc.next().charAt(0);
		chartonum ch = (y)->{
			System.out.println("After Conversion: "+ Character.getNumericValue(y));
		};
		ch.convert(c2);
		
		System.out.println("Enter the number1");
		int n1 = sc.nextInt();
		System.out.println("Enter the number2");
		int n2 = sc.nextInt();
		System.out.println("Enter the number3");
		int n3 = sc.nextInt();
		 maxnum mn = (x1,x2,x3)->{
			 if(x1>x2&&x1>x3) {
				 System.out.println("The maximum number is "+x1);
				 
			 }
			 else if(x2>x1&&x2>x3) {
				 System.out.println("The maximum number is "+x2);
			 }
			 else {
				 System.out.println("The maximum number is "+x3);
			 }
		 };
		 mn.maximumnum(n1, n2, n3);
		 
		 minnum minn = (x1,x2,x3)->{
			 if(x1<x2&&x1<x3) {
				 System.out.println("The minimumm number is "+x1);
				 
			 }
			 else if(x2<x1&&x2<x3) {
				 System.out.println("The minimum number is "+x2);
			 }
			 else {
				 System.out.println("The minimum number is "+x3);
			 }
		 };
		 minn.minimumnum(n1, n2, n3);
		 
		 System.out.println("Enter the size of array:");
		 int[] array1 = new int[sc.nextInt()];
		 for(int i =0;i<array1.length;i++) {
			 System.out.println("Enter a number");
			 array1[i] = sc.nextInt();
		 }
		 avgnum an = (x)->{
			 int sum = 0;
			 for(int i=0;i<array1.length;i++) {
				 sum = array1[i]+sum;
				 
			 }
			int avg = sum/array1.length;
			System.out.println("The Sum of the elements in an array is: "+sum);
			System.out.println("The Sum of the elements in an array is: "+avg);
		 };
		 //to find average
		 an.averagenum(array1);
		 
		 System.out.println("Enter the size of array:");
		 int size = sc.nextInt();
		 StringBuffer[] strarray1 = new StringBuffer[size];
		 for(int i =0;i<strarray1.length;i++) {
			 System.out.println("Enter a string");
			 strarray1[i] = new StringBuffer(sc.next());
		 }
		 strstartswitha strarr = (x)->{
			 for(int i =0;i<x.length;i++) {
				 if(x[i].toString().startsWith("A")) {
					 System.out.println("String starts with A are: "+x[i]);
				 }
			 }
		 };
		 strarr.strarraywithA(strarray1);
		
	}

}
