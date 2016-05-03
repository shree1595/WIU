/*
 *  Test program for Class Author, Class Book 
 */
public class TestMain {

		public static void main(String[] args) {
	
			//creates a new object in class Author
			Author anAuthor = new Author("HelloKitty","HelloKitty@gmail.com",'m');			
		
			Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
			System.out.println(aBook); // call toString()
			// Use an anonymous instance of Author
			
			Book anotherBook = new Book("more Java for dummy", new Author("obama","obama@gmail.com",'f'), 29.95, 888);
			System.out.println(anotherBook); // call toString()
		}
	}
