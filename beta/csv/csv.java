
package csv;

import java.util.Scanner;
import java.util.ArrayList;

public class CSV {
	private String[][] t;
	
	private CSV(String[][] t){
		this.t = t;
	}

	public static CSV read(Scanner sc){
		String[] sor;
		ArrayList<String[]>temp_lines = new ArrayList<String[]>();
		while(sc.hasNextLine()){
			sor = sc.nextLine().split(",");
			for(int j = 0; j < sor.length; j++){
				sor[j] = sor[j].trim();
			}
			temp_lines.add(sor);
		}
		String[][] output = new String[temp_lines.size()][];
		for(int i = 0; i < temp_lines.size(); i++){
			output[i] = temp_lines.get(i);
		}
		CSV csvoutput = new CSV(output);
		return csvoutput;
	}
	
	public String[][] getContents(){
		String[][] out = new String[this.t.length][];
		for(int i = 0; i < this.t.length; i++ ){
			out[i] = new String[this.t[i].length];
			for(int j = 0; j < this.t[i].length; j++){		
				out[i][j] = t[i][j];
			}
		}
		return out;		
	}
	
	
	
}