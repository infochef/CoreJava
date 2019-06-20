package com.capgemini.thread.dev;

import java.util.LinkedList;

public class DemoLinkedList
{	
public static void main(String[] args)
{
	LinkedList L1=new LinkedList();
	Student s1=new Student(12,"tom",89.9);
	Student s2=new Student(32,"dick",78.5);
	Student s3=new Student(42,"harry",76.4);
	Employee e1= new Employee(23,"virat",34567.9);
	Employee e2=new Employee(45,"dhoni",65678.8);
	Employee e3=new Employee(32,"sachin",789.9);
	L1.add(s1);
	L1.add(s2);
	L1.add(s3);
	L1.add(e1);
	L1.add(e2);
	L1.add(e3);
	
	for(int i=0;i<L1.size();i++)
	{
		Object ob=L1.get(i);
		System.out.println(ob);
	}
	for(Object ob:L1)
	{
		if(ob instanceof Student)
		{
			Student st=(Student)ob;
			System.out.println(st.id);
			System.out.println(st.name);
			System.out.println(st.marks);
			
		}
		else if(ob instanceof Employee)
		{
			Employee e=(Employee)ob;
			System.out.println(e.id);
			System.out.println(e.name);
			System.out.println(e.salary);
			
		}
	}
}
}





