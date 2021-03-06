package capgemini.day9;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;


public class StreamEmployee {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		List<MyEmployee> employeeList=new ArrayList<MyEmployee>();
		System.out.println("Enter the number of employees: ");
		int size = sc.nextInt();
		for(int i=0;i<size;i++) {
			System.out.println("Enter the employee ID:");
			int id = sc.nextInt();
			System.out.println("Enter the employee name:");
			String name = sc.next();
			System.out.println("Enter the employee salary:");
			int salary = sc.nextInt();
			employeeList.add(new MyEmployee(id, name, salary));
		
		}
		System.out.println("Empolyee List: "+employeeList);		
		//Fetch all the employee and print name whose salary is greater than 5000
		
		List<MyEmployee> filterEmployee=employeeList.stream().filter(e->e.getSalary()>=5000).collect(Collectors.toList());
		
		//print only name from list
		filterEmployee.forEach(e->System.err.println(e.getName()));
		
		//Change the list of value to upper case and print name
		List<String> filterEmployeeUpperCase=	employeeList.stream().map(e->e.getName().toUpperCase()).collect(Collectors.toList());
		
		filterEmployeeUpperCase.forEach(e->System.out.println(e));
		
	IntSummaryStatistics state= employeeList.stream().mapToInt(e->(int)e.getSalary()).summaryStatistics();
		
	//find the maximum salary of employee
	System.out.println("max salary "+state.getMax());
	
	//find the minimum salary of employee
	System.out.println("min "+state.getMin());
	
	//find the sum of all the salary
	//total paid salary of company
	System.out.println("sum "+state.getSum());
	
	
	//find the avg salary
	System.out.println("Avg "+state.getAverage());
	
	
	//sorting of user defined data type
	//mployee cannot be cast to java.lang.Comparable
	//sorting alog
	Comparator<MyEmployee> idcomp = new Idcomparator();
	List<MyEmployee> ls=employeeList.stream().sorted(idcomp).collect(Collectors.toList());
	ls.forEach(System.out::println);
	
	
	}
	
	
}

