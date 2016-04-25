package zeiten;

import wörter.akonjugation;

public class perfekt {
	static String gv;
	static String gvs;
	static boolean akon, ikon, ekon, konskon;
	
	
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
			
		/**-----------------------------------------------
		 * ---------Auswahl e-Konjugation-----------------
		 * -----------------------------------------------*/
			
			public static void perfektaktivindikative() {
				if (gv.endsWith("ui")) {
					gvs = gv.substring(0, gv.length()-2);
					gv = gv.substring(0, gv.length()-2) + "eo";
				}else if (gv.endsWith("uisti") || gv.endsWith("uimus") ) {
					gvs = gv.substring(0, gv.length()-5);
					gv = gv.substring(0, gv.length()-5) + "eo";
				}else if (gv.endsWith("uit")) {
					gvs = gv.substring(0, gv.length()-3);
					gv = gv.substring(0, gv.length()-3) + "eo";
				}else if (gv.endsWith("uerunt") || gv.endsWith("uistis")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "eo";
				}
			}
			
			
	//-----------------------------------------------------------------------
	//------------------AKTIV && KONJUNKTIV----------------------------------
	//-----------------------------------------------------------------------
			
		/**-------------------------------------------------
		 * ----------Auswahl a-Konjugation------------------
		 * -------------------------------------------------*/
			
			public static void perfektakitvkonjunktiva() {
				if (gv.endsWith("averim")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "o";
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
			
		/**------------------------------------------------
		 * -----------Auswahl e-Konjugation----------------
		 *-------------------------------------------------*/
			
			public static void perfektaktivkonjunktive() {
				if (gv.endsWith("uerim") || gv.endsWith("ueris") || gv.endsWith("uerit")) {
					gvs = gv.substring(0, gv.length()-5);
					gv = gv.substring(0, gv.length()-5) + "eo";
				}else if (gv.endsWith("ueris") || gv.endsWith("uerit")) {
					gvs = gv.substring(0, gv.length()-5);
					gv = gv.substring(0, gv.length()-5) + "eo";
				}else if (gv.endsWith("uerimus") || gv.endsWith("ueritis")) {
					gvs = gv.substring(0, gv.length()-7);
					gv = gv.substring(0, gv.length()-7) + "eo";
				}else if (gv.endsWith("uerint")) {
					gvs = gv.substring(0, gv.length()-6);
					gv = gv.substring(0, gv.length()-6) + "eo";
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
						new akonjugation(gv, gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "io";
						ikon = true;
					}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
						konskon = true;
					}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
						ekon = true;
					}
				}else if (gv.endsWith(" es")) {
					if (gv.substring(0, gv.length()-3).endsWith("atus")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
						akon = true;
					}else if (gv.substring(0, gv.length()-3).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "io";
						ikon = true;
					}else if (gv.substring(0, gv.length()-3).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "o";
						konskon = true;
					}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "eo";
						ekon = true;
					}
				}else if (gv.endsWith(" sumus") || gv.endsWith(" estis")) {
					if (gv.substring(0, gv.length()-6).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
						akon = true;
					}else if (gv.substring(0, gv.length()-6).endsWith("iti")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "io";
						ikon = true;
					}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						konskon = true;
					}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "eo";
						ekon = true;
					}
				}else if (gv.endsWith(" sunt")) {
					if (gv.substring(0, gv.length()-5).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						akon = true;
					}else if (gv.substring(0, gv.length()-5).endsWith("iti")){
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "io";
						ikon = true;
					}else if (gv.substring(0, gv.length()-5).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
						konskon = true;
					}else if (gv.substring(0, gv.length()-5).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
						ekon = true;
					}
				}else {
					perfektpassivkonjunktiva();
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
						new akonjugation(gv, gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "io";
						ikon = true;
					}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
						konskon = true;
					}else if(gv.substring(0, gv.length()-4).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
						ekon = true;
					}
				}else if (gv.endsWith(" simus") || gv.endsWith(" sitis")) {
					if (gv.substring(0, gv.length()-6).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
						akon = true;
					}else if (gv.substring(0, gv.length()-6).endsWith("iti")){
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "io";
						ikon = true;
					}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						konskon = true;
					}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "eo";
						ekon = true;
					}
				}else if (gv.endsWith(" sint")) {
					if (gv.substring(0, gv.length()-5).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						akon = true;
					}else if (gv.substring(0, gv.length()-5).endsWith("iti")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "io";
						ikon = true;
					}else if (gv.substring(0, gv.length()-5).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
						konskon = true;
					}else if (gv.substring(0, gv.length()-5).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
						ekon = true;
					}
				}
			}
			
			
			
			
	public String returngv() {
		return gv;
	}
	
	public String returngvs() {
		return gvs;
	}
}