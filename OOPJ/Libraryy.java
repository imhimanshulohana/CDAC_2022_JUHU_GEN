class Book_s
{
    String publisher;
    String authors[] = new String[3];
    String title;
    float price;
    int pages,noOfAuthors;

    Book_s()
    {
        title = "noTitle";
        publisher = "noPublisher";
        authors[0] = "noAuthor";
        pages = 180;
        price = 118.6f;
        noOfAuthors = 1;
    }

    void create( String t, String ps, int pg, float pr )
    {
        publisher = ps;
        title = t;
        price = pr;
        pages = pg;
    }
    void getAuthor( String a )
    {
        authors[0] = a;
        noOfAuthors = 1;
    }
    void getAuthor( String a, String b )
    {
        authors[0] = a;
        authors[1] = b;
        noOfAuthors = 2;
    }
    void getAuthor( String a, String b, String c )
    {
        authors[0] = a;
        authors[1] = b;
        authors[2] = c;
        noOfAuthors = 3;
    }
    void Display()
    {
        System.out.println("Book Details:- ");
        System.out.println("title - "+title);
        System.out.println("authors - ");
        for( int i=0; i<noOfAuthors; i++ )
            System.out.println(authors[i]);
        System.out.println("pages - "+pages+" price - "+price);
    }
}
public class Libraryy {

    Book_s obj[];
    int totalBooks = 0;

    Libraryy( int n )
    {
        obj = new Book_s[n];
        for( int i=0; i<n; i++ )
            obj[i] = new Book_s();
    }
    Libraryy()
    {
        obj = new Book_s[5];
        for( int i=0; i<5; i++ )
            obj[i] = new Book_s();
    }

    void Add(String t, String pb, int pg, float pr, String ... str )
    {
        //enter parameters as title, publisher, pages, price
        obj[ totalBooks].create( t, pb, pg, pr );
        int k = str.length;

        if( k == 1 )
        {
            String S = str[0];
            obj[totalBooks].getAuthor(S);
        }
        else if( k == 2)
        {
            String S = str[0];
            String S1 = str[1];
            obj[totalBooks].getAuthor(S, S1);
        }
        else if( k == 3)
        {
            String S = str[0];
            String S1 = str[1];
            String S2 = str[2];
            obj[totalBooks].getAuthor(S, S1, S2);
        }
        totalBooks++;
    }
    void Add()
    {
        totalBooks++;
    }
    void Remove()
    {
        totalBooks--;
    }
    void display()
    {
        System.out.println("all books in library- ");
        for( int i=0; i<totalBooks; i++ )
            obj[i].Display();
    }
    public static void main(String[] args) {

        Libraryy Lib = new Libraryy(5);
        //enter parameters as title, publisher, pages, price
        Lib.Add("A Better India", "Narayana Murthy", 1900, 999f, "Narayana" );
        Lib.Add();
        Lib.display();
    }

}
