package vue;
import control.ControlArchiver;

public class BoundaryCuisinier {
	private ControlArchiver control;
	
	public BoundaryCuisinier(ControlArchiver control) {
		this.control=control;
	}
	
	public void effacerEcran() {
		control.archiver();
	}
}