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
						Auswahl.überprüfung(gvs);
						
					}else if(gv.endsWith("averant")) {
						
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
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
						Auswahl.überprüfung(gvs);
						
					}else if (gv.endsWith("ueramus") || gv.endsWith("ueratis")) {
						
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
						
					}else if(gv.endsWith("uerant")) {
						
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
						
					}else if (gv.endsWith("seram") || gv.endsWith("seras") || gv.endsWith("serat")) {
						gvs = gv.substring(0, gv.length()-5);
						for (int i = 0;i < e.verbenes.length; i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
								}
							}
						}
					}else if (gv.endsWith("seramus") || gv.endsWith("seratis")) {
						gvs = gv.substring(0, gv.length()-7);
						for (int i = 0; i < e.verbenes.length; i++){
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
								}
							}
						}
					}else if (gv.endsWith("serant")){
						gvs = gv.substring(0, gv.length()-6);
						for (int i = 0; i < e.verbenes.length; i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenes()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
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
						
						gvs = gv.substring(0, gv.length()-5);
						System.out.println(gvs);
						Auswahl.überprüfung(gvs);
						
					}else if(gv.endsWith("iveramus") || gv.endsWith("iveratis")) {
						
						gvs=gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
						
					}else if(gv.endsWith("iverant")) {
						
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
					}
				}
				
			//----------------------------------------------
			//-----------Auswahl kons-Konjugation-----------
			//----------------------------------------------
		
				public static void plusquamperfektindikativkons() {
					
					if (gv.endsWith("xeram") || gv.endsWith("xeras") || gv.endsWith("xerat")) {
						
						gvs = gv.substring(0, gv.length()-5);
						Auswahl.überprüfung(gvs);
								
					}else if (gv.endsWith("xeramus") || gv.endsWith("xeratis")) {
						
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
						
					}else if (gv.endsWith("xerant")) {
						
						gvs = gv.substring(0, gv.length()-6);
						Auswahl.überprüfung(gvs);
						
					}else if (gv.substring(0,2).equals(gv.substring(2,4))){
						
						gvs = gv.substring(0, gv.length()-4);						
						Auswahl.überprüfung(gvs);
						
						
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
						Auswahl.überprüfung(gvs);
						
					}else if (gv.endsWith("avissemus") || gv.endsWith("avissetis")) {
						
						gvs = gv.substring(0, gv.length()-9);
						Auswahl.überprüfung(gvs);
						
					}else if(gv.endsWith("avissent")) {
						
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
						
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
						Auswahl.überprüfung(gvs);
						
					}else if (gv.endsWith("uissemus") || gv.endsWith("uissetis")) {
						
						gvs = gv.substring(0, gv.length()-8);
						Auswahl.überprüfung(gvs);
						
					}else if (gv.endsWith("uissent")) {
						
						gvs = gv.substring(0, gv.length()-7);
						Auswahl.überprüfung(gvs);
						
					}else if (gv.endsWith("sissem") || gv.endsWith("sisses") || gv.endsWith("sisset")) {
						gvs = gv.substring(0, gv.length()-6);
						for (int i = 0; i < e.rverbenes()[i].length(); i++ ) {
							if (gvs.equals(e.rverbenes()[i])) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
								}
							}
						}
					}else if (gv.endsWith("sissemus") || gv.endsWith("sissetis")) {
						gvs = gv.substring(0, gv.length()-8);
						for (int i = 0; i < e.rverbenes()[i].length(); i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
								}
							}
						}
					}else if (gv.endsWith("sissent")) {
						gvs = gv.substring(0, gv.length()-7);
						for (int i = 0; i < e.rverbenes()[i].length(); i++) {
							if (e.rverbenes()[i].equals(gvs)) {
								if (gvs.equals(e.rverbenes()[i].substring(0, gvs.length()))) {
									Auswahl.überprüfung(gvs);
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
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("itus")) {
							gvs = gv.substring(0, gv.length()-9);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-8);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-5).endsWith("sus")) {
							gvs = gv.substring(0, gv.length()-8);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										Auswahl.überprüfung(gvs);
									}
								}
							}
						}else if(gv.substring(0, gv.length()-5).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-7);
							Auswahl.überprüfung(gvs);						
						}
					}else if (gv.endsWith(" eramus") || gv.endsWith(" eratis")) {
						if (gv.substring(0, gv.length()-7).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-10);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("iti")) {
							gvs = gv.substring(0, gv.length()-10);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-9);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("si")) {
							gvs = gv.substring(0, gv.length()-9);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										Auswahl.überprüfung(gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							Auswahl.überprüfung(gvs);
						}

					}else if(gv.endsWith(" erant")) {
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
							for (int i = 0; i < e.rverbenes().length; i++) {
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
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("itus")){
							gvs = gv.substring(0, gv.length()-10);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("tus")) {
							gvs = gv.substring(0, gv.length()-9);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-6).endsWith("sus")){
							gvs = gv.substring(0, gv.length()-9);
							for (int i = 0; i < e.rverbenes().length; i++){
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										Auswahl.überprüfung(gvs);
									}
								}
							}
							
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (gvs.equals(e.rverbenes()[i])) {
									if (gvs.equals(e.rverbenesn()[i].substring(0,  gvs.length()))) {
										Auswahl.überprüfung(gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-6).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-8);
							Auswahl.überprüfung(gvs);
						}
					}else if (gv.endsWith(" essemus") || gv.endsWith(" essetis")) {
						if (gv.substring(0, gv.length()-8).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-11);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("iti")){
							gvs = gv.substring(0, gv.length()-11);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-10);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-8).endsWith("si")){
							gvs = gv.substring(0, gv.length()-10);
							for (int i = 0; i < e.rverbenes().length; i++){
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										Auswahl.überprüfung(gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-8).endsWith("si")) {
							gvs = gv.substring(0, gv.length()-10);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0, gvs.length()))) {
										Auswahl.überprüfung(gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-8).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-9);
							Auswahl.überprüfung(gvs);
						}
					}else if (gv.endsWith(" essent")) {
						if (gv.substring(0, gv.length()-7).endsWith("ati")) {
							gvs = gv.substring(0, gv.length()-10);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("iti")){
							gvs =gv.substring(0, gv.length()-10);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("ti")) {
							gvs = gv.substring(0, gv.length()-9);
							Auswahl.überprüfung(gvs);
						}else if (gv.substring(0, gv.length()-7).endsWith("si")){
							gvs = gv.substring(0, gv.length()-9);
							for (int i = 0; i < e.rverbenes().length; i++) {
								if (e.rverbenes()[i].equals(gvs)) {
									if (gvs.equals(e.rverbenesn()[i].substring(0,  gvs.length()))) {
										Auswahl.überprüfung(gvs);
									}
								}
							}
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							Auswahl.überprüfung(gvs);
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