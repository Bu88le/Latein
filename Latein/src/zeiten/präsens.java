package zeiten;

public class präsens {
	static String gv;
	static String gvs;
	
	
	public präsens (String s) {
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
	
				public static void präsensaktivindikativa() {
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
						präsensaktivkonjunktiva();
					}
				}
				
			/**-----------------------------------
			 * ---------Auswahl e-Konjugation-----
			 * -----------------------------------*/
				
				public static void präsensaktivindikative() {
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
						präsensaktivkonunktive();
					}
				}
				
		/**---------------------------------------------------------
		 * -------------------KONJUNKTIV----------------------------
		 * ---------------------------------------------------------*/
				
			/**--------------------------------------
			 * -----Auswahl a-Konjugation------------
			 * --------------------------------------*/
				
				public static void präsensaktivkonjunktiva() {
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
						präsenspassivindikativa();
					}
				}
				
			/**---------------------------------------
			 * --------Auswahl e-Konjugation----------
			 * ---------------------------------------*/
				
				public static void präsensaktivkonunktive() {
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
						präsenspassivindikative();
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
				
				public static void präsenspassivindikativa() {
					if (gv.endsWith("or")) {
						gvs = gv.substring(0,  gv.length()-2);
						gv = gv.substring(0, gv.length()-2) + "o";
						System.out.println(gvs);
						System.out.println(gv);
					}else if (gv.endsWith("aris") || gv.endsWith("atur") || gv.endsWith("amur")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("amini") || gv.endsWith("antur")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "o";
					}else {
						präsenspassivkonjunktiva();
					}
				}
				
			/**-------------------------------------------
			 * ------Auswahl e-Konjugation----------------
			 * -------------------------------------------*/
				
				public static void präsenspassivindikative() {
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
						präsenspassivkonjunktive();
					}
				}
				
		/**-------------------------------------------------------
		 * -----------------KONJUNKTIV----------------------------
		 *--------------------------------------------------------*/
				
			/**----------------------------------------
			 * --------Auswahl a-Konjugation-----------
			 * ----------------------------------------*/
				
				public static void präsenspassivkonjunktiva() {
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
				
				public static void präsenspassivkonjunktive() {
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
