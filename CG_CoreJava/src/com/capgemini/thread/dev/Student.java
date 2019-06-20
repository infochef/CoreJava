package com.capgemini.thread.dev;

public class Student {

public int id;
public String name;
public double marks;

Student(int id,String name,double marks)
{
	this.id=id;
	this.name=name;
	this.marks=marks;
}

public String toString()
{
	return id+" "+name+" "+marks;
}
	

}
