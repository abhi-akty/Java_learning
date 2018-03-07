class Library
{
	public static void main ( String s[] )
	{
		Book b1;
		b1=new Book();
		b1.setBook(102,1000);
		b1.issueBook();
		b1.returnBook();
		b1.report();
	}
}