
package biblio;
import person.Author;

public class Entry {
	private Author author;
	private String title;
	private int year;
	private String publisher;
	private int id;
	private static int counter = 0;
	public static final int FORMAT_RAW = 0;
	public static final int FORMAT_AUTHOR_YEAR = 1;
	public static final int FORMAT_AUTHOR_YEAR_COMPACT = 2;
	
	private Entry(Author author, String title, int year, String publisher){
		this.id = count();
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		stepCounter();
	}
	
	public static Entry make(Author author, String title, int year, String publisher){
		if(year <= 2016 && year >= 1500 &&
		   author != null 
		   && !title.equals("")) {
			   Entry e = new Entry(author, title, year, publisher);
			   return e;
		   } else return null;
	}
	
	public static int count(){
		return counter;
	}
	
	public int getId(){
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
	
	public String getTitle(){
		return this.title;
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
				return "[" + this.getAuthor().getLastName() + this.getYear() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getYear();
			} else {
				return "[" + this.getId() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getPublisher() + ", " + this.getYear();
			}
		} else if(param == 2){
			if(this.publisher.equals("")){
				return "[" + this.getId() + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getYear();
			} else {
				
				int v = Integer.toString(this.getYear()).length();
				return "[" + this.getAuthor().getLastName().substring(0,2) + Integer.toString(this.getYear()).substring(v - 2, v) + "] " + this.author.show() + ". " + this.getTitle() + ", " + this.getPublisher() + ", " + this.getYear();
			}
		} else return "";
	}
}