package frames.panels;

public class GetPersonen {
	
	static StringBuffer sb = new StringBuffer();
	
	public static String getPersonen() {
		sb.append("<html><b><font color=\"#00000\">");
		for (int i = 0; i < 6; i++) {
			if (i<=2) {
				sb.append((i+1) + ". Pers. Sg. " + "&nbsp"+ "<p/>");
			}
			if (i>2) {
				sb.append((i+1) + ". Pers. Pl. " + "&nbsp" + "<p/>");
			}
			if (i == 5) {
				sb.append("<font/></b></html>");
			}
		}
		return sb.toString();
	}

}
