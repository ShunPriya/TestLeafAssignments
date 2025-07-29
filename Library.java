package week2.day1;

public class Library {

	public static void main(String[] args) {
		Library lib1 = new Library();
		String value = lib1.addBook("Harry Potter");		
		System.out.println("Returned Value is "+ value);
		lib1.issueBook();		
	}
	public String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

}

class  LibraryManagement
{
	public static void main(String[] args) {
		Library lib2 = new Library();
		String value = lib2.addBook("Novel");		
		System.out.println("Returned Value is "+ value);
		lib2.issueBook();		
	}
	
}