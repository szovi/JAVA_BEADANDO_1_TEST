
package biblio;
import person.Author;

public class Entry {
	private Author author;
	private String title;
	private int year;
	private String publisher;
	private int id;
	private static int counter = 0;
	private static final int FORMAT_RAW = 0;
	private static final int FORMAT_AUHOR_YEAR = 1;
	private static final int FORMAT_AUHOR_YEAR_COMPACT = 2;
	
	private Entry(String title, Author author, String publisher, int year){
		this.id = this.counter;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.stepCounter();
	}
	
	public static Entry make(String title, Author author, String publisher, int year){
		if(this.year <= 2016 && this.year >= 1500 &&
		   this.author != null 
		   && !this.title.equals("");){
			   Entry e = new Entry();
			   return e;
		   } else return null;
	}
	
	public static int count(){
		return counter;
	}
	
	public String getId(){
		return this.id;
	}
	
	public static void resetId(){
		counter = 0;
	}
	
	public String getPublisher(){
		return this.publisher;
	}
	
	public Author getAuthor(){
		return this.author;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public void stepCounter(){
		this.counter++;
	}
	
	public String show(int param){
		if(param == 0){
			if(this.publisher.equals("")){
				return "[" + this.getId() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getYear();
			} else {
				return "[" + this.getId() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getPublisher() + ", " + this.getYear();
			}
		} else if(param == 1) {
			if(this.publisher.equals("")){
				return "[" + this.getLastName() + this.getYear() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getYear();
			} else {
				return "[" + this.getId() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getPublisher() + ", " + this.getYear();
			}
		} else if(param == 2){
			if(this.publisher.equals("")){
				return "[" + this.getId() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getYear();
			} else {
				return "[" + this.getId() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getPublisher() + ", " + this.getYear();
			}
		}
		return "";
	}
}