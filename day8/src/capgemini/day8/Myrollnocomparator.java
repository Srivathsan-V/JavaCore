package capgemini.day8;

import java.util.Comparator;

//Comparator
//Generic parameters
//Implement the method of interface(Compare
//Sorting the Employee with id
public class Myrollnocomparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getRollno()>s2.getRollno())
		{
		return 1;
		
		}
		else if(s1.getRollno() <s2.getRollno())
		{
		 return -1;
		 
		}
		else
		{
		return 0;	
		}
		
		//return 0;
	}

}
