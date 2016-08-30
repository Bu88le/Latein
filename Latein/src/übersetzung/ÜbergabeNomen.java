package übersetzung;

import latein.Main;

public class ÜbergabeNomen {
	
	static String gv;
	
	public ÜbergabeNomen(String s) {
		gv = s;
		Main.mf.panelÜbersetzungNomen();
	}
	
	public static String returngv() {
		return gv;
	}
}
