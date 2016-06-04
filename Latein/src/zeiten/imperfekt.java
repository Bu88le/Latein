package zeiten;

public class imperfekt {

	static String gv;
	static String gvs;
	
	
	public imperfekt (String s) {
		gv = s;
	}
	
	//-------------------------------------------------
	//--------------AKTIV------------------------------
	//-------------------------------------------------
	
		/**-----------------------------------------------
		 * --------------INDIKATIV------------------------
		 * -----------------------------------------------*/
	
			/**-------------------------------------------
			 * -----------Auswahl a-Konjugation-----------
			 *--------------------------------------------*/
	
			public static void imperfektaktivindikativa(){
				if (gv.endsWith("abam") || gv.endsWith("abas") || gv.endsWith("abat")) {
					gvs = gv.substring(0, gv.length()-4);
					gv = gv.substring(0, gv.length()-4) + "o";
				}else if (gv.endsWith("abamus") || gv.endsWith("abatis")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "o";
				}else if (gv.endsWith("abant")) {
					gvs = gv.substring(0, gv.length()-5);
					gv = gv.substring(0, gv.length()-5) + "o";
				}else {
					imperfektaktivkonjunktiva();
				}
			}
			
			/**-----------------------------------------
			 * --------Auswahl e-Konjugation------------
			 * -----------------------------------------*/
			
			public static void imperfektindikativaktive() {
				if (gv.endsWith("ebam") || gv.endsWith("ebas") || gv.endsWith("ebat")) {
					gvs = gv.substring(0,  gv.length()-4);
					gv = gv.substring(0, gv.length()-4) + "eo";
				}else if (gv.endsWith("ebamus") || gv.endsWith("ebatis")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "eo";
				}else if (gv.endsWith("ebant")) {
					gvs = gv.substring(0, gv.length()-5);
					gv = gv.substring(0, gv.length()-5) + "eo";
				}else {
					imperfektkonjunktivaktive();
				}
			}
			
		/**------------------------------------------------
		 * -----------------KONJUNKTIV---------------------
		 * ------------------------------------------------*/
	
			/**---------------------------------------------
			 * -------------Auswahl a-KOnjugation-----------
			 * --------------------------------------------- */
			
				public static void imperfektaktivkonjunktiva() {
					if (gv.endsWith("arem") || gv.endsWith("ares") || gv.endsWith("aret")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("aremus") || gv.endsWith("aretis")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "o";
					}else if (gv.endsWith("arent")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "o";
					}else {
						imperfektpassivindikativa();
					}
				}
				
			/**--------------------------------------------
			 * -----------Auswahl e-Konjugation------------
			 * -------------------------------------------- */
				
				public static void imperfektkonjunktivaktive() {
					if (gv.endsWith("eres") || gv.endsWith("erem") || gv.endsWith("eret")) {
						gvs = gv.substring(0,  gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "eo";
					}else if (gv.endsWith("eremus") || gv.endsWith("eretis")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
					}else if (gv.endsWith("erent")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "eo";
					}else {
						imperfektpassivindikative();
					}
				}
	
		
			
				
				
	//-----------------------------------------------------------------------------
	//--------------------------PASSIV---------------------------------------------
	//-----------------------------------------------------------------------------
				
		/**-------------------------------------------------
		 * -----------INDIKATIV-----------------------------
		 * -------------------------------------------------*/
				
			/**-------------------------------------
			 * -------Auswahl a-Konjugation--------- 
			 * -------------------------------------*/
				
				public static void imperfektpassivindikativa() {
					if (gv.endsWith("abar")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("abaris") || gv.endsWith("abatur") || gv.endsWith("abamur")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "o";
					}else if (gv.endsWith("abamini") || gv.endsWith("abantur")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
					}
				}
				
			/**-------------------------------------
			 * -------Auswahl e-Konjugation---------
			 * -------------------------------------*/
				
				public static void imperfektpassivindikative() {
					if (gv.endsWith("ebar")) {
						gvs = gv.substring(0,  gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "eo";
					}else if (gv.endsWith("ebaris") || gv.endsWith("ebatur") || gv.endsWith("ebamur")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
					}else if (gv.endsWith("abamini") || gv.endsWith("abantur")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "eo";
					}else {
						imperfektpassivkonjunktive();
					}
				}
				
		
				
		/**----------------------------------------------
		 * ---------------KONJUNKTIV---------------------
		 * ----------------------------------------------*/
				
			/**--------------------------------
			 * ------Auswahl a-Konjugation-----
			 * --------------------------------*/
				
				public static void imperfektpassivkonjunktiva() {
					if (gv.endsWith("arer")) {
						gvs = gv.substring(0, gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "o";
					}else if (gv.endsWith("areris") || gv.endsWith("aretur") || gv.endsWith("aremur")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "o";
					}else if (gv.endsWith("aremini") || gv.endsWith("arentur")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
					}else {
						perfekt p = new perfekt(gv);
						p.perfektaktivindikativa();
					}
				}
				
			/**---------------------------------
			 * ------Auswahl e-Konjugation------
			 * ---------------------------------*/
				
				public static void imperfektpassivkonjunktive() {
					if (gv.endsWith("erer")) {
						gvs = gv.substring(0,  gv.length()-4);
						gv = gv.substring(0, gv.length()-4) + "eo";
					}else if (gv.endsWith("ereris") || gv.endsWith("eretur") || gv.endsWith("eremus")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
					}else if (gv.endsWith("erentur")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "eo";
					}else {
						perfekt.perfektaktivindikative();
					}
				}
				
				
				
				
				
				
			
			public void imperfektaktivindikative() {
				
			}
			
		public static String returngv() {
			return gv;
		}
		
		public static String returngvs() {
			return gvs;
		}
}

