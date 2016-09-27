package übersetzung;

import latein.Main;

public class übergabe {

	static String gv;
	
	public übergabe(String s) {
		gv = s;
		Main.mf.panelÜbersetzung();
	}
	
	public static String returngv() {
		return gv;
	}
	
}
