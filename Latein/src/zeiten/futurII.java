package zeiten;

import wörter.*;

public class futurII {

	public static String gv;
	public static String gvs;
	
	public futurII(String s) {
		gv = s;
	}
	
	//--------------------------------------------------------
	//---------------PASSIV-----------------------------------
	//--------------------------------------------------------
		/**-------------------------------------------
		 * --------------Auswahl a-Konjugation--------
		 * -------------------------------------------*/
			public static void futurIIpassiv() {
				if (gv.endsWith(" ero")) {
					if (gv.substring(0, gv.length()-4).endsWith("atus")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						new akonjugation(gv, gvs);
					}else if (gv.substring(0, gv.length()-4).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "io";
					}else if (gv.substring(0, gv.length()-4).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
					}else if (gv.substring(0, gv.length()-4).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
						new ekonjugation(gv, gvs);
					}
				}else if (gv.endsWith(" eris") || gv.endsWith(" erit")) {
					if (gv.substring(0, gv.length()-5).endsWith("atus")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
						new akonjugation(gv, gvs);
					}else if (gv.substring(0, gv.length()-5).endsWith("itus")){
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "io";
					}else if (gv.substring(0, gv.length()-5).endsWith("tus")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
					}else if (gv.substring(0, gv.length()-5).endsWith("us")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7);
						new ekonjugation(gv, gvs);
					}
				}else if (gv.endsWith(" erimus") || gv.endsWith(" eritis")) {
					if (gv.substring(0, gv.length()-7).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-10);
						gv = gv.substring(0, gv.length()-10) + "o";
						new akonjugation(gv, gvs);
					}else if (gv.substring(0, gv.length()-7).endsWith("iti")){
						gvs = gv.substring(0, gv.length()-10);
						gv = gv.substring(0, gv.length()-10) + "io";
					}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
					}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "eo";
						new ekonjugation(gv, gvs);
					}
				}else if (gv.endsWith(" erunt")) {
					if (gv.substring(0, gv.length()-6).endsWith("ati")) {
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
						new akonjugation(gv, gvs);
					}else if (gv.substring(0, gv.length()-6).endsWith("iti")){
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "io";
					}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
					}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "eo";
						new ekonjugation(gv, gvs);
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
