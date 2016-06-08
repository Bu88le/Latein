package zeiten;

import vokabeln.e;
import wörter.*;

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
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("avisti") || gv.endsWith("avimus")) {
					
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if(gv.endsWith("avit")) {
					
					gvs = gv.substring(0, gv.length()-4);
					Auswahl.überprüfung(gvs);
				}else if(gv.endsWith("avistis") || gv.endsWith("averunt")) {
					
					gvs = gv.substring(0, gv.length()-7);
					Auswahl.überprüfung(gvs);
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
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("uisti") || gv.endsWith("uimus") ) {
					gvs = gv.substring(0, gv.length()-5);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("uit")) {
					gvs = gv.substring(0, gv.length()-3);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("uerunt") || gv.endsWith("uistis")) {
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if(gv.endsWith("si")) {
					gvs = gv.substring(0, gv.length()-2);
					for (int i = 0; i < e.rverbenes().length; i++) {
						if (e.rverbenes()[i].equals(gvs)) {
							if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
								Auswahl.überprüfung(gvs);
							}
						}
					}
				}else if (gv.endsWith("sisti") || gv.endsWith("simus")){
					gvs = gv.substring(0, gv.length()-5);
					for (int i = 0; i < e.rverbenes().length; i++) {
						if (e.rverbenes()[i].equals(gvs)) {
							if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
								Auswahl.überprüfung(gvs);
							}
						}
					}
				}else if (gv.endsWith("sit")){
					gvs = gv.substring(0, gv.length()-3);
					for (int i = 0; i < e.rverbenes().length; i++) {
						if (e.rverbenes()[i].equals(gvs)) {
							if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
								Auswahl.überprüfung(gvs);
							}
						}
					}
				}else if (gv.endsWith("serunt") || gv.endsWith("sistis")){
					gvs = gv.substring(0, gv.length()-6);
					for (int i = 0; i < e.rverbenes().length; i++) {
						if (e.rverbenes()[i].equals(gvs)) {
							if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
								Auswahl.überprüfung(gvs);
							}
						}
					}
				}else {
					perfektaktivkonjunktive();
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
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("averitis") || gv.endsWith("averimus")) {
					gvs = gv.substring(0, gv.length()-8);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("averis") || gv.endsWith("averit")) {
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("averint")) {
					gvs = gv.substring(0, gv.length()-7);
					Auswahl.überprüfung(gvs);
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
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("uerimus") || gv.endsWith("ueritis")) {
					gvs = gv.substring(0, gv.length()-7);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("uerint")) {
					gvs = gv.substring(0, gv.length()-6);
					Auswahl.überprüfung(gvs);
				}else if (gv.endsWith("serim") || gv.endsWith("seris") || gv.endsWith("serit")) {
					gvs = gv.substring(0, gv.length()-5);
					for (int i = 0; i< e.rverbenes().length; i++) {
						if (e.rverbenes()[i].equals(gvs)) {
							if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
								Auswahl.überprüfung(gvs);
							}
						}
					}
				}else if (gv.endsWith("serimus") || gv.endsWith("seritis")) {
					gvs = gv.substring(0, gv.length()-7);
					for (int i = 0; i< e.rverbenes().length; i++) {
						if (e.rverbenes()[i].equals(gvs)) {
							if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
								Auswahl.überprüfung(gvs);
							}
						}
					}
				}else if (gv.endsWith("serint")) {
					gvs = gv.substring(0, gv.length()-6);
					for (int i = 0; i< e.rverbenes().length; i++) {
						if (e.rverbenes()[i].equals(gvs)) {
							if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
								Auswahl.überprüfung(gvs);
							}
						}
					}
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
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("sus")){
						gvs = gv.substring(0, gv.length()-7);
						for (int i = 0; i < e.rverbenes().length; i++) {
							if(e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);								
								}
							}
						}
					}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
					}
				}else if (gv.endsWith(" es")) {
					if (gv.substring(0, gv.length()-3).endsWith("atus")) {
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-3).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-3).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-3).endsWith("sus")){
						gvs = gv.substring(0, gv.length()-6);
						for (int i = 0; i < e.rverbenes().length; i++) {
							if(e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);							
								}
							}
						}
					}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-5);
						Auswahl.überprüfung(gvs);
					}
				}else if (gv.endsWith(" sumus") || gv.endsWith(" estis")) {
					if (gv.substring(0, gv.length()-6).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-9);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-6).endsWith("iti")) {
						gvs = gv.substring(0, gv.length()-9);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-6).endsWith("si")){
						gvs = gv.substring(0, gv.length()-8);
						for (int i = 0; i < e.rverbenes().length; i++) {
							if(e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);									
								}
							}
						}
					}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}
				}else if (gv.endsWith(" sunt")) {
					if (gv.substring(0, gv.length()-5).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-5).endsWith("iti")){
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-5).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-5).endsWith("si")){
						gvs = gv.substring(0, gv.length()-7);
						for (int i = 0; i < e.rverbenes().length; i++) {
							if(e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);								
								}
							}
						}
					}else if (gv.substring(0, gv.length()-5).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
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
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("sus")){
						gvs = gv.substring(0, gv.length()-7);
						for (int i = 0; i < e.rverbenes()[i].length(); i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
								}
							}
						}
					}else if(gv.substring(0, gv.length()-4).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
					}
				}else if (gv.endsWith(" simus") || gv.endsWith(" sitis")) {
					if (gv.substring(0, gv.length()-6).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-9);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-6).endsWith("iti")){
						gvs = gv.substring(0, gv.length()-9);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-6).endsWith("si")){
						gvs = gv.substring(0, gv.length()-8);
						for (int i = 0; i < e.rverbenes()[i].length(); i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
								}
							}
						}
					}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}
				}else if (gv.endsWith(" sint")) {
					if (gv.substring(0, gv.length()-5).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-5).endsWith("iti")) {
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-5).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
					}else if (gv.substring(0, gv.length()-5).endsWith("si")){
						gvs = gv.substring(0, gv.length()-7);
						for (int i = 0; i < e.rverbenes()[i].length(); i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
								}
							}
						}
					}else if (gv.substring(0, gv.length()-5).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
					}
				}
			}
			
			
			
			
	public static String returngv() {
		return gv;
	}
	
	public static String returngvs() {
		return gvs;
	}
}