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
					gv = gv.substring(0, gv.length()-3) + "o";
				}else if (gv.endsWith("abis") || gv.endsWith("abit")) {
					gvs = gv.substring(0, gv.length()-4);
					gv = gv.substring(0, gv.length()-4) + "o";
				}else if (gv.endsWith("abimus") || gv.endsWith("abitis")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "o";
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
					gv = gv.substring(0, gv.length()-4) + "o";
				}else if (gv.endsWith("aberis") || gv.endsWith("abitur") || gv.endsWith("abimur")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "o";
				}else if (gv.endsWith("abimini") || gv.endsWith("abuntur")) {
					gvs = gv.substring(0, gv.length()-7);
					gv = gv.substring(0, gv.length()-7) + "o";
				}
			}
			
			
	
			
	public static String returngv() {
		return gv;
	}
	
	public static String returngvs() {
		return gvs;
	}
}
