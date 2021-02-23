package harris.MAIN;

public enum FileManager {

	Primary("/Users/ithofar/eclipse-workspace/classExample_Iterators/src/harris/MAIN/storage"),
	Secondary("/Users/ithofar/eclipse-workspace/classExample_Iterators/src/harris/MAIN/secondstorage");
	
	private String filepath;
	private FileManager(String filepath) {
		this.filepath = filepath;
	}
	
	public String getFilepath() {
		return filepath;
	}
	public void setFilepath(String filepath) {
		this.filepath = filepath;
	}
	
}
