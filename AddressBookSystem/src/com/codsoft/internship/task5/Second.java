//2. Implement an AddressBook class to manage the collection of contacts. Include methods to add a contact, remove a contact, search for a contact, and display all contacts.

package com.codsoft.internship.task5;

import java.util.ArrayList;
import java.util.List;

class AddressBook
{
	private List<Contact> contacts;

	public AddressBook()
	{
		contacts = new ArrayList<>();
	}

	public void addContact(Contact contact)
	{
		contacts.add(contact);
	}

	public void removeContact(Contact contact)
	{
		contacts.remove(contact);
	}

	public Contact searchContactByName(String name)
	{
		for(Contact contact : contacts)
		{
			if(contact.getName().equalsIgnoreCase(name))
			{
				return contact;
			}
		}
		return null;
	}

	public List<Contact> getAllContacts()
	{
		return contacts;
	}
}

public class Second
{
	public static void main(String args[])
	{
		AddressBook addressBook = new AddressBook();

		// Add contacts
		Contact contact1 = new Contact("Durgesh Chirmade","1234567890","abc@gmail.com");
		Contact contact2 = new Contact("Ajay Chirmade","9876543210","asdf@gmail.com");

		addressBook.addContact(contact1);
		addressBook.addContact(contact2);

		// Search for a contact
		String searchName = "Durgesh Chirmade";
		Contact foundContact = addressBook.searchContactByName(searchName);
		if(foundContact != null)
		{
			System.out.println("Contact Found : " + foundContact.getName());
		}
		else
		{
			System.out.println("Contact Not Found.");
		}

		// Display all contacts
		List<Contact> allContacts = addressBook.getAllContacts();
		System.out.println("\n All Contacts in the Address Book : ");
		for(Contact contact : allContacts)
		{
			System.out.println("NAME : " + contact.getName());
			System.out.println("PHONE NUMBER : " + contact.getPhoneNumber());
			System.out.println("Email Address : " + contact.getEmailAddress());
			System.out.println();
		}

		// Remove a contact
		addressBook.removeContact(contact2);
		System.out.println("Contact : " + contact2.getName() + " removed.");

		// Display all contacts after removal
		allContacts = addressBook.getAllContacts();
		System.out.println("\n All Contacts in the Address Book After removal : ");
		for(Contact contact : allContacts)
		{ 
			System.out.println("Name : " + contact.getName());
			System.out.println("Phone Number : " + contact.getPhoneNumber());
			System.out.println("Email Address : " + contact.getEmailAddress());
			System.out.println();
		}
	}
}