package frames.panels;

public class GetPersonen {
	
	/*
	 * StringBUffer, dem in for-Schleifen mehrere Strings appended werden
	 */
	static StringBuffer sb = new StringBuffer();
	
	/*
	 * Gibt einen String zur�ck
	 */
	public static String getPersonen() {
		/*
		 * Im StringBuffer wird html-Code verwendet, um ihn in
		 * JLabels und JScrollPanes anzeigen zu k�nnen
		 */
		sb.append("<html><b><font color=\"#00000\">");
		
		/*
		 * for Schleife l�uft 6 mal (1.-3. Ps.Singular && 4.-6. Pers. PL)
		 */
		for (int i = 0; i < 6; i++) {
			/*
			 * Wenn i <2 oder i = 2, dann wird (i+1), (da keine 0. Pers) + Pers. + SG. angeh�ngt
			 */
			if (i<=2) {
				sb.append((i+1) + ". Pers. Sg. " + "&nbsp"+ "<p/>");
			}
			/*
			 * Wenn i>2, dann wird (i+1) + Pers + Pl. angeh�ngt
			 */
			if (i>2) {
				sb.append((i+1) + ". Pers. Pl. " + "&nbsp" + "<p/>");
			}
			/*
			 * Wenn for_schleife im letzten Durchlauf ist, wird der html-Code beendet
			 */
			if (i == 5) {
				sb.append("<font/></b></html>");
			}
		}
		/*
		 * StringBuffer wird mit .toString() als String zur�ckgegeben
		 */
		return sb.toString();
	}

}
