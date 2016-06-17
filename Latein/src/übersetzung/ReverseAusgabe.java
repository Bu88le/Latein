package übersetzung;

public class ReverseAusgabe {
	
	static StringBuffer stringbuffer = new StringBuffer();
	static boolean found = false;
	
	public static void ausgabeUEA(String s) {
		Start:
		for (int i = 0; i < uea.zg.length; i++) {
			for (int z = 2; z < uea.zg[i].length; z++) {
				if (s.equals(uea.zg[i][z])){
					stringbuffer.append("<html>");
					stringbuffer.append(uea.zg[i][1]);
					stringbuffer.append(" : <p/> <p/>");
					
					for (int t = 2; t < uea.zg[i].length; t++){
						stringbuffer.append(uea.zg[i][t] + "<p/>");
						if (t == uea.zg[i].length) {
							stringbuffer.append("<html/>");
							found = true;
							break Start;								
						}
					}
				}
			}
		}
	
		if (found == false) {
			ausgabeUEE(s);
		}
	}
	
	public static void ausgabeUEE(String s) {
		Start:
		for (int i = 0; i < uee.zg.length; i++) {
			for (int z = 2; z < uee.zg[i].length; z++) {
				if (s.equals(uee.zg[i][z])) {
					stringbuffer.append("<html>");
					stringbuffer.append(uee.zg[i][1]);
					stringbuffer.append(" : <p/> <p/>");
					
					for (int t = 2; t < uee.zg[i].length; t++){
						stringbuffer.append(uee.zg[i][t] + "<p/>");
						if (t == uee.zg[i].length) {
							stringbuffer.append("<html/>");
							found = true;
							break Start;								
						}
					}
				}
			}
		}
	}
	
	public static StringBuffer getAusgabeReverse() {
		return stringbuffer;
	}

}
