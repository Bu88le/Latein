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
						gv = gv.substring(gv.length()-6) + "o";
					}else if (gv.endsWith("arent")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "o";
					}else {
						imperfektpassivindikativa();
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
				
				
				
				
				
				
			
			public void imperfektaktivindikative() {
				
			}
			
		public static String returngv() {
			return gv;
		}
		
		public static String returngvs() {
			return gvs;
		}
}

