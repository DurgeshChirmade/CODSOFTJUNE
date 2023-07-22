//6. Implement input validation to ensure that required fields are not left empty and that the student data is in the correct format.

package com.codsoft.internship.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Sixth
{
	public static void main(String args[]) throws Exception
	{

		Connection con = null;
		PreparedStatement ps = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try
		{
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student","postgres","2001");

			System.out.println("---------- Add Student ----------");

			System.out.print("Enter your name : ");
			String name = br.readLine();
			if(name.trim().isEmpty())
			{
				System.out.println("Please give valid input... in Name");
				return;
			}

			System.out.print("Enter your Roll Number : ");
			int rno = Integer.parseInt(br.readLine());
			if(rno <= 0)
			{
				System.out.println("Please give valid input.. in Roll Number.");
				return;
			}

			System.out.print("Enter Phone Number : ");
			String phno = br.readLine();
			if(phno.length() < 10 || phno.length() > 10)
			{
				System.out.println("Please give valid input... in Phone Number.");
				return;
			}

			System.out.print("Enter your Percentage : ");
			float per = Float.parseFloat(br.readLine());
			if(per < 0 || per > 100)
			{
				System.out.println("Please give valid input... in Percentage.");
				return;
			}

			ps = con.prepareStatement("insert into student values(?,?,?,?)");

			ps.setInt(1,rno);
			ps.setString(2,name);
			ps.setString(3,phno);
			ps.setFloat(4,per);

			int i = ps.executeUpdate();

			if(i==0)
			{
				System.out.println("Unable to insert...");
			}
			else
			{
				System.out.println("Record is saved Successfully.");
			}

			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
