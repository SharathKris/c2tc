package tns.day13.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpCollection {

	public static void main(String[] args) {
		
		ArrayList<Employee> empList = new ArrayList<Employee>();  //created if type Employee
		
		Employee emp[]=new Employee[5];
		for(int i=0; i<emp.length;i++) 
		{
			emp[i] = new Employee(i+1, "Employee"+(i+1), 54000+(i*1000));
			empList.add(emp[i]);
		}
		System.out.println("Employee Details are as follows\n");
		System.out.println(empList);
		
		//Collections.sort(empList); // user defined functions cannot be sorted so we create objects of comparator
		
		//LAMBDA EXPRESSION
		Comparator<Employee> comp = (e1,e2)-> (int) (e2.getEmpSalary()-e1.getEmpSalary());  //
		Collections.sort(empList, comp);
		System.out.println("Employee Details in descending order of salary are as follows\n ");
		System.out.println(empList);
		
		
		Comparator<Employee> comp1=(e2,e1) -> e1.getEmpName().compareTo(e2.getEmpName());  //Descending order of name
		// We use .compareTo for comparing String
		Collections.sort(empList, comp1);  //sorting takes place by the comp1 logic
		System.out.println("Employee Details in descending order of name are as follows\n ");
		System.out.println(empList);
	}

}
