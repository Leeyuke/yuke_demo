package Maven_Demo.yuke;

import java.nio.charset.Charset;

import com.csvreader.CsvReader;

public class getRegex {

	private static String CSVFILE = SysInfo.PATH_TASKS_RUNNING_CSV;
	public static final String YUKECSV = SysInfo.FOLDER_CARDS + SysInfo.sep + "yuke.csv";
	
	public static String Regex(String os, String index) throws Exception {
		CsvReader r = new CsvReader(YUKECSV, ',',Charset.forName("GB2312"));
		int index_flag = 0;
		r.readHeaders();
		for(int i=0;i<r.getHeaderCount();i++) {
			if(r.getHeader(i).equals(index)) {
				index_flag = i;
				//System.out.println(index_flag);
				break;
			}
		}
		while(r.readRecord()) {
			if(r.get(0).equals(os)) {
				//System.out.println(r.get(index_flag));
				return r.get(index_flag);
			}
		}
		return null;
	}
	
}
