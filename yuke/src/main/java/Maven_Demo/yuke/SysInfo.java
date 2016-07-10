package Maven_Demo.yuke;

import java.io.File;

public class SysInfo {

	public static final String sep = File.separator;
	public static final String SBT_HOME = System.getenv("SBT_HOME");
	public static final String FOLDER_CARDS = SBT_HOME + sep + "cards";
	public static final String PATH_TASKS_RUNNING_CSV = FOLDER_CARDS + sep + "cards.auto.csv";
}
