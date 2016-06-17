package zeiten;

public class futurI {

	public static String gv;
	public static String gvs;
	
	public futurI(String s) {
		gv = s;
	}
	
	//-----------------------------------------------------------
	//-----------------------AKTIV-------------------------------
	//-----------------------------------------------------------
		/**--------------------------------------------
		 * ---------Auswahl a-Konjugation--------------
		 * --------------------------------------------*/
			public static void futurIaktiva() {
				if (gv.endsWith("abo")){
					gvs = gv.substring(0,  gv.length()-3);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("abis") || gv.endsWith("abit")) {
					gvs = gv.substring(0, gv.length()-4);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("abimus") || gv.endsWith("abitis")) {
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("abunt")) {
					gvs = gv.substring(0, gv.length()-5);
					Auswahl.überprüfung(gvs);
				}
			}
			
		/**---------------------------------------------
		 * --------Auswahl e-Konjugation----------------
		 * ---------------------------------------------*/
			
			public static void futurIaktive() {
				if (gv.endsWith("ebo")) {
					gvs = gv.substring(0,  gv.length()-3);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("ebis") || gv.endsWith("ebit")) {
					gvs = gv.substring(0, gv.length()-4);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("ebimus") || gv.endsWith("ebitis")) {
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("ebunt")) {
					gvs = gv.substring(0, gv.length()-5);
					Auswahl.überprüfung(gvs);
				}
			}
			
	//------------------------------------------------------------
	//------------------------PASSIV------------------------------
	//------------------------------------------------------------
		/**--------------------------------------------------
		 * --------------Auswahl a-Konjugation---------------
		 * --------------------------------------------------*/
			public static void futurIpassiva() {
				if (gv.endsWith("abor")) {
					gvs = gv.substring(0,  gv.length()-4);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("aberis") || gv.endsWith("abitur") || gv.endsWith("abimur")) {
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("abimini") || gv.endsWith("abuntur")) {
					gvs = gv.substring(0, gv.length()-7);
					Auswahl.überprüfung(gvs);
				}
			}
			
		/**--------------------------------------------------
		 * --------------Auswahl e-Konjugation---------------
		 * --------------------------------------------------*/
			
			public static void futurIpassive() {
				if (gv.endsWith("ebor")) {
					gvs = gv.substring(0, gv.length()-4);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("eberis") || gv.endsWith("ebitur") || gv.endsWith("ebimur")) {
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("ebimini") || gv.endsWith("ebuntur")) {
					gvs = gv.substring(0, gv.length()-7);
					Auswahl.überprüfung(gvs);
				}
			}
			
			
	
			
	public static String returngv() {
		return gv;
	}
	
	public static String returngvs() {
		return gvs;
	}
}
