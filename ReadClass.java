package Com.java;
import java.util.*;
import java.io.*;
public class ReadClass {
	 public static String[] readFromFile(String f)  {
	        ArrayList<String> lines = new ArrayList<>();
        try {
	            FileReader fileReader = new FileReader(f);
	             BufferedReader bufferedReader = new BufferedReader(fileReader);
	            String line;
	            while ((line = bufferedReader.readLine()) != null) {
	                lines.add(line);
	            }
        }
        catch(Exception e){
                 e.printStackTrace();
        }
	        return lines.toArray(new String[0]);
	    }
}
