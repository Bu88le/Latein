package �bersetzung;

import frames.MainFrame;
import latein.Main;

public class �bergabe {

	static String gv;
	
	public �bergabe(String s) {
		gv = s;
		Main.mf.panel�bersetzung();
	}
	
	public static String returngv() {
		return gv;
	}
	
}
