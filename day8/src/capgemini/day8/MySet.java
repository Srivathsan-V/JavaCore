package capgemini.day8;

import java.util.*;
import java.util.TreeSet;
class Student implements Comparable<Student> {

	private String name;
	private int rollno;
	private int std;
	private Object school;
	private int age;

	public Student(String name, int rollno, int std, String school, int age) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.std = std;
		this.school = school;
		this.age = age;

	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", std=" + std + ", school=" + school + ", age=" + age
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public Object getSchool() {
		return school;
	}

	public void setSchool(Object school) {
		this.school = school;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(s1.getName());
		
	}

}

public class MySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(10);
		set1.add(50);
		set1.add(40);
		set1.add(70);
		set1.add(200);
		set1.add(100);

		Set<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(50);
		set2.add(10);
		set2.add(40);
		set2.add(70);
		set2.add(100);
		set2.add(200);

		Set<Integer> set3 = new TreeSet<Integer>();
		set3.add(50);
		set3.add(10);
		set3.add(40);
		set3.add(70);
		set3.add(100);
		set3.add(200);

		System.out.println("HashSet " + set1);
		System.out.println("LinkedHashSet " + set2);
		System.out.println("TreeSet " + set3);

		Scanner sc = new Scanner(System.in);
		Set<Student> studentSet = new LinkedHashSet<Student>();

		while (true) {

			System.out.println("Enter 1 for Inserting details");
			System.out.println("Enter 2 for Deleting details");
			System.out.println("Enter 3 for update");
			System.out.println("Enter 4 for Sort ASC");
			System.out.println("Enter 5 for Sort DESC");
			System.out.println("Enter 6 for Print the Size");
			System.out.println("Enter 7 for exit");

			int user = sc.nextInt();

			if (user == 1) {
				System.out.println("Enter the Number of Students you want to store the details: ");
				int size = sc.nextInt();
				for (int i = 0; i < size; i++) {

					System.out.println("Enter the name of student: " + i);
					String name = sc.next();
					System.out.println("Enter rollno: " + i);
					int rollno = sc.nextInt();
					System.out.println("Enter the class: " + i);
					int std = sc.nextInt();
					System.out.println("Enter the name of school: " + i);
					String school = sc.next();
					System.out.println("Enter Age: " + i);
					int age = sc.nextInt();
					Student st1 = new Student(name, rollno, std, school, age);
					studentSet.add(st1);
				}
				System.out.println("Created Student Set: "+studentSet);


			}
			if (user == 2) {
				System.out.println("Enter the name of the student you want to remove");
				String inp = sc.next();
				System.out.println(inp);
				boolean k = true;
				for (Student studentdata : studentSet) {
					if (studentdata.toString().contains(inp)) {
						studentSet.remove(studentdata);
						
						
					}
					
				}
				if (k==true) {
					
				System.out.println("After rmeoving the details: " + studentSet);
				}
				else {
					System.out.println("Value not found");
				}
			}
			if (user == 3) {
				System.out.println("Enter the name of the student you want to replace");
				Scanner sc1 = new Scanner(System.in);
;				String inp = sc1.next();
				boolean k = false;
				for (Student studentdata : studentSet) {
					if (studentdata.toString().contains(inp)) {
						studentSet.remove(studentdata);
						k = true;
						System.out.println("Enter the details to be added: ");
						System.out.println("Enter the name of student: " + studentdata);
						String name1 = sc1.next();
						studentdata.setName(name1);
						System.out.println("Enter rollno: " + studentdata);
						int rollno1 = sc1.nextInt();
						studentdata.setRollno(rollno1);
						System.out.println("Enter the class: " + studentdata);
						int std1 = sc1.nextInt();
						studentdata.setStd(std1);
						System.out.println("Enter the name of school: " + studentdata);
						String school1 = sc1.next();
						studentdata.setSchool(school1);
						System.out.println("Enter Age: " + studentdata);
						int age1 = sc1.nextInt();
						studentdata.setAge(age1);
						studentSet.add(studentdata);
						System.out.println("Updated Data: "+studentSet);

					}
				}
				if (k == false) {
					System.out.println("Entered value is not found in the list");
				} else {
					System.out.println("After rmeoving the details: " + studentSet);
					System.out.println("After rmeoving the details: " + studentSet);

				}
				
			}
			
			if (user == 4) {
				
				Myrollnocomparator rollnosort = new Myrollnocomparator();
				Set<Student> studentSetsortedrollno = new TreeSet<Student>(rollnosort);
				studentSetsortedrollno.addAll(studentSet);
				System.out.println("Before Sorting by rollno: "+studentSet);
				System.out.println("After Sorting by rollno: "+studentSetsortedrollno);
				
		
			}
			if (user == 5) {
				Mynamecomparator namecomparator = new Mynamecomparator();
				TreeSet<Student> studentSetsortedname = new TreeSet<Student>(namecomparator);
				studentSetsortedname.addAll(studentSet);
				TreeSet<Student> studentSetsortednamerev = (TreeSet<Student>) studentSetsortedname.descendingSet();

				System.out.println("Before Sorting by name DESC: "+studentSet);
				System.out.println("After Sorting by name DESC: "+studentSetsortednamerev);
			}
			if (user == 6) {
				System.out.println("Size of the set is: "+ studentSet.size());
			}
			if (user == 7) {
				break;
			}

		}
		sc.close();


	}

}


