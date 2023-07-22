//3 . Design the user interface for the Student Management System. This can be a console-based interface or a graphical user interface (GUI) using libraries like Swing or JavaFX.

package com.codsoft.internship.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Third 
{  
	private static StudentManagementSystem sm = new StudentManagementSystem();

	public static void main(String args[]) throws Exception
	{

		boolean isRunning = true;

		while(isRunning)
		{
			displayMenu();
			int choice = getChoice();

			switch(choice)
			{
				case 1:
						addStudent();
						break;
				case 2:
						removeStudent();
						break;
				case 3:
						searchStudent();
						break;
				case 4:
						displayAllStudents();
						break;
				case 5:
						isRunning = false;
						System.out.println("Application is not running. Good Bye !!!");
						break;
				default:
						System.out.println("Invalid Choice. Please try again.");
			}
		}
	}

	private static void displayMenu()
	{
		System.out.println("---------- Student Management System ----------");
		System.out.println("1. Add Student");
		System.out.println("2. Remove Student");
		System.out.println("3. Search Student");
		System.out.println("4. Display All Students");
		System.out.println("5. Exit");

		System.out.print("Enter your choice : ");
	}

	private static int getChoice() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int choice = Integer.parseInt(br.readLine());
		return choice;
	}

	private static void addStudent() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---------- Add Student ----------");

		System.out.print("Enter Student Name : ");
		String name = br.readLine();

		System.out.print("Enter Student Roll Number : ");
		int rollNumber = Integer.parseInt(br.readLine());

		System.out.print("Enter Student Grade : ");
		String grade = br.readLine();

		Student student = new Student(name,rollNumber,grade);
		sm.addStudent(student);
		System.out.println("Student added successfully.");
	}

	private static void removeStudent() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---------- Remove Student ----------");

		System.out.print("Enter Student Name : ");
		String name = br.readLine();

		Student student = sm.searchStudent(name);
		if(student != null)
		{
			sm.removeStudent(student);
			System.out.println("Student Removed Successfully.");
		}
		else
		{
			System.out.println("Student Not Found.");
		}
	}

	private static void searchStudent() throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---------- Search Student ----------");

		System.out.print("Enter Student Name : ");
		String name = br.readLine();

		Student student = sm.searchStudent(name);
		if(student != null)
		{
			System.out.println("Student Found : ");
			System.out.println("Name : " + student.getname());
			System.out.println("Roll Number : " + student.getRollNumber());
			System.out.println("Grade : " + student.getGrade());
		}
		else
		{
			System.out.println("Student Not Found...");
		}
	}

	private static void displayAllStudents()
	{
		System.out.println("---------- All Students ----------");
		sm.displayAllStudents();
	}
}
