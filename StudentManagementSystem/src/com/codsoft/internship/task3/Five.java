//5.Allow users to interact with the Student Management System by providing options such as adding a new student, editing an existing student's information, searching for a student, displaying all students, and exiting the application.

package com.codsoft.internship.task3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Five {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("---------- Student Management System ----------");
		System.out.println("1. Add new student");
		System.out.println("2. Update existing student");
		System.out.println("3. Searching a student");
		System.out.println("4. Displaying all students");
		System.out.println("5. Exit");

		System.out.print("Enter your choice : ");
		int choice = Integer.parseInt(br.readLine());

		switch (choice) {
		case 1:
			Connection con = null;
			PreparedStatement ps = null;

			int rno = 0;
			String name = null;
			String phno = null;
			float per = 0.0f;

			try {
				Class.forName("org.postgresql.Driver");

				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "2001");

				System.out.print("Enter Roll Number : ");
				rno = Integer.parseInt(br.readLine());

				System.out.print("Enter your Name : ");
				name = br.readLine();

				System.out.print("Enter Phone Number : ");
				phno = br.readLine();

				System.out.print("Enter Percentage : ");
				per = Float.parseFloat(br.readLine());

				ps = con.prepareStatement("insert into student values(?,?,?,?)");

				ps.setInt(1, rno);
				ps.setString(2, name);
				ps.setString(3, phno);
				ps.setFloat(4, per);

				int i = ps.executeUpdate();
				if (i == 0) {
					System.out.println("Unable to insert!!!");
				} else {
					System.out.println("Record is saved Successfully !!!");
				}

				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 2:

			try {
				Class.forName("org.postgresql.Driver");

				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "2001");

				System.out.print("Enter Roll Number : ");
				int rn = Integer.parseInt(br.readLine());

				System.out.print("Enter New Phone Number : ");
				String ph = br.readLine();

				ps = con.prepareStatement("update student set phno=? where rno=?");
				ps.setString(1, ph);
				ps.setInt(2, rn);

				int i = ps.executeUpdate();
				if (i == 0) {
					System.out.println("Record for Roll Number " + rn + " is not Found !!!");
				} else {
					System.out.println("Record for Roll Number " + rn + " is Updated Successfully.");
				}
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 3:
			ResultSet rs = null;

			try {
				Class.forName("org.postgresql.Driver");

				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "2001");

				System.out.print("Enter the Name : ");
				String nme = br.readLine();

				ps = con.prepareStatement("select * from student where name=?");
				ps.setString(1, nme);

				rs = ps.executeQuery();

				boolean flag = rs.next();

				if (flag == true) {
					System.out.println("Record is Found !!!");
					System.out.println("Roll Number : " + rs.getInt(1));
					System.out.println("Name : " + rs.getString(2));
					System.out.println("Phone Number : " + rs.getString(3));
					System.out.println("Percentage : " + rs.getFloat(4));
				} else {
					System.out.println(nme + " is not found.");
				}
				rs.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 4:
			Statement stmt = null;

			try {
				Class.forName("org.postgresql.Driver");

				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student", "postgres", "2001");

				stmt = con.createStatement();
				rs = stmt.executeQuery("select * from student");

				System.out.println("RNO \t NAME \t PHNO \t PER");

				while (rs.next()) {
					System.out.println(
							rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getFloat(4));
				}
				rs.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		case 5:
			System.out.println("App is Existing.");
			return;

		default:
			System.out.println("Invalid choice.Please try agian!!!");
			return;
		}
	}
}
