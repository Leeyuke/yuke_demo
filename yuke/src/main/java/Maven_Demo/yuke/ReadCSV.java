package Maven_Demo.yuke;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadCSV {
	
	public static final String path = "yuke.txt";
	
	public static void main(String[] args) throws Exception {
		 File file = new File(path);
		 BufferedReader br = new BufferedReader(new FileReader(file));
		 String str = null;
		 while((str = br.readLine()) != null) {
		 
			 Pattern rx = Pattern.compile(getRegex.Regex("windows", "service"));
			 Matcher m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println(m.group("service") + "\t" + m.group("status") + "\t" + m.group("time"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("linux", "useradd"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println(m.group("name") + "\t" + m.group("time"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("linux", "message"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println(m.group("time")+"\t" + m.group("event"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("windows", "message"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println("WinMessage\t" + m.group("event") + "\t" + m.group("time"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("linux", "userdel"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println("USERDEL");
				 System.out.println(m.group("time") + "\t" + m.group("name"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("linux", "reboot"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println("Reboot");
				 System.out.println(m.group("time"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("windows", "start"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println("Win Start");
				// System.out.println(m.group("time"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("linux", "service"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println("Linux service Start");
				 System.out.println(m.group("time"));
				 System.out.println(m.group("service"));
				 System.out.println(m.group("status"));
			 }
			 
			 rx = Pattern.compile(getRegex.Regex("linux", "password"));
			 m = rx.matcher(str);
			 if(m.find()) {
				 System.out.println("Linux password Start");
				 System.out.println(m.group("time"));
				 System.out.println(m.group("name"));
			 }
		 }
	}
}
