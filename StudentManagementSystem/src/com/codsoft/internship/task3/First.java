//1.Create a Student class to represent individual students. Include attributes such as name, roll number, grade, and any other relevant details.

package com.codsoft.internship.task3;


class Student
{
	String name;
	int rollNumber;
	String grade;

	public Student(String name,int rollNumber,String grade)
	{
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}

	// Getter methods
	public String getname()
	{
		return name;
	}

	public int getRollNumber()
	{
		return rollNumber;
	}

	public String getGrade()
	{
		return grade;
	}

	// Setter methods
	public void setName(String name)
	{
		this.name = name;
	}

	public void setRollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber;
	}

	public void setGrade(String grade)
	{
		this.grade = grade;
	}

	public void display()
	{
		System.out.println("Name : " + name + " " + "Roll Number : " + rollNumber + " " + "Grade : " + grade );
	}
} 

public class First
{
	public static void main(String args[])
	{

		Student ob = new Student("AAA",42,"A+");
		ob.display();
	}
}
