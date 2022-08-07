
public abstract class AbstractFile {
	private String fileName;
	public AbstractFile(String fileName) {
		this.fileName = fileName;
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public abstract void ls();
}