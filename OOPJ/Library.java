// Library Details

abstract class Publication
{
	String Bookname;
	String JournalName;
	String publisherName;
	int noOfPages;
	double price;
}

class Book extends Publication
{
	Book(String Bookname,String publisherName,int noOfPages,double price)
	{
		this.Bookname=Bookname;
		this.publisherName=publisherName;
		this.noOfPages=noOfPages;
		this.price=price;
	}
	
	void printDetails()
	{
		System.out.println("Book Name:"+Bookname);
		System.out.println("Publisher Name:"+publisherName);
		System.out.println("No of pages:"+noOfPages);
		System.out.println("Price is:"+price);
	}
}

class Journal extends Publication
{
	Journal(String JournalName,int noOfPages,double price)
	{
		this.JournalName=JournalName;
		this.noOfPages=noOfPages;
		this.price=price;
	}
	
	void printDetails()
	{
		System.out.println("Journal Name:"+JournalName);
		System.out.println("No of pages:"+noOfPages);
		System.out.println("Price is:"+price);
	}
}

class Library {
	public static void main(String args[]) {

		Book b1 = new Book("The Braille edition of the book Exam Warriors", "Narendra Modi", 208, 500);
		Book b2 = new Book("Believe-What Life and Cricket Taught Me", "Suresh Raina", 240, 700);
		Book b3 = new Book("The Christmas Pig", "JK Rowling", 288, 450);

		b1.printDetails();
		System.out.println();
		b2.printDetails();
		System.out.println();
		b3.printDetails();
		System.out.println();

		Journal j1 = new Journal("Love yourself shared by Cielo on We Heart It. ...", 200, 1000);
		Journal j2 = new Journal("Cambridge University Press.", 350, 3000);

		j1.printDetails();
		System.out.println();
		j2.printDetails();
	}
}