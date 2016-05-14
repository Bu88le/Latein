package übersetzung;

import frames.frame;

public class übergabe {

	static String gv;
	
	public übergabe(String s) {
		gv = s;
		new frame();
	}
	
	public static String returngv() {
		return gv;
	}
	
}
