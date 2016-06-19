package übersetzung;

import latein.Main;

public class ReverseAusgabe {
	
	/*
	 * StringBuffer, in dem die Übersetzungen gespeichert werden
	 */
	static StringBuffer stringbuffer = new StringBuffer();
	
	/*
	 * boolean found, der angibt, ob für die eingegebene
	 * Übersetzung eine Vokabel gefunden wurde
	 */
	static boolean found = false;
	
	public static void ausgabeUEA(String s) {
		stringbuffer.delete(0, stringbuffer.length());
		
		Start:
		for (int i = 0; i < uea.zg.length; i++) {
			for (int z = 2; z < uea.zg[i].length; z++) {
				/*
				 * Überpüft, ob die eingegebene Übersetzung zu einer
				 * der Vokabeln passt
				 */
				if (s.equalsIgnoreCase(uea.zg[i][z])){
					/*
					 * Im StringBuffer wird html-code verwendet, um ihn
					 * eventuell in einem JLabel und JScrollPane richtig
					 * darstellen zu können
					 */
					stringbuffer.append("<html>");
					/*
					 * Die zur Übersetzung gefundene Vokabel
					 * wird dem StringBuffer hinzugefügt
					 */
					stringbuffer.append(uea.zg[i][1]);
					/*
					 * Ein doppelter Zeilenumbruch wird dem StringBUffer hinzugefügt
					 */
					stringbuffer.append(" : <p/> <p/>");
					
					for (int t = 2; t < uea.zg[i].length; t++){
						/*
						 * Alle Übersetzungen der gefundenen Vokabel werden dem StringBuffer hinuugefügt
						 */
						stringbuffer.append(uea.zg[i][t] + "<p/>");
						/*
						 * Wenn die for-Schleife die letzte Schleife durchläuft,
						 * führe folgende if-Schleife aus:
						 */
						if (t == uea.zg[i].length-1) {
							/*
							 * Beende den html-Code
							 */
							stringbuffer.append("<html/>");
							/*
							 * Setze den Boolean-Wert found = true
							 */
							found = true;
							/*
							 * Verlasse die übergeordnete for-Schleife "Start"
							 */
							break Start;								
						}
					}
				}
			}
		}
		/*
		 * Wenn found = true, dann Aufruf MainFrame.panelReverseAusgabe()
		 * sonst ausgabeUEE()
		 */
		if (found == true) {
			Main.mf.panelReverseAusgabe();
		}else {
			ausgabeUEE(s);
		}
	}
	
	public static void ausgabeUEE(String s) {
		Start:
		for (int i = 0; i < uee.zg.length; i++) {
			for (int z = 2; z < uee.zg[i].length; z++) {
				/*
				 * Überprüft, ob die eingegeben Übersetzung zu einer
				 * Vokabel aus der (normalen) E-Konjugation passt
				 */
				if (s.equalsIgnoreCase(uee.zg[i][z])) {
					/*
					 * Im StringBuffer wird html-code verwendet, um ihn
					 * eventuell in einem JLabel und JScrollPane richtig
					 * darstellen zu können
					 */
					stringbuffer.append("<html>");
					/*
					 * Dem StringBuffer wird die zur eingegebenen Übersetzung
					 * gefundene Vokabel hinzugefügt
					 */
					stringbuffer.append(uee.zg[i][1]);
					/*
					 * Dem StringBuffer wird ein doppelter Zeilenumbruch hinzugefügt
					 */
					stringbuffer.append(" : <p/> <p/>");
					
					for (int t = 2; t < uee.zg[i].length; t++){
						/*
						 * Alle Übersetzungen der gefundenen Vokabel werden dem StringBuffer hinuugefügt
						 */
						stringbuffer.append(uee.zg[i][t] + "<p/>");
						/*
						 * Wenn die for-Schleife die letzte Schleife durchläuft,
						 * führe folgende if-Schleife aus:
						 */
						if (t == uee.zg[i].length-1) {
							/*
							 * Beende den html-Code
							 */
							stringbuffer.append("<html/>");
							/*
							 * Setze den Boolean-Wert found = true
							 */
							found = true;
							/*
							 * Verlasse die übergeordnete for-Schleife "Start"
							 */
							break Start;								
						}
					}
				}
			}
		}
		/*
		 * Wenn found = true, dann Aufruf MainFrame.panelReverseAusgabe()
		 * sonst Aufruf MainFrame.panelFehler()
		 */
		if (found == true) {
			Main.mf.panelReverseAusgabe();
		}else {
			Main.mf.panelFehler();
		}
	}
	
	/*
	 * Liefert den StringBuffer zurück
	 */
	public static StringBuffer getAusgabeReverse() {
		return stringbuffer;
	}

}
