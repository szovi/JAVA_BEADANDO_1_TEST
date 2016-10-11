
package biblio;

import person.Author;
import biblio.Entry;

public class Query {
	
	private Author author;
	private String publisher;
	
	private Query(Author author, String publisher){
		this.author = author;
		this.publisher = publisher;
	}
	
	public static Query byAuthor(Author a){
		return new Query(a, null);
	}
	
	public static Query byPublisher(String p){
		return new Query(null, p);
	}
	
	
}