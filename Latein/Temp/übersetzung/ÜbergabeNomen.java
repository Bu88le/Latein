package �bersetzung;

import latein.Main;

public class �bergabeNomen {
	
	static String gv;
	
	public �bergabeNomen(String s) {
		gv = s;
		Main.mf.panel�bersetzungNomen();
	}
	
	public static String returngv() {
		return gv;
	}
}
