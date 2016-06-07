package zeiten;

import vokabeln.e;
import wörter.*;

public class plusquamperfekt {

		static String gv;
		static String gvs;
		static String vok;
		public static String gvu;
		static boolean akon,ekon,ikon,konskon;
		
		
		public plusquamperfekt (String s) {
			gv = s;
			gvu = s;
		}
		
		/** --------------------------------------------------------------------------------------------
		 * ------------------------------------INDIKATIV && AKTIV---------------------------------------
		 * ---------------------------------------------------------------------------------------------
		 */
		
			//--------------------------------------------------
			//------------Auswahl a-Konjugation-----------------
			//--------------------------------------------------
		
				public static void plusquamperfektindikativaktiva() {
					
					if (gv.endsWith("averam") || gv.endsWith("averas") || gv.endsWith("averat") ) {
										
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
						
					}else if(gv.endsWith("averamus") || gv.endsWith("averatis")) {
						
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						
					}else if(gv.endsWith("averant")) {
						
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
					}else {
						plusquamperfektkonjunktiva();
					}
				}
		
			//------------------------------------------------
			//-----------Auswahl e-Konjugation----------------
			//------------------------------------------------
				
				public static void plusquamperfektindikativaktive() {
					
					if (gv.endsWith("ueram") || gv.endsWith("ueras") || gv.endsWith("uerat")) {
						
						gvs = gv.substring(0, gv.length()-5);
						gv = gv.substring(0, gv.length()-5) + "eo";
						
					}else if (gv.endsWith("ueramus") || gv.endsWith("ueratis")) {
						
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "eo";
						
					}else if(gv.endsWith("uerant")) {
						
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
						
					}else if (gv.endsWith("seram") || gv.endsWith("seras") || gv.endsWith("serat")) {
						gvs = gv.substring(0, gv.length()-5);
						System.out.println(gvs);
						for (int i = 0;i < e.verbenes.length; i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									gv = e.rverbenesn()[i];
									vok = e.rverbenesn()[i].substring(0, e.rverbenesn()[i].length()-1) + "re";
									ekon = true;
									System.out.println(vok);
								}
							}
						}
					}else if (gv.endsWith("seramus") || gv.endsWith("seratis")) {
						gvs = gv.substring(0, gv.length()-7);
						System.out.println(gvs);
						for (int i = 0; i < e.verbenes.length; i++){
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									gv = e.rverbenesn()[i];
									vok = e.rverbenesn()[i].substring(0, e.rverbenesn()[i].length()-1) + "re";
									ekon = true;
									System.out.println(vok);
								}
							}
						}
					}else if (gv.endsWith("serant")){
						gvs = gv.substring(0, gv.length()-6);
						for (int i = 0; i < e.verbenes.length; i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenes()[i].substring(0, gvs.length()))) {
									gv = e.rverbenesn()[i];
									vok = e.rverbenesn()[i].substring(0, e.rverbenesn()[i].length()-1) + "re";
									ekon = true;
								}
							}
						}
					}else {
						plusquamperfektkonjunktive();
					}
				}
				
			//-----------------------------------------------
			//---------------Auswahl i-Konjugation-----------
			//-----------------------------------------------
		
				public void plusquamperfektindikativaktivi() {
					
					if (gv.endsWith("iveram") || gv.endsWith("iveras") || gv.endsWith("iverat")) {
						
						gv = gv.substring(0, gv.length()-5) + "o";
						
					}else if(gv.endsWith("iveramus") || gv.endsWith("iveratis")) {
						
						gv= gv.substring(0 , gv.length()-7) + "o";
						
					}else if(gv.endsWith("iverant")) {
						
						gv = gv.substring(0, gv.length()-6) + "o";
					}
				}
				
			//----------------------------------------------
			//-----------Auswahl kons-Konjugation-----------
			//----------------------------------------------
		
				public static void plusquamperfektindikativkons() {
					
					if (gv.endsWith("xeram") || gv.endsWith("xeras") || gv.endsWith("xerat")) {
						
						gv = gv.substring(0, gv.length()-5) + "co";
								
					}else if (gv.endsWith("xeramus") || gv.endsWith("xeratis")) {
						
						gv = gv.substring(0, gv.length()-7) + "co";
						
					}else if (gv.endsWith("xerant")) {
						
						gv = gv.substring(0, gv.length()-6) + "co";
						
					}else if (gv.substring(0,2).equals(gv.substring(2,4))){
						
						System.out.println(gv.substring(3,4));
						
						gv = gv.substring(2, gv.length()-4) + "o";
						
						
					}					
				}
		

		/** -------------------------------------------------------------------------------------------------
		 * ----------------------------------KONJUNKTIV && AKTIV---------------------------------------------
		 * --------------------------------------------------------------------------------------------------
		 */
				
			//---------------------------------------------
			//-------------Auswahl a-Konjugation-----------
			//---------------------------------------------
		
				public static void plusquamperfektkonjunktiva() {
					
					if (gv.endsWith("avissem") || gv.endsWith("avisses") || gv.endsWith("avisset")) {
						
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "o";
						
					}else if (gv.endsWith("avissemus") || gv.endsWith("avissetis")) {
						
						gvs = gv.substring(0, gv.length()-9);
						gv = gv.substring(0, gv.length()-9) + "o";
						
					}else if(gv.endsWith("avissent")) {
						
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "o";
						
					}else {
						plusquamperfektpassivindikativa();
					}
				}
				
			//--------------------------------------------
			//------------Auswahl e-Konjugation-----------
			//--------------------------------------------
		
				public static void plusquamperfektkonjunktive() {
					
					if (gv.endsWith("uissem") || gv.endsWith("uisses") || gv.endsWith("uisset")) {
						
						gvs = gv.substring(0, gv.length()-6);
						gv = gv.substring(0, gv.length()-6) + "eo";
						
					}else if (gv.endsWith("uissemus") || gv.endsWith("uissetis")) {
						
						gvs = gv.substring(0, gv.length()-8);
						gv = gv.substring(0, gv.length()-8) + "eo";
						
					}else if (gv.endsWith("uissent")) {
						
						gvs = gv.substring(0, gv.length()-7);
						gv = gv.substring(0, gv.length()-7) + "eo";
						
					}else if (gv.endsWith("sissem") || gv.endsWith("sisses") || gv.endsWith("sisset")) {
						gvs = gv.substring(0, gv.length()-6);
						for (int i = 0; i < e.rverbenes()[i].length(); i++ ) {
							if (gvs.equals(e.rverbenes()[i])) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									gv = e.rverbenesn()[i];
									vok = e.rverbenespn()[i].substring(0, e.rverbenespn()[i].length()-1) + "re";
								}
							}
						}
					}else if (gv.endsWith("sissemus") || gv.endsWith("sissetis")) {
						gvs = gv.substring(0, gv.length()-8);
						for (int i = 0; i < e.rverbenes()[i].length(); i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									gv = e.rverbenesn()[i];
									vok = e.rverbenespn()[i].substring(0,  e.rverbenespn()[i].length()-1) + "re";
								}
							}
						}
					}else if (gv.endsWith("sissent")) {
						gvs = gv.substring(0, gv.length()-7);
						for (int i = 0; i < e.rverbenes()[i].length(); i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenes()[i].substring(0, gvs.length()))) {
									gv = e.rverbenesn()[i];
									vok = e.rverbenespn()[i].substring(0,  gvs.length()-1) + "re";
								}
							}
						}
					}
				}
		
				
	/**--------------------------------------------------------------------------------------------------------------
	 * -------------------------------PASSIV && INDIKATIV------------------------------------------------------------ 
	 * --------------------------------------------------------------------------------------------------------------
	 */
		
		//-----------------------------------------------
		//----------Auswahl a-Konjugation----------------
		//-----------------------------------------------
				
				public static void plusquamperfektpassivindikativa() {

					if (gv.endsWith(" eram") ||gv.endsWith(" erat") || gv.endsWith(" eras")) {
						if (gv.substring(0, gv.length()-5).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "o";
							akon = true;
							new akonjugation(gv, gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("itus")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "io";
							ikon = true;
						}else if (gv.substring(0, gv.length()-5).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-8);
							gv = gv.substring(0, gv.length()-8) + "o";
							konskon = true;
						}else if (gv.substring(0, gv.length()-5).endsWith("sus")) {
							gvs = gv.substring(0, gv.length()-8);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										gv = e.rverbenesn()[i];
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
						}else if(gv.substring(0, gv.length()-5).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-7);
							ekon = true;
							new ekonjugation(gv, gvs);							
						}
					}else if (gv.endsWith(" eramus") || gv.endsWith(" eratis")) {
						if (gv.substring(0, gv.length()-7).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-10);
							gv = gv.substring(0, gv.length()-10) + "o";
							new akonjugation(gv, gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("iti")) {
							gvs = gv.substring(0, gv.length()-10);
							gv = gv.substring(0, gv.length()-10) + "io";
							ikon = true;
						}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "o";
							konskon = true;
						}else if (gv.substring(0, gv.length()-7).endsWith("si")) {
							gvs = gv.substring(0, gv.length()-9);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										gv = e.rverbenesn()[i];
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							new ekonjugation(gv, gvs);
						}

					}else if(gv.endsWith(" erant")) {
						System.out.println("HALLO");
						if (gv.substring(0, gv.length()-6).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "o";
							new akonjugation(gv, gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "io";
							ikon = true;
						}else if (gv.substring(0, gv.length()-6).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-8);
							gv = gv.substring(0, gv.length()-8) + "o";
							konskon = true;
						}else if (gv.substring(0, gv.length()-6).endsWith("si")){
							System.out.println("hi");
							gvs = gv.substring(0, gv.length()-8);
							System.out.println(gvs);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									System.out.println("..");
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										System.out.println("...");
										gv = e.rverbenesn()[i];
										System.out.println(gv);
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-7);
							ekon = true;
							new ekonjugation(gv, gvs);
						}
					}else {
						plusquamperfektpassivkonjunktiva();
					}	
				}
		
	/**-------------------------------------------------------------------------------------------------------------------
	 * ----------------------------------------------PASSIV && KONJUNKTIV-------------------------------------------------
	 * ------------------------------------------------------------------------------------------------------------------
	 */
				
		//-------------------------------------------------------------
		//--------------------Auswahl a-Konjugation--------------------
		//-------------------------------------------------------------
			
				public static void plusquamperfektpassivkonjunktiva() {
					
					if (gv.endsWith(" essem") || gv.endsWith(" esses") || gv.endsWith(" esset")) {
						if (gv.substring(0, gv.length()-6).endsWith("atus")) {
							gvs = gv.substring(0, gv.length()-10);
							gv = gv.substring(0, gv.length()-10) + "o";
							akon = true;
							new akonjugation(gv, gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-10);
							gv = gv.substring(0, gv.length()-10) + "io";
							ikon = true;
						}else if (gv.substring(0, gv.length()-6).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "o";
							konskon = true;
						}else if (gv.substring(0, gv.length()-6).endsWith("sus")){
							gvs = gv.substring(0, gv.length()-9);
							for (int i = 0; i < e.rverbenes().length; i++){
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										gv = e.rverbenesn()[i];
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
							
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (gvs.equals(e.rverbenes()[i])) {
									if (gvs.equals(e.rverbenesn()[i].substring(0,  gvs.length()))) {
										gv = e.rverbenesn()[i];
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-6).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-8);
							gv = gv.substring(0, gv.length()-8) + "eo";
							ekon = true;
							new ekonjugation(gv, gvs);
						}
					}else if (gv.endsWith(" essemus") || gv.endsWith(" essetis")) {
						if (gv.substring(0, gv.length()-8).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-11);
							gv = gv.substring(0, gv.length()-11) + "o";
							akon = true;
							new akonjugation(gv, gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-11);
							gv = gv.substring(0, gv.length()-11) + "io";
							ikon = true;
						}else if (gv.substring(0, gv.length()-8).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-10);
							gv = gv.substring(0, gv.length()-10) + "o";
							konskon = true;
						}else if (gv.substring(0, gv.length()-8).endsWith("si")){
							gvs = gv.substring(0, gv.length()-10);
							for (int i = 0; i < e.rverbenes().length; i++){
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										gv = e.rverbenesn()[i];
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-8).endsWith("si")) {
							gvs = gv.substring(0, gv.length()-10);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										gv = e.rverbenesn()[i];
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-8).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "eo";
							ekon = true;
							new ekonjugation(gv, gvs);
						}
					}else if (gv.endsWith(" essent")) {
						if (gv.substring(0, gv.length()-7).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-10);
							gv = gv.substring(0, gv.length()-10) + "o";
							akon = true;
							new akonjugation(gv, gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("iti")){
							gvs =gv.substring(0, gv.length()-10);
							gv = gv.substring(0, gv.length()-10) + "io";
							ikon = true;
						}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "o";
							konskon = true;
						}else if (gv.substring(0, gv.length()-7).endsWith("si")){
							gvs = gv.substring(0, gv.length()-9);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0,  gvs.length()))) {
										gv = e.rverbenesn()[i];
										vok = e.rverbenesn()[i].substring(0, gvs.length()-1) + "re";
										new ekonjugation(gv, gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							gv = gv.substring(0, gv.length()-8) + "eo";
							ekon = true;
							new ekonjugation(gv, gvs);
						}
					}else {
					}
				}	
		
		
		
		public String returngv() {
			return gv;
		}
		
		public static String returngvs() {
			return gvs;
		}
		
		public static String returngvu() {
			return gvu;
		}
		
		public static String returnvok() {
			return vok;
		}
}