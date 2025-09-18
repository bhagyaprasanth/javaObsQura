package aggregation;

class Author {
	String AuthorName;
	int age;
	String place;

	Author(String name, int age, String place){
		this.AuthorName=name;
		this.age=age;
		this.place=place;
	}
}

class Book {
	String bookName;
	int price;
	Author auth;

	Book(String name, int price, Author auth) {
		this.bookName = name;
		this.price = price;
		this.auth = auth;
	}
	public void display(Book boo) {
		System.out.println("Book Name - "+boo.bookName);
		System.out.println("Price - "+boo.price);
		System.out.println("Author Name -"+boo.auth.AuthorName);
		System.out.println("Age - "+boo.auth.age);
		System.out.println("Place - "+boo.auth.place);
	}
}

public class Aggregation {
	public static void main(String args[]) {
		Author autherz=new Author("basheer",42,"typ");
		Author au=new Author("Ganga",67,"Kuch");
		Book book1 =new Book ("pathummayude aadu ",120,autherz); 
		Book book2 =new Book ("Book for Java ",234,au); 
		book1.display(book1);
		book2.display(book2);
		
	}
}
