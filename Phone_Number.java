package Task;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone_Number {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Phone_Number obj = new Phone_Number();
		obj.phoneNumber_Reading();
	}

	private void phoneNumber_Reading() throws IOException{
		// TODO Auto-generated method stub
		File fileobj = new File("/home/vicky/Documents/Phonenumber.txt");
		try {
			FileReader readObj = new FileReader(fileobj);
			BufferedReader breadObj = new BufferedReader(readObj);
			String output = breadObj.readLine();
			String Name = "";
			while(output!=null) {
				Name =Name+" "+output;
				output = breadObj.readLine();
			}
			String input = Name;
			Pattern patternObj = Pattern.compile("(0|91)?[0-9]{10}");
			Matcher matcherObj = patternObj.matcher(input);
			boolean result = matcherObj.find();
			while(result == true)
			{
				System.out.println(matcherObj.group());
				result = matcherObj.find();
			} 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
