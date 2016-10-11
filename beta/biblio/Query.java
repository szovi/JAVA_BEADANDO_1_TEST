
package biblio;

import person.Author;
import biblio.Entry;

public class Query {
	private Author author;
	private String publisher;

	private Query (Author author, String publisher){
		this.author = author;
		this.publisher = publisher;
	}
	
	public static Query byAuthor(Author a){
		Query q = new Query(a, null);
		return q;
	}
	
	public static Query byPublisher(String p){
		Query q = new Query(null, p);
		return q;
	}
	
	public boolean accept(Entry e){
		if(this.author != null && this.publisher == null){
			if(e.getAuthor().equals(this.author)){
				return true;
			} else return false;
		} else if(author == null && this.publisher != null){
			if(e.getPublisher().equals(this.publisher)){
				return true;
			} else return false;
		} return false;
	} 

}