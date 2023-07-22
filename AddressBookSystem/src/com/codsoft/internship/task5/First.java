//1. Create a Contact class to represent individual contacts. Include attributes such as name, phone number, email address, and any other relevant details.

package com.codsoft.internship.task5;

class Contact
{
	private String name;
	private String phoneNumber;
	private String emailAddress;

	// Constructor
	public Contact(String name, String phoneNumber, String emailAddress)
	{
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	// Getter methods
	public String getName()
	{
		return name;
	}

	public String getPhoneNumber()
	{
		return phoneNumber;
	}

	public String getEmailAddress()
	{
		return emailAddress;
	}

	// Setter methods
	public void setName(String name)
	{
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress)
	{
		this.emailAddress = emailAddress;
	}
}

public class First
{
	public static void main(String args[])
	{
		Contact contact1 = new Contact("Durgesh Chirmade","1234567890","abc@gmail.com");
		Contact contact2 = new Contact("Ajay Chirmade","0123456789","qwe@gmail.com");

		System.out.println("Contact 1 Details : ");
		System.out.println("Name : " + contact1.getName());
		System.out.println("Phone Number : " + contact1.getPhoneNumber());
		System.out.println("Email Address : " + contact1.getEmailAddress());

		System.out.println("\n Contact 2 Details : ");
		System.out.println("Name : " + contact2.getName());
		System.out.println("Phone Number : " + contact2.getPhoneNumber());
		System.out.println("Email Address : " + contact2.getEmailAddress());

		// Modify Contact Details
		contact1.setPhoneNumber("5555555555555");
		contact2.setEmailAddress("asdf@gmail.com");

		System.out.println("\n Updated Contact 1 Details : ");
		System.out.println("Name : " + contact1.getName());
		System.out.println("Phone Number  : " + contact1.getPhoneNumber());
		System.out.println("Email Address : " + contact1.getEmailAddress());

		System.out.println("\n Updated Contact 2 Details : ");
		System.out.println("Name : " + contact2.getName());
		System.out.println("Phone Number  : " + contact2.getPhoneNumber());
		System.out.println("Email Address : " + contact2.getEmailAddress());
	}
}