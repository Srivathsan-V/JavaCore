package capgemini.day4;

//Employee Management System
//Add the List of Employee
//Find the Employee By name
//Sort the Employee List
//Add New Employee to List
//Find the min and max salary of employee
import java.util.*;

class EmployeeM {
	public static int sum = 0;
	public static int avg = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getiD() {
		return iD;
	}

	public void setiD(int iD) {
		this.iD = iD;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeM [name=" + name + ", iD=" + iD + ", salary=" + salary + "]";
	}

	EmployeeM() {

	}

	public EmployeeM(String name, int iD, int salary) {
		super();
		this.name = name;
		this.iD = iD;
		this.salary = salary;
	}

	private String name;
	private int iD;
	private int salary;
}

	public class Employeemanagementsystem {

		public static void main(String arg[]) {

			Scanner sc = new Scanner(System.in);
			EmployeeM[] emp = {};

			while (true) {

				System.out.println("Enter 1 for create a List of employee");
				System.out.println("Enter 2 for Display a List of employee");
				System.out.println("Enter 3 for search employee");
				System.out.println("Enter 4 for delete a employee");
				System.out.println("Enter 6 Sort the Employee ASC BY Name");
				System.out.println("Enter 7 Sort the Employee DESC By Name");
				System.out.println("Enter 8 Sort the Employee ASC BY Salary");
				System.out.println("Enter 9 Sort the Employee DESC By Salary");
				System.out.println("Enter 10 Minimun paid salary employee");
				System.out.println("Enter 11 maximum salry of employee");
				System.out.println("Enter 12 Avg of employee Salary");
				System.out.println("Enter 13 Sum of employee Salary");

				System.out.println("enter 5 for exit");
				int choice = sc.nextInt();

				if (choice == 1) {
					System.out.println("Enter the Number of Employee you want to enter");
					int size = sc.nextInt();
					emp = new EmployeeM[size];
					for (int i = 0; i < size; i++) {

						System.out.println("Enter name Employee " + i);
						String name = sc.next();
						System.out.println("Enter Id Employee " + i);
						int id = sc.nextInt();
						System.out.println("Enter Salary Employee " + i);
						int salary = sc.nextInt();
						emp[i] = new EmployeeM(name, id, salary);
					}

				}
				if (choice == 2) {
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
				}
				if (choice == 3) {
					System.out.println("Enter name which you want to search");
					String name = sc.next();
					boolean k = true;
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getName().equalsIgnoreCase(name)) {
							System.out.println("Employee Found " + emp[i].toString());
							k = false;
							break;

						}
					}
					if (k) {
						System.out.println("Record not Found");
					}

				}
				if (choice == 4) {
					boolean deleteFlag = true;
					for (int i = 0; i < emp.length; i++) {
						System.out.println(emp[i]);
					}
					System.out.println("Enter the id for which you want to delete the employee");
					int id = sc.nextInt();
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() == id) {
							System.out.println("Deleting record " + emp[i].toString());
							emp[i] = new EmployeeM();
							deleteFlag = false;
							break;

						}
					}
					if (deleteFlag) {
						System.out.println("No Matching Id found");
					}

				}
				if (choice == 5) {
					break;
				}
				if (choice == 6) {
					Namecomparator namesort = new Namecomparator();
					System.out.println("Before Sorting by name: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
					Arrays.sort(emp, namesort);
					System.out.println("After Sorting by name: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
					
				}
				if (choice == 7) {
					Comparator<EmployeeM> descnamesort = Collections.reverseOrder(new Namecomparator());
					System.out.println("Before Sorting by name: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
					Arrays.sort(emp, descnamesort);
					System.out.println("After Sorting by name: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
				}
				if (choice == 8) {
					SalaryComparator salarysort = new SalaryComparator();
					System.out.println("Before Sorting by salary: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
					Arrays.sort(emp, salarysort);
					System.out.println("After Sorting by salary: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
					
				}
				if (choice == 9) {
					Comparator<EmployeeM> descsalarysort = Collections.reverseOrder(new SalaryComparator());
					System.out.println("Before Sorting by salary: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
					Arrays.sort(emp, descsalarysort);
					System.out.println("After Sorting by salary: ");
					for (int i = 0; i < emp.length; i++) {
						if (emp[i].getiD() != 0) {
							System.out.println(emp[i]);
						}
					}
					
				}
				if (choice == 10) {
					int min = emp[0].getSalary();
					int index = 0;
					for (int i = 1; i < emp.length; i++) {
						if (emp[i].getSalary() < min) {
							min = emp[i].getSalary();
							index = i;
						}
					}
					System.out.println("Minimum Paid salary employee: " + emp[index].getName());

					if (choice == 11) {
						int max = emp[0].getSalary();
						int index1 = 0;
						for (int i = 1; i < emp.length; i++) {
							if (emp[i].getSalary() > max) {
								max = emp[i].getSalary();
								index1 = i;
							}
						}
						System.out.println("Maximum Paid salary employee: " + emp[index1].getName());
					}
					
					if (choice == 13) {
						for (int i = 0; i < emp.length; i++) {
							EmployeeM.sum = EmployeeM.sum+emp[i].getSalary();
							}
						System.out.println("Sum of Employee salary: " +EmployeeM.sum);
					}
					if (choice == 12) {
							EmployeeM.avg = (EmployeeM.sum/emp.length);
							System.out.println("Sum of Employee salary: " +EmployeeM.avg);

						}
					if (choice == 3) {
						int index2 = 0;
						Scanner sc1 = new Scanner(System.in);
						for(int i = 0;i<emp.length;i++) {
							if(emp[i].getName() == sc1.toString()) {
								index2 = i; 								
							}
						}
						System.out.println("Employee is found at: "+index2);

						
					}

			}
		}
	}
}


