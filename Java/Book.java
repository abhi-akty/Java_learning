class Book
{
	int code, price;
	boolean status;

	void setBook(int c, int p)
	{
		code=c;
		price=p;
		status=true;
		System.out.println(code+" Book registered successfully");
	}
	void issueBook()
	{
		if (status)
		{
			System.out.println("Book issued successfully");
			status=false;
			return;
		}
		System.out.println("Book is already issued");
	}
	void returnBook()
	{ 
		if (!status)
		{
			System.out.println("Book returned successfully");
			status=true;
			return;
		}
		System.out.println("Book is already available");
	}
	void report()
	{
		System.out.println("\nCode:"+code);
		System.out.println("Price:"+price);
		if (status)
		{
			System.out.println("Staus: Available");
		}
		else
		{
			System.out.println("Status: Issued");
		}	
	}
}

	