package zeiten;

public class pr�sens {
	static String gv;
	static String gvs;
	
	
	public pr�sens (String s) {
		gv = s;
	}
	
	//--------------------------------------------------------------------------
	//-------------------------------AKTIV--------------------------------------
	//--------------------------------------------------------------------------
	
		/**---------------------------------------------------------
		 * -----------------------INDIKATIV-------------------------
		 * ---------------------------------------------------------*/
	
			/**------------------------------------
			 * -----Auswahl a-Konjugation----------
			 * ------------------------------------*/
	
				public static void pr�sensaktivindikativa() {
					if (gv.endsWith("o")) {
						gvs = gv.substring(0, gv.length()-1);
						gv = gv;
					}else if (gv.endsWith("as") || gv.endsWith("at")) {
						gvs = gv.substring(0, gv.length()-2);
						gv = gv.substring(0, gv.length()-2) + "o";
					}else if (gv.endsWith("amus") || gv.endsWith("atis")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("ant")) {
						gvs = gv.substring(0, gv.length()-3);
						gv = gv.substring(0, gv.length()-3) + "o";
					}else {
						pr�sensaktivkonjunktiva();
					}
				}
				
		/**---------------------------------------------------------
		 * -------------------KONJUNKTIV----------------------------
		 * ---------------------------------------------------------*/
				
			/**--------------------------------------
			 * -----Auswahl a-Konjugation------------
			 * --------------------------------------*/
				
				public static void pr�sensaktivkonjunktiva() {
					if (gv.endsWith("em") || gv.endsWith("es") || gv.endsWith("et")) {
						gvs = gv.substring(0,  gv.length()-2);
						gv = gv.substring(0, gv.length()-2) + "o";
					}else if (gv.endsWith("emus") || gv.endsWith("etis")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("ent")) {
						gvs = gv.substring(0, gv.length()-3);
						gv = gv.substring(0, gv.length()-3) + "o";
					}else {
						pr�senspassivindikativa();
					}
				}
				
	//------------------------------------------------------------------------------------
	//-------------------------------PASSIV-----------------------------------------------
	//------------------------------------------------------------------------------------
				
		/**-------------------------------------------------------
		 * -----------------INDIKATIV-----------------------------
		 * -------------------------------------------------------*/
				
			/**-------------------------------------------
			 * ---------Auswahl a-Konjugation-------------
			 * -------------------------------------------*/
				
				public static void pr�senspassivindikativa() {
					if (gv.endsWith("or")) {
						gvs = gv.substring(0,  gv.length()-2);
						gv = gv.substring(0, gv.length()-2) + "o";
					}else if (gv.endsWith("aris") || gv.endsWith("atur") || gv.endsWith("amur")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("amini") || gv.endsWith("antur")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "o";
					}else {
						pr�senspassivkonjunktiva();
					}
				}
				
		/**-------------------------------------------------------
		 * -----------------KONJUNKTIV----------------------------
		 *--------------------------------------------------------*/
				
			/**----------------------------------------
			 * --------Auswahl a-Konjugation-----------
			 * ----------------------------------------*/
				
				public static void pr�senspassivkonjunktiva() {
					if (gv.endsWith("er")) {
						gvs = gv.substring(0, gv.length()-2);
						gv = gv.substring(0, gv.length()-2) + "o";
					}else if (gv.endsWith("eris") || gv.endsWith("etur") || gv.endsWith("emur")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("emini") || gv.endsWith("entur")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "o";
					}
				}
				
				
				
				
				
	public static String returngv() {
		return gv;
	}
	
	public static String returngvs() {
		return gvs;
	}
}
