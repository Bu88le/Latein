package �bersetzung;

import frames.frame;

public class �bergabe {

	static String gv;
	
	public �bergabe(String s) {
		gv = s;
		new frame();
	}
	
	public static String returngv() {
		return gv;
	}
	
}
