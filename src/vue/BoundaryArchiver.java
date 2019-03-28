package vue;
import control.ControlArchiver;

public class BoundaryArchiver {
	private ControlArchiver control;
	
	public BoundaryArchiver(ControlArchiver control) {
		this.control=control;
	}
	
	public void archiver() {
		control.archiver();
	}
}
