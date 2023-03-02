package collectionsDemo;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		Set<String> ts = new TreeSet<String>(new StringComparator());
		ts.add("Max");
		ts.add("Joe");
		ts.add("Robert");
		ts.add("Will");
		ts.add("Albert");
		System.out.println(ts);
		
		Set<Employee> employees = new TreeSet<Employee>();
		employees.add(new Employee(101, 24500, "Sam", "A123Sam"));
		employees.add(new Employee(102, 25500, "John", "A123John"));
		employees.add(new Employee(103, 26500, "Robert", "A123Rob"));
		employees.add(new Employee(104, 27500, "Amber", "A123Amb"));
		System.out.println(employees);
		
		Set<Employee> employees1 = new TreeSet<Employee>(new EmpComparator());
		employees1.add(new Employee(101, 24500, "Sam", "A123Sam"));
		employees1.add(new Employee(102, 25500, "John", "A123John"));
		employees1.add(new Employee(103, 26500, "Robert", "A123Rob"));
		employees1.add(new Employee(104, 27500, "Amber", "A123Amb"));
		System.out.println(employees1);
		
	}
}

class StringComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		int l1=o1.length();
		int l2=o2.length();
		
		if(l1<l2) {
			return -1;
		}
		else if(l1>l2) {
			return 1;
		}
		else {
			return o1.compareTo(o2);
		}
	}
	
}

class Employee implements Comparable<Employee>{

	int id;
	double salary;
	String name;
	transient String aadharNo;
	
	public Employee(int id, double salary, String name, String aadharNo) {
		this.id = id;
		this.salary = salary;
		this.name = name;
		this.aadharNo=aadharNo;
	}
	
	public String toString() {
		return this.id +" "+ this.name+" "+ this.salary+" "+ this.aadharNo;	
	}
	
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id< o.id ? -1 : this.id > o.id ? 1 : 0;
	}
	
}

class EmpComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.name.compareTo(o2.name);
	}
	
}