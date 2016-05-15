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
				
			/**-----------------------------------
			 * ---------Auswahl e-Konjugation-----
			 * -----------------------------------*/
				
				public static void pr�sensaktivindikative() {
					if (gv.endsWith("eo") || gv.endsWith("es") || gv.endsWith("et")) {
						gvs = gv.substring(0, gv.length()-2);
						gv = gv.substring(0, gv.length()-2) + "eo";
					}else if (gv.endsWith("emus") || gv.endsWith("etis")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "eo";
					}else if (gv.endsWith("ent")) {
						gvs = gv.substring(0, gv.length()-3);
						gv = gv.substring(0, gv.length()-3) + "eo";
					}else {
						pr�sensaktivkonunktive();
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
				
			/**---------------------------------------
			 * --------Auswahl e-Konjugation----------
			 * ---------------------------------------*/
				
				public static void pr�sensaktivkonunktive() {
					if (gv.endsWith("eam") || gv.endsWith("eas") || gv.endsWith("eat")) {
						gvs = gv.substring(0,  gv.length()-3);
						gv = gv.substring(0, gv.length()-3) + "eo";
					}else if (gv.endsWith("eamus") || gv.endsWith("eatis")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "eo";
					}else if (gv.endsWith("eant")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "eo";
					}else {
						pr�senspassivindikative();
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
				
			/**-------------------------------------------
			 * ------Auswahl e-Konjugation----------------
			 * -------------------------------------------*/
				
				public static void pr�senspassivindikative() {
					if (gv.endsWith("eor")) {
						gvs = gv.substring(0,  gv.length()-3);
						gv = gv.substring(0, gv.length()-3) + "eo";
					}else if (gv.endsWith("eris") || gv.endsWith("etur") || gv.endsWith("emur")){
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "eo";
					}else if (gv.endsWith("emini") || gv.endsWith("entur")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "eo";
					}else {
						pr�senspassivkonjunktive();
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
				
			/**----------------------------------------
			 * -------Auswahl e-Konjugation------------
			 * ----------------------------------------*/
				
				public static void pr�senspassivkonjunktive() {
					if (gv.endsWith("ear")) {
						gvs = gv.substring(0,  gv.length()-3);
						gv = gv.substring(0, gv.length()-3) + "eo";
					}else if (gv.endsWith("earis") || gv.endsWith("eatur") || gv.endsWith("eamur")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "eo";
					}else if (gv.endsWith("eamini") || gv.endsWith("eantur")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
					}else {
						imperfekt.imperfektindikativaktive();
					}
				}
				
				
				
				
				
	public static String returngv() {
		return gv;
	}
	
	public static String returngvs() {
		return gvs;
	}
}
