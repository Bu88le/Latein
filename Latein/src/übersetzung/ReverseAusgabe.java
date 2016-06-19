package �bersetzung;

import latein.Main;

public class ReverseAusgabe {
	
	/*
	 * StringBuffer, in dem die �bersetzungen gespeichert werden
	 */
	static StringBuffer stringbuffer = new StringBuffer();
	
	/*
	 * boolean found, der angibt, ob f�r die eingegebene
	 * �bersetzung eine Vokabel gefunden wurde
	 */
	static boolean found = false;
	
	public static void ausgabeUEA(String s) {
		stringbuffer.delete(0, stringbuffer.length());
		
		Start:
		for (int i = 0; i < uea.zg.length; i++) {
			for (int z = 2; z < uea.zg[i].length; z++) {
				/*
				 * �berp�ft, ob die eingegebene �bersetzung zu einer
				 * der Vokabeln passt
				 */
				if (s.equalsIgnoreCase(uea.zg[i][z])){
					/*
					 * Im StringBuffer wird html-code verwendet, um ihn
					 * eventuell in einem JLabel und JScrollPane richtig
					 * darstellen zu k�nnen
					 */
					stringbuffer.append("<html>");
					/*
					 * Die zur �bersetzung gefundene Vokabel
					 * wird dem StringBuffer hinzugef�gt
					 */
					stringbuffer.append(uea.zg[i][1]);
					/*
					 * Ein doppelter Zeilenumbruch wird dem StringBUffer hinzugef�gt
					 */
					stringbuffer.append(" : <p/> <p/>");
					
					for (int t = 2; t < uea.zg[i].length; t++){
						/*
						 * Alle �bersetzungen der gefundenen Vokabel werden dem StringBuffer hinuugef�gt
						 */
						stringbuffer.append(uea.zg[i][t] + "<p/>");
						/*
						 * Wenn die for-Schleife die letzte Schleife durchl�uft,
						 * f�hre folgende if-Schleife aus:
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
							 * Verlasse die �bergeordnete for-Schleife "Start"
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
				 * �berpr�ft, ob die eingegeben �bersetzung zu einer
				 * Vokabel aus der (normalen) E-Konjugation passt
				 */
				if (s.equalsIgnoreCase(uee.zg[i][z])) {
					/*
					 * Im StringBuffer wird html-code verwendet, um ihn
					 * eventuell in einem JLabel und JScrollPane richtig
					 * darstellen zu k�nnen
					 */
					stringbuffer.append("<html>");
					/*
					 * Dem StringBuffer wird die zur eingegebenen �bersetzung
					 * gefundene Vokabel hinzugef�gt
					 */
					stringbuffer.append(uee.zg[i][1]);
					/*
					 * Dem StringBuffer wird ein doppelter Zeilenumbruch hinzugef�gt
					 */
					stringbuffer.append(" : <p/> <p/>");
					
					for (int t = 2; t < uee.zg[i].length; t++){
						/*
						 * Alle �bersetzungen der gefundenen Vokabel werden dem StringBuffer hinuugef�gt
						 */
						stringbuffer.append(uee.zg[i][t] + "<p/>");
						/*
						 * Wenn die for-Schleife die letzte Schleife durchl�uft,
						 * f�hre folgende if-Schleife aus:
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
							 * Verlasse die �bergeordnete for-Schleife "Start"
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
	 * Liefert den StringBuffer zur�ck
	 */
	public static StringBuffer getAusgabeReverse() {
		return stringbuffer;
	}

}
