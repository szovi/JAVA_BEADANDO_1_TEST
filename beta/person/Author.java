
//author:szovi
//desc:valami
package person;

public class Author {

	private String firstname;
	private String lastname;

	private Author(String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public Author(Author author){
		//this.make();
		this.firstname = author.getFirstName();
		this.lastname = author.getLastName();
	}
	
	public String getLastName() {
		return this.lastname;
	}
	
	public String getFirstName(){
		return this.firstname; 
	}
	
	public String show(){
		return this.getLastName() + ", " + this.getFirstName().charAt(0);
	}
	
	public boolean equals(Author a){
		if(this.getFirstName().equals(a.getFirstName()) && 
				this.getLastName().equals(a.getLastName())){
					return true;
				} else return false;
	}
	
	public static Author make(String line){
		//String[] line = line.split(" ");
		if(line.split(" ").length == 2 ){
			if(Character.isUpperCase(line.split(" ")[0].charAt(0))  && 
			   Character.isUpperCase(line.split(" ")[1].charAt(0))  &&
			   line.split(" ")[0].length() >= 1 					&&
			   line.split(" ")[1].length() >= 1) {
				   String first = line.split(" ")[0];
				   String last = line.split(" ")[1];
				   Author a = new Author(first, last);
				   return a;
			   } else return null;
		} else return null;
	}
	
}	