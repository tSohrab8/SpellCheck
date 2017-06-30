import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class SpellCheck{

	static HashSet<String> words = new HashSet<String>();

	public SpellCheck(){
		File f = new File("/usr/share/dict/words");

		try{
			Scanner scan = new Scanner(f);
			while(scan.hasNextLine()){
				words.add(scan.nextLine());
			}
		}	
		catch (FileNotFoundException e) {
            e.printStackTrace();
        }
	}

	public int check(String phrase){
		
		int count = 0;

		String delim = " ";
		String[] parts = phrase.split(delim);

		for (String p : parts){
			if (!words.contains(p.toLowerCase())){
				System.out.println("You have misspelled " + p);
				count++;
			}
		}
		return count;
	}
}