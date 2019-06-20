package com.capgemini.wrapper.dev;

public class Employee {

	int emp_id;
	String emp_name;
	double emp_sal;
	
	Employee(int emp_id,String emp_name,double emp_sal)
	{
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_sal = emp_sal;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_sal=" + emp_sal + "]";
	}

	
	

		
	
	
}
