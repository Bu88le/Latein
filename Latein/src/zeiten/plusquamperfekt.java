package zeiten;

import javax.swing.JOptionPane;

import wörter.*;

public class plusquamperfekt {

		static String gv;
		static String gvs;
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
						gv = gv.substring(0, gv.length()-6) + "o";
						
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
						System.out.println("HIER");
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
						}else if(gv.substring(0, gv.length()-5).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-7);
							gv = gv.substring(0, gv.length()-7) + "eo";
							ekon = true;
							System.out.println("jup");
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
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							gv = gv.substring(0, gv.length()-8) + "eo";
						}
					}else if(gv.endsWith(" erant")) {
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
						}else if (gv.substring(0, gv.length()-6).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-7);
							gv = gv.substring(0, gv.length()-7) + "eo";
							ekon = true;
						}
					}else {
						plusquamperfektpassivkonjunktiva();
					}

				}
				
				
				public static void plusquamperfektpassivindikative(){
					
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
						}else if (gv.substring(0, gv.length()-6).endsWith("us")) {
							gvs = gv.substring(0, gv.length()-8);
							gv = gv.substring(0, gv.length()-8) + "eo";
							ekon = true;
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
						}else if (gv.substring(0, gv.length()-8).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-9);
							gv = gv.substring(0, gv.length()-9) + "eo";
							ekon = true;
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
						}else if (gv.substring(0, gv.length()-7).endsWith("i")) {
							gvs = gv.substring(0, gv.length()-8);
							gv = gv.substring(0, gv.length()-8) + "eo";
							ekon = true;
						}
					}else {
					}
				}
				
			
		
		
		
		
		static public String returngv() {
			return gv;
		}
		
		public String returngvs() {
			return gvs;
		}
		
		public static String returngvu() {
			return gvu;
		}
}