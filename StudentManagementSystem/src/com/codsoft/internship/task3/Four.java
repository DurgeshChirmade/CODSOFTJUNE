//4.Implement methods to read and write student data to a storage medium, such as a file or a database.

package com.codsoft.internship.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Four
{
	public static void main(String args[]) throws Exception
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter your choice '1' for write data or '2' for read data : ");
		int choice = Integer.parseInt(br.readLine());

		switch(choice)
		{
			case 1:
					Connection con = null;
					PreparedStatement ps = null;

					int rno = 0;
					String name = null;
					String phno = null;
					float per = 0.0f;

					try
					{
						Class.forName("org.postgresql.Driver");

						con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","2001");

						System.out.print("Enter Roll Number : ");
						rno = Integer.parseInt(br.readLine());

						System.out.print("Enter Name : ");
						name = br.readLine();

						System.out.print("Enter Phone Number : ");
						phno = br.readLine();

						System.out.print("Enter Percentage : ");
						per = Float.parseFloat(br.readLine());

						ps = con.prepareStatement("insert into student values(?,?,?,?)");

						ps.setInt(1,rno);
						ps.setString(2,name);
						ps.setString(3,phno);
						ps.setFloat(4,per);

						//step-4 :- Execute SQL statement

						int i = ps.executeUpdate();

						if(i==0)
						{

							System.out.println("Unable to insert!!!");

						}
						else
						{

							System.out.println("Record is saved Successfully!!!");

						}

						//step-5 :- Close Connection

						con.close();

						//System.out.println("Hurray..");
					}
					catch(Exception e)
					{

						e.printStackTrace();

					}

					//System.out.println("Hello");
					break;

			case 2:
					Connection cont = null;
					Statement stmt = null;
					ResultSet rs = null;

					try
					{
						Class.forName("org.postgresql.Driver");

						cont = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","2001");

						stmt = cont.createStatement();
						rs = stmt.executeQuery("select * from student");

						System.out.println("\t RNO \t NAME \t PHNO \t \t PER");

						while(rs.next())
						{
							System.out.println("\t" + rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
						}

						rs.close();
						cont.close();
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					break;

			default:
					System.out.println("Invalid input. please try again.");
					return;

		}
	} 
}
