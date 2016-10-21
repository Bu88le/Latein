package frames.panels;

public class GetKasi {

	final static String getKasi[] = {"Nominativ &nbsp", "Genitiv", "Dativ", "Akkusativ", "Ablativ"};
	static StringBuffer sb = new StringBuffer();
	
	public static String returnGetKasiSingular() {
		
		sb.delete(0, sb.length());
		
		sb.append("<html><b><font color=\"#00000\">");
		
		for (int i = 0; i < 5; i++) {
			
			sb.append(getKasi[i] + "<p/>");
		}
		
		return sb.toString();
	}
}
