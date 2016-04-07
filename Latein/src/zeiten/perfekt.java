package zeiten;

import wörter.akonjugation;

public class perfekt {
	static String gv;
	static String gvs;
	static boolean akon;
	
	
	public perfekt (String s) {
		gv = s;
	}
	
	
	//----------------------------------------------------------------------
	//------------------AKTIV && INDIKATIV----------------------------------
	//----------------------------------------------------------------------
	
		/**---------------------------------------------
		 * -----------Auswahl a-Konjugation-------------
		 * ---------------------------------------------*/
	
			public static  void perfektaktivindikativa() {
				if (gv.endsWith("avi")) {
					
					gvs = gv.substring(0, gv.length()-3);
					gv = gv.substring(0, gv.length()-3) + "o";
				}else if (gv.endsWith("avisti") || gv.endsWith("avimus")) {
					
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "o";
				}else if(gv.endsWith("avit")) {
					
					gvs = gv.substring(0, gv.length()-4);
					gv = gv.substring(0, gv.length()-4) + "o";
				}else if(gv.endsWith("avistis") || gv.endsWith("averunt")) {
					
					gvs = gv.substring(0, gv.length()-7);
					gv = gv.substring(0, gv.length()-7) + "o";
				}else {
					perfektakitvkonjunktiva();
				}
			}
			
			
	//-----------------------------------------------------------------------
	//------------------AKTIV && KONJUNKTIV----------------------------------
	//-----------------------------------------------------------------------
			
		/**-------------------------------------------------
		 * ----------Auswahl a-Konjugation------------------
		 * -------------------------------------------------*/
			
			public static void perfektakitvkonjunktiva() {
				if (gv.endsWith("avero")) {
					gvs = gv.substring(0, gv.length()-5);
					gv = gv.substring(0, gv.length()-5) + "o";
				}else if (gv.endsWith("averitis") || gv.endsWith("averimus")) {
					gvs = gv.substring(0, gv.length()-8);
					gv = gv.substring(0, gv.length()-8) + "o";
				}else if (gv.endsWith("averis") || gv.endsWith("averit")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "o";
				}else if (gv.endsWith("averint")) {
					gvs = gv.substring(0, gv.length()-7);
					gv = gv.substring(0, gv.length()-7) + "o";
				}else {
					perfektpassivindikativa();
				}
			}
			
			
	//-----------------------------------------------------------------------
	//-------------------PASSIV && INDIKATIV---------------------------------
	//-----------------------------------------------------------------------
			
		/**--------------------------------------------------------
		 * --------------Auswahl a-Konjugation--------------------- 
		 * --------------------------------------------------------*/
			
			public static void perfektpassivindikativa() {
				if (gv.endsWith(" sum") || gv.endsWith(" est")) {
					if (gv.substring(0, gv.length()-4).endsWith("atus")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						akon = true;
					}else {
					}
				}else if (gv.endsWith(" es")) {
					if (gv.substring(0, gv.length()-3).endsWith("atus")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
						akon = true;
					}else {
					}
				}else if (gv.endsWith(" sumus") || gv.endsWith(" estis")) {
					if (gv.substring(0, gv.length()-6).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
						akon = true;
					}else {
					}
				}else if (gv.endsWith(" sunt")) {
					if (gv.substring(0, gv.length()-5).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						akon = true;
					}else {
					}
				}else {
					perfektpassivkonjunktiva();
				}
				
				if (akon == true) {
					new akonjugation(gv, gvs);
				}
			}
			
			
			
	//--------------------------------------------------------------------------
	//-----------------PASSIV && KONJUNKTIV-------------------------------------
	//--------------------------------------------------------------------------
			
		/**-----------------------------------------------------
		 * --------------Auswahl a-Konjugation------------------
		 * -----------------------------------------------------*/
			
			public static void perfektpassivkonjunktiva() {
				if (gv.endsWith(" sim") || gv.endsWith(" sis") || gv.endsWith(" sit")) {
					if (gv.substring(0, gv.length()-4).endsWith("atus")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						akon = true;
					}else {
					}
				}else if (gv.endsWith(" simus") || gv.endsWith(" sitis")) {
					if (gv.substring(0, gv.length()-6).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
						akon = true;
					}else {
					}
				}else if (gv.endsWith(" sint")) {
					if (gv.substring(0, gv.length()-5).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						akon = true;
					}else {
					}
				}else {
				}
				
				if (akon == true) {
					new akonjugation(gv, gvs);
				}
			}
			
			
			
			
	public String returngv() {
		return gv;
	}
	
	public String returngvs() {
		return gvs;
	}
}