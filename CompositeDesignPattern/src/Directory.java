import java.util.ArrayList;
import java.util.List;

public class Directory extends AbstractFile {

	private List<AbstractFile> afiles = new ArrayList<AbstractFile>();

	public Directory(String name) {
		super(name);
	}
	public void add(AbstractFile afile) {
		afiles.add(afile);
	}
	public void ls() {
		System.out.println("Directory Name  - " + this.getFileName());
		for(AbstractFile afile : afiles) {
			afile.ls();
		}
	}
}

	

