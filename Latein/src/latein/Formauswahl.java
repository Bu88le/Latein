package latein;

import javax.swing.JOptionPane;

import zeiten.*;
import w�rter.*;

public class Formauswahl {

	String gesuchtevokabel;
	
	static private boolean akon, ekon, ikon, konskon;
	static public boolean sons;
	
	


	public Formauswahl(String s) {
		/** der Konstruktor der Klasse Formauswahl
		 * erh�lt einen String s = gesuchtevokabel.
		 * Daraufhin startet er die erste Methode.
		 */
		gesuchtevokabel = s.toLowerCase();
		ausscheidung1();

	}

	void ausscheidung1() {
		/**Die Methode ruft die Methode passivgrob() auf.
		 * Ab hier wird eine Kettenaufreaktion gestartet.
		 */

		passivgrob();
	}

	void passivgrob() {

		/**Die erste if-Schleife pr�ft, ob die Vokabel Perfekt && Passiv ist
		 * Dies ist an Hand des zweiten Teils des Ausdrucks m�glich.
		 * Wenn 'true', dann perfektpassiv() 	 
		 */
		if (gesuchtevokabel.contains(" ")) {
			
			if (gesuchtevokabel.endsWith(" sum") || gesuchtevokabel.endsWith(" es") ||
					gesuchtevokabel.endsWith(" est") || gesuchtevokabel.endsWith(" sumus") ||
					gesuchtevokabel.endsWith(" estis") || gesuchtevokabel.endsWith(" sunt")) {

				perfektpassiv();

				/**Diese else-if-Schleife pr�ft, ob die 
				 * Vokabel Plusquamperfekt && Passiv ist
				 * Wenn 'true', dann plusquamperfektpassiv()
				 */
			}else if (gesuchtevokabel.endsWith(" eram") || gesuchtevokabel.endsWith(" eras") ||
					gesuchtevokabel.endsWith(" erat") || gesuchtevokabel.endsWith(" eramus") ||
					gesuchtevokabel.endsWith(" eratis") || gesuchtevokabel.endsWith(" erant")) {


				plusquamperfektpassiv();

				/**Diese else-if-Schleife pr�ft, ob die Vokabel
				 * Futur I= && Passiv ist.
				 * wenn 'true', dann futurIIpassiv() 	
				 */
			}else if (gesuchtevokabel.endsWith(" ero") || gesuchtevokabel.endsWith(" eris") || 
					gesuchtevokabel.endsWith(" erit") || gesuchtevokabel.endsWith(" erimus") ||
					gesuchtevokabel.endsWith(" eritis") || gesuchtevokabel.endsWith(" erunt")) {

				futurIIpassiv();

				/**Diese else-if-Schleife pr�ft, ob die
				 * Vokabel Perfekt && Passiv && Konjunktiv ist
				 * Wenn 'true', dann perfektpassivkonjunktiv()
				 */
			}else if(gesuchtevokabel.endsWith(" sim") || gesuchtevokabel.endsWith("s is") ||
					gesuchtevokabel.endsWith(" sit") || gesuchtevokabel.endsWith(" simus") ||
					gesuchtevokabel.endsWith(" sitis") || gesuchtevokabel.endsWith(" sint")) {

				perfektpassivkonjunktiv();


				/**Diese else-if-Schleife pr�ft, ob die Vokabel
				 * Plusquamperfekt && Passiv && Konjunktiv ist
				 * Wenn 'true', dann plusquamperfektpassivkonjunktiv()
				 */
			}else if(gesuchtevokabel.endsWith(" essem") || gesuchtevokabel.endsWith(" esses") ||
					gesuchtevokabel.endsWith("e sset") || gesuchtevokabel.endsWith(" essemus") ||
					gesuchtevokabel.endsWith(" essetis") || gesuchtevokabel.endsWith(" essent")) {

				plusquamperfektpassivkonjunktiv();

				/** Wenn keine Der if-Schleifen
				 * == true zur�ckliefert, dann passivfein()
				 */
			}else {

				passivfein();
			}
		}else {
			
			passivfein();
		}
	}




	void passivfein() {
		

		
		/** Die If-Schleife pr�ft auf Passiv-Endungen*/

		if (gesuchtevokabel.endsWith("or") || gesuchtevokabel.endsWith("ris") || gesuchtevokabel.endsWith("tur") ||
				gesuchtevokabel.endsWith("mur") || gesuchtevokabel.endsWith("mini") || gesuchtevokabel.endsWith("ntur") ||
				gesuchtevokabel.endsWith("er") || gesuchtevokabel.endsWith("ar")) {
			
			//-----------------------------------------------------------------------------------
			//-----------------------------------IMPERFEKT---------------------------------------
			//-----------------------------------------------------------------------------------


			
				//-------------------------------------------------------------
				//------------------------Konjunktiv---------------------------
				//-------------------------------------------------------------
			
					/** Die if-schleife pr�ft auf Passiv-Endungen und Konjunktiv */
			
					if(gesuchtevokabel.endsWith("rer") || gesuchtevokabel.endsWith("reris") ||
							gesuchtevokabel.endsWith("retur") || gesuchtevokabel.endsWith("remur") ||
							gesuchtevokabel.endsWith("remini") || gesuchtevokabel.endsWith("rentur")) {
		
						/**if schleife die pr�ft, ob die Vokabel zu
						 * konsonantischen oder i-Erweiterung geh�rt
						 */
						if (gesuchtevokabel.endsWith("erer") || gesuchtevokabel.endsWith("ereris") ||
								gesuchtevokabel.endsWith("eretur") || gesuchtevokabel.endsWith("eremur") ||
								gesuchtevokabel.endsWith("eremini") || gesuchtevokabel.endsWith("erentur")) {
		
							imperfektpassivkonjunktive();
		
						}else if (gesuchtevokabel.endsWith("arer") || gesuchtevokabel.endsWith("areris") ||
								gesuchtevokabel.endsWith("aretur") || gesuchtevokabel.endsWith("aremur") ||
								gesuchtevokabel.endsWith("aremini") || gesuchtevokabel.endsWith("arentur")) {
							
							imperfektpassivkonjunktiva();
							
						}else if (gesuchtevokabel.endsWith("irer") || gesuchtevokabel.endsWith("ireris") ||
								gesuchtevokabel.endsWith("iretur") || gesuchtevokabel.endsWith("iremur") ||
								gesuchtevokabel.endsWith("iremini") || gesuchtevokabel.endsWith("irentur")) {
							
							imperfektpassivkonjunktivi();
						}else {
							pr�senspassivkonjunktiva();
						}
						
					
						
				//------------------------------------------------------------
				//-----------------------INDIKATIV----------------------------
				//------------------------------------------------------------

					/** Else-if Schleife pr�ft auf Passiv-Ednung && Imperfekt && Indikativ */
							
					}else if (gesuchtevokabel.endsWith("bar") || gesuchtevokabel.endsWith("baris") ||
							gesuchtevokabel.endsWith("batur") || gesuchtevokabel.endsWith("bamur") ||
							gesuchtevokabel.endsWith("bamini") || gesuchtevokabel.endsWith("bantur")) {
			
						if (gesuchtevokabel.endsWith("abar") || gesuchtevokabel.endsWith("abaris") ||
								gesuchtevokabel.endsWith("abatur") || gesuchtevokabel.endsWith("abamur") ||
								gesuchtevokabel.endsWith("abamini") || gesuchtevokabel.endsWith("abantur")) {
							
							imperfektpassivindikativa();
							
						}else if(gesuchtevokabel.endsWith("iebar") || gesuchtevokabel.endsWith("iebaris") ||
								gesuchtevokabel.endsWith("iebatur") || gesuchtevokabel.endsWith("iebamur") ||
								gesuchtevokabel.endsWith("iebamini") || gesuchtevokabel.endsWith("iebantur")) {
							
							imperfektpassivindikativi();
							
						}else if (gesuchtevokabel.endsWith("ebar") || gesuchtevokabel.endsWith("ebaris") ||
								gesuchtevokabel.endsWith("ebatur") || gesuchtevokabel.endsWith("ebamur") ||
								gesuchtevokabel.endsWith("ebamini") ||  gesuchtevokabel.endsWith("ebantur")) {
							
							imperfektpassivindikative();
						}
			
			//------------------------------------------------------------------------------------
			//-----------------------------------FUTUR I------------------------------------------
			//------------------------------------------------------------------------------------
								
			/** Else-If Schleife pr�ft auf Passiv && Futur I && A-/E-Konjugation */
				
			}else if (gesuchtevokabel.endsWith("abor") || gesuchtevokabel.endsWith("aberis") ||
					gesuchtevokabel.endsWith("abitur") || gesuchtevokabel.endsWith("abimur") ||
					gesuchtevokabel.endsWith("abimini") || gesuchtevokabel.endsWith("abuntur")) {

			
				futurIpassiva();
				
			/** Pr�fe auf Futur I && PAssiv && Indikativ */
					
			}else if (gesuchtevokabel.endsWith("ebor") || gesuchtevokabel.endsWith("eberis") ||
					gesuchtevokabel.endsWith("ebitur") || gesuchtevokabel.endsWith("ebimur") ||
					gesuchtevokabel.endsWith("ebimini") || gesuchtevokabel.endsWith("ebuntur")) {
				
				futurIpassive();
				
				
			}else if (gesuchtevokabel.endsWith("ar") || gesuchtevokabel.endsWith("eris") ||
					gesuchtevokabel.endsWith("etur") || gesuchtevokabel.endsWith("emur") ||
					gesuchtevokabel.endsWith("emini") || gesuchtevokabel.endsWith("entur") ||
					gesuchtevokabel.endsWith("er")) {
				System.out.println("hey");

				/**Wenn vorangehende else-if-Schleife == true,
				 * dann �berpr�fen, ob Vokabel I-Konjugation || kons-/gemisch. kons Konjugation ist
				 * Wenn 'true', dann futurIpassivI()
				 * Wenn 'false', dann futurIpassivKonsGem()
				 */
				
				if (gesuchtevokabel.endsWith("iar") || gesuchtevokabel.endsWith("ieris") ||
						gesuchtevokabel.endsWith("ietur") || gesuchtevokabel.endsWith("iemur") ||
						gesuchtevokabel.endsWith("iemini") || gesuchtevokabel.endsWith("ientur")) {
						futurIpassivI();

				}else {

					futurIpassivKonsGem();
				}
				
				
			//-----------------------------------------------------------------------------------
			//----------------------------------Pr�sens------------------------------------------
			//-----------------------------------------------------------------------------------
				
				
				//-----------------------------------------------------------
				//------------------------KONJUNKTIV-------------------------
				//-----------------------------------------------------------
				
					/** Else-if Schleife pr�ft auf Konjunktiv && Passiv && Pr�sens*/
				
					}else if (gesuchtevokabel.endsWith("earis") || gesuchtevokabel.endsWith("eatur") ||
							gesuchtevokabel.endsWith("eamur") || gesuchtevokabel.endsWith("eamini") ||
							gesuchtevokabel.endsWith("eantur") || gesuchtevokabel.endsWith("ear")) {
		
							pr�senspassivkonjunktive();
						
					}else if (gesuchtevokabel.endsWith("iaris") || gesuchtevokabel.endsWith("iatur") ||
								gesuchtevokabel.endsWith("iamur") || gesuchtevokabel.endsWith("iamini") ||
								gesuchtevokabel.endsWith("iantur")) {
							pr�senspassivkonjunktivI();
							
					}else if(gesuchtevokabel.endsWith("er") || gesuchtevokabel.endsWith("eris") ||
							gesuchtevokabel.endsWith("etur") || gesuchtevokabel.endsWith("emur") ||
							gesuchtevokabel.endsWith("emini") || gesuchtevokabel.endsWith("entur")) {
						
							pr�senspassivkonjunktiva();
		
		
				//-----------------------------------------------------------
				//---------------------INDIKATIV-----------------------------
				//-----------------------------------------------------------

		
					/** Else-if Schleife sucht nach Passiv && Indikativ && Pr�sens */
							
					}else if (gesuchtevokabel.endsWith("or") || gesuchtevokabel.endsWith("ris") ||
							gesuchtevokabel.endsWith("tur") || gesuchtevokabel.endsWith("mur") ||
							gesuchtevokabel.endsWith("mini") || gesuchtevokabel.endsWith("ntur")) {	

						}if (gesuchtevokabel.endsWith("eor") || gesuchtevokabel.endsWith("eris") ||
								gesuchtevokabel.endsWith("etur") || gesuchtevokabel.endsWith("emur") ||
								gesuchtevokabel.endsWith("emini") || gesuchtevokabel.endsWith("entur")) {
							
							pr�senspassivindikative();
							
						}else if (gesuchtevokabel.endsWith("ior") || gesuchtevokabel.endsWith("iris") ||
								gesuchtevokabel.endsWith("itur") || gesuchtevokabel.endsWith("imur") ||
								gesuchtevokabel.endsWith("imini") || gesuchtevokabel.endsWith("iuntur")) {
							
							pr�senspassivindikativi();
							
						}else if (gesuchtevokabel.endsWith("aris") || gesuchtevokabel.endsWith("atur") ||
								gesuchtevokabel.endsWith("amur") || gesuchtevokabel.endsWith("amini") ||
								gesuchtevokabel.endsWith("antur") || gesuchtevokabel.endsWith("or")) {
							
							pr�senspassivindikativa();
							
						}else if (gesuchtevokabel.endsWith("untur")) {
							
							pr�senspassivindikativkons();
						}
						
						
						
		/** Wenn keine Passiv-Endung vorhanden ist -> Suche nach Aktivendungen*/
			
		}else {
			aktiv();
		}

	}

	// -------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------------------------------------------------------------------- 
	// -------------------------------------------------------------------------------------------------------------
	// ------------------------------------------------AKTIV--------------------------------------------------------
	// -------------------------------------------------------------------------------------------------------------
	//  ------------------------------------------------------------------------------------------------------------
	//  ------------------------------------------------------------------------------------------------------------
	void aktiv() {	

		
		//----------------------------------------------------------------------
		//------------------------PLUSQUAMPERFEKT-------------------------------
		//----------------------------------------------------------------------
		
		/** -----------------------------------------------
		 *  ------------------INDIKATIV--------------------
		 *  -----------------------------------------------
		 */

		/**Folgende If-Schleife pr�ft ob die Vokabel Aktiv && Plusquamperfekt ist. */
		
		if (gesuchtevokabel.endsWith("eram") || gesuchtevokabel.endsWith("eras") || gesuchtevokabel.endsWith("erat") ||
				gesuchtevokabel.endsWith("eramus") || gesuchtevokabel.endsWith("eratis") ||
				gesuchtevokabel.endsWith("erant")) {
			
			if (gesuchtevokabel.endsWith("averam") || gesuchtevokabel.endsWith("averas") ||
					gesuchtevokabel.endsWith("averat") || gesuchtevokabel.endsWith("averamus") ||
					gesuchtevokabel.endsWith("averatis") || gesuchtevokabel.endsWith("averant")) {
				
				plusquamperfektaktiva();
				
			}else if (gesuchtevokabel.endsWith("iveram") || gesuchtevokabel.endsWith("iveras") ||
					gesuchtevokabel.endsWith("iverat") || gesuchtevokabel.endsWith("iveramus") ||
					gesuchtevokabel.endsWith("iveratis") || gesuchtevokabel.endsWith("iverant")) {
			
				plusquamperfektaktivi();
				
			}else if (gesuchtevokabel.endsWith("ueram") || gesuchtevokabel.endsWith("ueras") ||
					gesuchtevokabel.endsWith("uerat") || gesuchtevokabel.endsWith("ueramus") ||
					gesuchtevokabel.endsWith("ueratis") || gesuchtevokabel.endsWith("uerant")) {
				
				plusquamperfektaktive();
				
			}else if (gesuchtevokabel.endsWith("seram")|| gesuchtevokabel.endsWith("seras") ||
					gesuchtevokabel.endsWith("serat") || gesuchtevokabel.endsWith("seramus") ||
					gesuchtevokabel.endsWith("seratis") || gesuchtevokabel.endsWith("serant")){
				
				plusquamperfektaktive();
				
			}else { 
				
				plusquamperfektaktivkons();
			}
			
		/** Folgende Else-if-Schleife pr�ft, ob die Vokabel Aktiv && Konjunktiv && Plusquamperfekt ist */
		
			/** --------------------------------------------
			 *  -----------------KONJUNKTIV-----------------
			 *  --------------------------------------------
			 */
			
		}else if (gesuchtevokabel.endsWith("issem") || gesuchtevokabel.endsWith("isses") || 
				gesuchtevokabel.endsWith("isset") || gesuchtevokabel.endsWith("issemus") ||
				gesuchtevokabel.endsWith("issetis") || gesuchtevokabel.endsWith("issent")) {
			
			if (gesuchtevokabel.endsWith("avissem") || gesuchtevokabel.endsWith("avisses") ||
					gesuchtevokabel.endsWith("avisset") || gesuchtevokabel.endsWith("avissemus") ||
					gesuchtevokabel.endsWith("avissetis") || gesuchtevokabel.endsWith("avissent")) {
				
				plusquamperfektkonjunktiva();
				
			}else if (gesuchtevokabel.endsWith("uissem") || gesuchtevokabel.endsWith("uisses") ||
					gesuchtevokabel.endsWith("uisset") || gesuchtevokabel.endsWith("uissemus") ||
					gesuchtevokabel.endsWith("uissetis") || gesuchtevokabel.endsWith("uissent")) {
				
				plusquamperfektkonjunktive();
				
			}else if(gesuchtevokabel.endsWith("ivissem") || gesuchtevokabel.endsWith("ivisses") ||
					gesuchtevokabel.endsWith("ivisset") || gesuchtevokabel.endsWith("ivissemus") ||
					gesuchtevokabel.endsWith("ivissetis") || gesuchtevokabel.endsWith("ivissent")) {
				
				plusquamperfektkonjunktivi();
			}else if (gesuchtevokabel.endsWith("sissem") || gesuchtevokabel.endsWith("sisses") ||
					gesuchtevokabel.endsWith("sisset") || gesuchtevokabel.endsWith("sissemus") ||
					gesuchtevokabel.endsWith("sissetis") || gesuchtevokabel.endsWith("sissent")){
				
				plusquamperfektkonjunktive();
			}else {
				
				plusquamperfektaktivkonjunktiv();
			}
			

		
		// ---------------------------------------------------
		// -------------------IMPERFEKT-----------------------
		// ---------------------------------------------------
				
				
			/** --------------------------------------------
			 *  -----------------INDIKATIV------------------
			 *  --------------------------------------------
			 */
		
		/** Else-If-Schleife pr�ft auf Imperfekt && Indikativ && Aktiv Endungen */
			
		}else if (gesuchtevokabel.endsWith("bam") || gesuchtevokabel.endsWith("bas") ||
				gesuchtevokabel.endsWith("bat") || gesuchtevokabel.endsWith("bamus") ||
				gesuchtevokabel.endsWith("batis") || gesuchtevokabel.endsWith("bant")) {
			
				if (gesuchtevokabel.endsWith("abam") || gesuchtevokabel.endsWith("abas") ||
						gesuchtevokabel.endsWith("abat") || gesuchtevokabel.endsWith("abamus") ||
						gesuchtevokabel.endsWith("abatis") || gesuchtevokabel.endsWith("abant")) {
					
					imperfekta();
					
				}else if (gesuchtevokabel.endsWith("iebam") || gesuchtevokabel.endsWith("iebas") ||
						gesuchtevokabel.endsWith("iebat") || gesuchtevokabel.endsWith("iebamus") ||
						gesuchtevokabel.endsWith("iebatis") || gesuchtevokabel.endsWith("iebant")) {
					
					imperfekti();
					
				}else if (gesuchtevokabel.endsWith("ebam") || gesuchtevokabel.endsWith("ebas") ||
						gesuchtevokabel.endsWith("ebat") || gesuchtevokabel.endsWith("ebamus") ||
						gesuchtevokabel.endsWith("ebatis") || gesuchtevokabel.endsWith("ebant")) {
					
					imperfektaktivindikative();
					
				}
		
			/** --------------------------------------------
			 *  ----------------KONJUNKTIV------------------
			 *  --------------------------------------------
			 */
				
		/** Else-IF-Schleife pr�ft auf Imperfekt && Konjunktiv && Aktiv */
				
		}else if (gesuchtevokabel.endsWith("rem") || gesuchtevokabel.endsWith("res") || 
				gesuchtevokabel.endsWith("ret") || gesuchtevokabel.endsWith("remus") ||
				gesuchtevokabel.endsWith("retis") || gesuchtevokabel.endsWith("rent")) {
			
			if (gesuchtevokabel.endsWith("arem") || gesuchtevokabel.endsWith("ares") ||
					gesuchtevokabel.endsWith("aret") || gesuchtevokabel.endsWith("aremus") ||
					gesuchtevokabel.endsWith("aretis") || gesuchtevokabel.endsWith("arent")) {
			
				imperfektkonjunktiva();
				
			}else if(gesuchtevokabel.endsWith("irem") || gesuchtevokabel.endsWith("ires") ||
					gesuchtevokabel.endsWith("iret") || gesuchtevokabel.endsWith("iremus") ||
					gesuchtevokabel.endsWith("iretis") || gesuchtevokabel.endsWith("irent")) {
				
				imperfektkonjunktivi();
				
			}else {
				
				imperfektkonjunktiv();
				
			}
			
		// ---------------------------------------------------
		// ---------------------FUTUR-I-----------------------
		// ---------------------------------------------------
			
			/** -----------------------------------------------
			 *  -----------------INDIKATIV---------------------
			 *  -----------------------------------------------
			 */
		
		/** Else-If Schleife pr�ft auf Futur I && Indikativ && Aktiv */
			
		}else if (gesuchtevokabel.endsWith("bo") || gesuchtevokabel.endsWith("bis") ||
				gesuchtevokabel.endsWith("bit") || gesuchtevokabel.endsWith("bimus") ||
				gesuchtevokabel.endsWith("bitis") || gesuchtevokabel.endsWith("bunt")) {
			
			if (gesuchtevokabel.endsWith("abo") || gesuchtevokabel.endsWith("abis") ||
					gesuchtevokabel.endsWith("abit") || gesuchtevokabel.endsWith("abimus") ||
					gesuchtevokabel.endsWith("abitis") || gesuchtevokabel.endsWith("abunt")) {
				
				futurIa();
				
			}else if (gesuchtevokabel.endsWith("ebo") || gesuchtevokabel.endsWith("ebis") ||
					gesuchtevokabel.endsWith("ebit") || gesuchtevokabel.endsWith("ebimus") ||
					gesuchtevokabel.endsWith("ebitis") || gesuchtevokabel.endsWith("ebunt")) {
				
				futurIe();
				
			}else if (gesuchtevokabel.endsWith("ibo") || gesuchtevokabel.endsWith("ibis") ||
					gesuchtevokabel.endsWith("ibit") || gesuchtevokabel.endsWith("ibimus") ||
					gesuchtevokabel.endsWith("ibitis") || gesuchtevokabel.endsWith("ibunt")) {
				
				futurIi();
				
			}
		
		} else if (gesuchtevokabel.endsWith("am") || gesuchtevokabel.endsWith("es") ||
				gesuchtevokabel.endsWith("et") || gesuchtevokabel.endsWith("emus") ||
				gesuchtevokabel.endsWith("etis") || gesuchtevokabel.endsWith("ent")) {
			
			futurIkons();
			
			// ------------------------------------------------------
			// --------------------PERFEKT---------------------------
			// ------------------------------------------------------
				
				/** ----------------------------------------------
				 *  -----------------KONJUNKTIV-------------------
				 *  ----------------------------------------------
				 */
			
			/** Else-If Schleife pr�ft auf Perfekt && Konjunktiv && Aktiv */
			
			}else if (gesuchtevokabel.endsWith("ero") || gesuchtevokabel.endsWith("erim") ||
					gesuchtevokabel.endsWith("eris") || gesuchtevokabel.endsWith("erit") ||
					gesuchtevokabel.endsWith("erimus") || gesuchtevokabel.endsWith("eritis") ||
					gesuchtevokabel.endsWith("erint")) {
				
				/** Folgende If-Schleife pr�ft, ob die Vokabel zu A-Konjugation geh�rt */
				
				if (gesuchtevokabel.endsWith("avero") || gesuchtevokabel.endsWith("averim") ||
						gesuchtevokabel.endsWith("averis") || gesuchtevokabel.endsWith("averit") ||
						gesuchtevokabel.endsWith("averimus") || gesuchtevokabel.endsWith("averitis") ||
						gesuchtevokabel.endsWith("averint")) {
					
					perfektaktivkonjunktiva();
				
				/** Folgende Else-If-Schleife pr�ft, ob die Vokabel zur E-Konjugation geh�rt */
					
				}else if (gesuchtevokabel.endsWith("uerim") || gesuchtevokabel.endsWith("uero") ||
						gesuchtevokabel.endsWith("ueris") || gesuchtevokabel.endsWith("uerit") ||
						gesuchtevokabel.endsWith("uerimus") || gesuchtevokabel.endsWith("ueritis") ||
						gesuchtevokabel.endsWith("uerint")) {
					
					perfektaktivkonjunktive();
				
				/** Folgende Else-If-Schleife pr�ft, ob die Vokabel zur I-Konjugation geh�rt */
					
				}else if (gesuchtevokabel.endsWith("ivero") || gesuchtevokabel.endsWith("iverim") ||
						gesuchtevokabel.endsWith("iveris") || gesuchtevokabel.endsWith("iverit") ||
						gesuchtevokabel.endsWith("iverimus") || gesuchtevokabel.endsWith("iveritis") ||
						gesuchtevokabel.endsWith("iverint")) {
					
					perfektaktivkonjunktivi();
					
				}else if (gesuchtevokabel.endsWith("sero") || gesuchtevokabel.endsWith("seris") ||
						gesuchtevokabel.endsWith("serit") || gesuchtevokabel.endsWith("serimus") ||
						gesuchtevokabel.endsWith("seritis") || gesuchtevokabel.endsWith("serint") ||
						gesuchtevokabel.endsWith("serim")){
					perfektaktivkonjunktive();
					
				}else {
					
					perfektaktivkonjunktivkons();
				}

			
				/** ---------------------------------------------- 
				 *  -----------------INDIKATIV--------------------
				 *  ----------------------------------------------
				 */
				
			/** Folgende Else-IF-Schleife pr�ft, ob die Vokabel Aktiv && Indikativ && Perfekt ist */

			}else if ( gesuchtevokabel.endsWith("i") || gesuchtevokabel.endsWith("isti") ||
					gesuchtevokabel.endsWith("it") || gesuchtevokabel.endsWith("imus") ||
					gesuchtevokabel.endsWith("itis") || gesuchtevokabel.endsWith("erunt")) {
				
					/** Folgende If-Schleife pr�ft, ob die Vokabel zur A-Konjugation geh�rt */
				
					if (gesuchtevokabel.endsWith("avi") || gesuchtevokabel.endsWith("avisti") ||
							gesuchtevokabel.endsWith("avit") || gesuchtevokabel.endsWith("avimus") ||
							gesuchtevokabel.endsWith("avitis") || gesuchtevokabel.endsWith("averunt")) {
						
						perfektaktiva();
					
					/** Folgende Else-If-Schleife pr�ft, ob die Vokabel zu E-Konjugation geh�rt */
						
					}else if (gesuchtevokabel.endsWith("ui") || gesuchtevokabel.endsWith("uisti") ||
							gesuchtevokabel.endsWith("uit") || gesuchtevokabel.endsWith("uimus") ||
							gesuchtevokabel.endsWith("uistis") || gesuchtevokabel.endsWith("uerunt")) {
						
						perfektaktive();
					
					/** Folgende Else-If-Schleife pr�ft, ob die Vokabel zur I-Konjagtion geh�rt */
						
					}else if (gesuchtevokabel.endsWith("ivi") || gesuchtevokabel.endsWith("ivisti") ||
							gesuchtevokabel.endsWith("ivit") || gesuchtevokabel.endsWith("ivimus") ||
							gesuchtevokabel.endsWith("ivitis") || gesuchtevokabel.endsWith("iverunt")) {
						
						perfektaktivi();
						
					}else if (gesuchtevokabel.endsWith("si") || gesuchtevokabel.endsWith("sisti") ||
							gesuchtevokabel.endsWith("sit") || gesuchtevokabel.endsWith("simus") ||
							gesuchtevokabel.endsWith("sitis") || gesuchtevokabel.endsWith("serunt")) {
						perfektaktive();
						
					}else {
						
						perfektaktivkons();
					}
			
			 
			
		// -------------------------------------------
		// ---------------PR�SENS---------------------
		// -------------------------------------------
		
			/** --------------------------------------------
			 *  -----------------KONJUNKTIV-----------------
			 *  --------------------------------------------
			 */
		
		/** Else-If Schleife pr�ft auf Pr�sens && Konjunktiv && Aktiv */
					
		}else if (gesuchtevokabel.endsWith("em") || gesuchtevokabel.endsWith("es") ||
				gesuchtevokabel.endsWith("et") || gesuchtevokabel.endsWith("emus") ||
				gesuchtevokabel.endsWith("etis") || gesuchtevokabel.endsWith("ament")) {
			
			pr�senskonjunktiva();
			
		}else if (gesuchtevokabel.endsWith("am") || gesuchtevokabel.endsWith("as") ||
				gesuchtevokabel.endsWith("at") || gesuchtevokabel.endsWith("amus") ||
				gesuchtevokabel.endsWith("atis") || gesuchtevokabel.endsWith("ant")) {
			
			if (gesuchtevokabel.endsWith("iam") || gesuchtevokabel.endsWith("ias") ||
					gesuchtevokabel.endsWith("iat") || gesuchtevokabel.endsWith("iamus") ||
					gesuchtevokabel.endsWith("iatis") || gesuchtevokabel.endsWith("iant")) {
				
				pr�senskonjunktivi();
				
			}else if(gesuchtevokabel.endsWith("eam") || gesuchtevokabel.endsWith("eas") ||
					gesuchtevokabel.endsWith("eat") || gesuchtevokabel.endsWith("eamus") ||
					gesuchtevokabel.endsWith("eatis") || gesuchtevokabel.endsWith("eant")) {
				
				pr�senskonjunktive();
				
			}else {
				pr�senskonjunktivkons();
			}
				
		
			/** -----------------------------------------------
			 *  ------------------INDIKATIV--------------------
			 *  -----------------------------------------------
			 */
		
		/** Else-If Schleife pr�ft auf Pr�sens && Indikativ && Aktiv */
				
		}else if (gesuchtevokabel.endsWith("eo") || gesuchtevokabel.endsWith("es") || 
				gesuchtevokabel.endsWith("et") || gesuchtevokabel.endsWith("emus") ||
				gesuchtevokabel.endsWith("etis") || gesuchtevokabel.endsWith("ent")) {
	
			pr�sensaktive();
	
		}else if (gesuchtevokabel.endsWith("io") || gesuchtevokabel.endsWith("is") ||
				gesuchtevokabel.endsWith("it") || gesuchtevokabel.endsWith("imus") ||
				gesuchtevokabel.endsWith("itis") || gesuchtevokabel.endsWith("iunt")) {
	
			pr�sensaktivi();
	
		}else if (gesuchtevokabel.endsWith("o") || gesuchtevokabel.endsWith("as") ||
				gesuchtevokabel.endsWith("at") || gesuchtevokabel.endsWith("amus") ||
				gesuchtevokabel.endsWith("atis") || gesuchtevokabel.endsWith("ant")) {
	
			pr�sensaktiva();
		}else if (gesuchtevokabel.endsWith("unt")) {
	
			pr�sensaktivkons();
		}else {
			Main.mf.panelFehler();
		}
	}





	/**-----------------------------------------------------------------------------------------------------------------
	 * ----------------------------------------------------------------------------------------------------------------- */
	//------------------------------------------------------------------------------------------------------------------
	//-----------------------------------------------------Klassenaufruf------------------------------------------------
	//------------------------------------------------------------------------------------------------------------------
	/**-----------------------------------------------------------------------------------------------------------------
	 * ----------------------------------------------------------------------------------------------------------------- */
	
	
	/** -----------------------------------------------------------------------------------------------------------------
	 *  --------------------------------------------------PR�SENS--------------------------------------------------------
	 *  -----------------------------------------------------------------------------------------------------------------
	 */
	
		//---------------------------------------------------------
		//-----------------------AKTIV-----------------------------
		//---------------------------------------------------------
	
			/**----------------------------------------------
			*-----------------INDIKATIV----------------------
			------------------------------------------------*/
	
				void pr�sensaktiva() {
					akon = true; //Wei�t der gesuchten Vokabel einen Boolean-Wert zu, der die Konjugation beschreibt. 
					System.out.println("Pr�sens Aktiv A"); //Gibt in der Konsole einen Text aus, der die gefundene Zeit angibt.
					new pr�sens(gesuchtevokabel); //Ruft latein.zeiten.pr�sens auf und �bergibt die gesuchte Vokabel.
					pr�sens.pr�sensaktivindikativa(); //Ruft die Methode "pr�sensaktivindikativa" in pr�sens auf.
				}				
				void pr�sensaktive() {
					ekon = true;
					System.out.println("Pr�sens Aktiv e");
					
					new pr�sens(gesuchtevokabel);
					pr�sens.pr�sensaktivindikative();
					
				}	
				void pr�sensaktivi() {
					ikon = true;
					System.out.println("Pr�sens Aktiv I");
				}				
				void pr�sensaktivkons() {
					konskon = true;
					System.out.println("Pr�sens Kons");
				}
	
			/**---------------------------------------------
			*------------------KONJUNKTIV-------------------
			*----------------------------------------------*/
				
				void pr�senskonjunktiva() {
					akon = true;
					System.out.println("Pr�sens Konjunktiv a");
					new pr�sens(gesuchtevokabel);
					pr�sens.pr�sensaktivkonjunktiva();
					
				}
				void pr�senskonjunktive() {
					ekon = true;
					System.out.println("Pr�sens Konjunktiv e");
					
					new pr�sens(gesuchtevokabel);
					pr�sens.pr�sensaktivkonunktive();
					
				}	
				void pr�senskonjunktivi() {
					ikon = true;
					System.out.println("Pr�sens Konjunktiv I");
				}	
				void pr�senskonjunktivkons() {
					konskon = true;
					System.out.println("Pr�sens Konjunktiv kons");
				}
	
		
		//-----------------------------------------------------------------------------
		//-----------------------------PASSIV------------------------------------------
		//-----------------------------------------------------------------------------
				
			/**-----------------------------------------------
			*-----------------INDIKATIV-----------------------
			*-------------------------------------------------*/

	
				void pr�senspassivindikativa() {
					akon = true;
					System.out.println("Pr�sens Passiv");
					new pr�sens(gesuchtevokabel);
					pr�sens.pr�senspassivindikativa();
				}
				
				void pr�senspassivindikative() {
					ekon = true;
					System.out.println("Pr�sens Passiv Indikativ e");
					
					new pr�sens(gesuchtevokabel);
					pr�sens.pr�senspassivindikative();
					
				}
				
				void pr�senspassivindikativi() {
					ikon = true;
					System.out.println("Pr�sens Passiv Indikativ i");
				}
				
				void pr�senspassivindikativkons() {
					konskon = true;
					System.out.println("Pr�sens PAssiv Indikativ Kons");
				}
				
			/**-----------------------------------------------
			*-------------------KONJUNKTIV--------------------
			*-------------------------------------------------*/

				void pr�senspassivkonjunktive() {
					ekon = true;
					System.out.println("Pr�sens Passiv Konjunktiv");
					
					new pr�sens(gesuchtevokabel);
					pr�sens.pr�senspassivkonjunktive();
					
				}
			
				void pr�senspassivkonjunktivI() {
					ikon = true;
					System.out.println("Pr�sens Passiv KonjunktivI");
				}
				
				void pr�senspassivkonjunktiva() {
					akon = true;
					System.out.println("Pr�sens Passiv Konjunktiv a");
					new pr�sens(gesuchtevokabel);
					pr�sens.pr�senspassivkonjunktiva();
					
				}
				
				
				
				
	/**------------------------------------------------------------------------------------------------------------------
	 * --------------------------------------------------IMPERFEKT-------------------------------------------------------
	 * ------------------------------------------------------------------------------------------------------------------
	 */
				
		//---------------------------------------------------------------
		//------------------------AKTIV----------------------------------
		//---------------------------------------------------------------
				
			/**-------------------------------------------------
			*---------------------INDIKATIV--------------------
			*-------------------------------------------------*/
		
					void imperfektaktivindikative() {
						ekon = true;
						System.out.println("imperfekt Aktiv Indikativ e");
						
						new imperfekt(gesuchtevokabel);
						imperfekt.imperfektindikativaktive();
					}					
					void imperfekta() {
						akon = true;
						System.out.println("Imperfekt A");
						new imperfekt(gesuchtevokabel);
						imperfekt.imperfektaktivindikativa();
						
					}					
					void imperfekti() {
						ikon = true;
						System.out.println("Imperfekt I");
					}					
			/**----------------------------------------------
			 * ------------------KONJUNKTIV------------------
			 * ---------------------------------------------- */
		
					void imperfektkonjunktiva() {
						akon = true;
						System.out.println("Imperfekt Konjunktiv A");
						new imperfekt(gesuchtevokabel);
						imperfekt.imperfektaktivkonjunktiva();
						
					}	
					void imperfektkonjunktivi() {
						ikon = true;
						System.out.println("Imperfekt Konjunktiv I");
					}		
					void imperfektkonjunktiv() {
						ekon = true;
						System.out.println("Imperfekt Konjunktiv e");
						
						new imperfekt(gesuchtevokabel);
						imperfekt.imperfektkonjunktivaktive();
						
					}
		
					
		//-------------------------------------------------------------
		//-------------------------PASSIV------------------------------
		//-------------------------------------------------------------
			
			/**--------------------------------------
			 * --------------INDIKATIV---------------
			 * --------------------------------------*/
					
					void imperfektpassivindikativa() {
						akon = true;
						System.out.println("Imperfekt Passiv indikativ a");
						new imperfekt(gesuchtevokabel);
						imperfekt.imperfektpassivindikativa();
						
					}					
					void imperfektpassivindikativi() {
						ikon = true;
						System.out.println("Imperfekt Passiv Indikativ i");
					}					
					void imperfektpassivindikative() {
						ekon = true;
						System.out.println("Imperfekt Passiv Indikativ e");
						
						new imperfekt(gesuchtevokabel);
						imperfekt.imperfektpassivindikative();
						
					}
					
					
			/**--------------------------------------
			 * -------------KONJUNKTIV---------------
			 * -------------------------------------- */
	
				void imperfektpassivkonjunktive() {
					ekon = true;
					System.out.println("imperfektpassivkonjunktiv e");
					
					new imperfekt(gesuchtevokabel);
					imperfekt.imperfektpassivkonjunktive();
					
				}
				void imperfektpassivkonjunktiva() {
					akon = true;
					System.out.println("Imperfekt Passiv Konjunktiv a");
					new imperfekt(gesuchtevokabel);
					imperfekt.imperfektpassivkonjunktiva();
					
				}
				void imperfektpassivkonjunktivi() {
					ikon = true;
					System.out.println("Imperfekt Passiv Konjunktiv i");
				}
				
				
				
	/**-------------------------------------------------------------------------------------------------------------------
	 * ---------------------------------------------------PERFEKT---------------------------------------------------------
	 * -------------------------------------------------------------------------------------------------------------------
	 */
	
		/*--------------------------------------------
		 * --------------AKTIV/INDIKATIV--------------
		 * -------------------------------------------
		 */
		void perfektaktiva() {
			akon = true;
			System.out.println("Perfekt Aktiv A");
			perfekt p = new perfekt(gesuchtevokabel);
			p.perfektaktivindikativa();
			
		}
	
		void perfektaktive() {
			ekon = true;
			System.out.println("Perfekt Aktiv E");
			
			new perfekt(gesuchtevokabel);
			perfekt.perfektaktivindikative();
			
		}
	
		void perfektaktivi() {
			ikon = true;
			System.out.println("Perfekt Atkiv I");
		}
	
		void perfektaktivkons() {
			konskon = true;
			System.out.println("Perfekt Aktiv Kons");
		}
		
		/*-------------------------------------------
		 * -----------AKTIV/KONJUNKTIV---------------
		 * ------------------------------------------
		 */
	
		void perfektaktivkonjunktiva() {
			akon = true;
			System.out.println("Perfekt Aktiv Konjunktiv A");
			
			perfekt p = new perfekt(gesuchtevokabel);
			p.perfektakitvkonjunktiva();
		}
	
		void perfektaktivkonjunktive() {
			ekon = true;
			System.out.println("Perfekt Aktiv Konjunktiv E");
			
			new perfekt(gesuchtevokabel);
			perfekt.perfektaktivkonjunktive();
		}
	
		void perfektaktivkonjunktivi() {
			ikon = true;
			System.out.println("Perfekt Aktiv Konjunktiv I");
		}
	
		void perfektaktivkonjunktivkons() {
			konskon = true;
			System.out.println("Perfekt Aktiv Konjunktiv Kons");
		}
	
		/*-----------------------------------------
		 * ----------PASSIV/INDIKATIV--------------
		 * ----------------------------------------
		 */
		void perfektpassiv() {
			System.out.println("Perfekt Passiv");
			new perfekt(gesuchtevokabel);
			perfekt.perfektpassivindikativa();
		}
		
		/*----------------------------------------
		 * ----------PASSIV/KONJUNKTIV------------
		 * ---------------------------------------
		 */
	
		void perfektpassivkonjunktiv() {
			sons = true;
			System.out.println("Perfekt Passiv Konjunktiv");
			new perfekt(gesuchtevokabel);
			perfekt.perfektpassivkonjunktiva();
		}
	
	
	/**-------------------------------------------------------------------------------------------------------------------
	 * -----------------------------------------------PLUSQUAMPERFEKT-----------------------------------------------------
	 * -------------------------------------------------------------------------------------------------------------------
	 */
		
		//-----------------------------------------------------------------
		//-------------------------AKTIV-----------------------------------
		//-----------------------------------------------------------------
		
			/**----------------------------------------------------
			 * -------------------INDIKATIV------------------------ 
			 * ----------------------------------------------------*/

				void plusquamperfektaktivkons() {
					konskon = true;
					System.out.println("Plusquamperfekt Aktiv Kons");
					new plusquamperfekt(gesuchtevokabel);
					plusquamperfekt.plusquamperfektindikativkons();		
				}	
				void plusquamperfektaktiva() {
					akon = true;
					
					System.out.println("Plusquamperfekt Aktiv A");
					plusquamperfekt p = new plusquamperfekt (gesuchtevokabel);
					p.plusquamperfektindikativaktiva();
						
				}	
				void plusquamperfektaktivi() {
					ikon = true;
					
					System.out.println("Plusquamperfekt Aktiv I");
					plusquamperfekt p = new plusquamperfekt(gesuchtevokabel);
					p.plusquamperfektindikativaktivi();
				}	
				void plusquamperfektaktive() {
					ekon = true;					
					System.out.println("Plusquamperfekt Aktiv e");
					plusquamperfekt p = new plusquamperfekt(gesuchtevokabel);
					plusquamperfekt.plusquamperfektindikativaktive();
					
				}
				
			/**--------------------------------------------
			 * -----------------KONJUNKTIV----------------
			 * --------------------------------------------*/
	
				void plusquamperfektaktivkonjunktiv() {
					konskon = true;
					
					System.out.println("Plusquamperfekt aktiv Konjunktiv");
				}
				void plusquamperfektkonjunktiva() {
					akon = true;
					
					System.out.println("Plusquamperfekt Konjunktiv A");
					plusquamperfekt p = new plusquamperfekt(gesuchtevokabel);
					p.plusquamperfektkonjunktiva();

				}
				void plusquamperfektkonjunktive() {
					ekon = true;
					System.out.println("Plusquamperfekt Konjunktiv E");
					
					plusquamperfekt p = new plusquamperfekt(gesuchtevokabel);
					plusquamperfekt.plusquamperfektkonjunktive();
					
				}
				void plusquamperfektkonjunktivi() {
					ikon = true;
					System.out.println("Plusquamperfekt Konjunktiv i");
				}
				
		//----------------------------------------------------------
		//----------------------PASSIV------------------------------
		//----------------------------------------------------------
				
			/**----------------------------------------
			 * -------------INDIKATIV------------------
			 * ---------------------------------------- */
				void plusquamperfektpassiv() {
					sons = true;					
					System.out.println("Plusquamperfekt Passiv");
					
					new plusquamperfekt(gesuchtevokabel);
					plusquamperfekt.plusquamperfektpassivindikativa();
				}

			/**----------------------------------------
			 * --------------KONJUGATION---------------
			 * ----------------------------------------*/				
				void plusquamperfektpassivkonjunktiv() {
					sons = true;
					System.out.println("Plusquamperfekt Passiv Konjunktiv");
					new plusquamperfekt(gesuchtevokabel);
					plusquamperfekt.plusquamperfektpassivkonjunktiva();
				}
				
	
	 /**---------------------------------------------------------------------------------------------------------------------
	  * ----------------------------------------------FUTUR I----------------------------------------------------------------
	  * ---------------------------------------------------------------------------------------------------------------------
	  */
		
		//--------------------------------------------------------
		//---------------------AKTIV------------------------------
		//--------------------------------------------------------
					
				void futurIa() {
					akon = true;
					System.out.println("Futur I a");
					new futurI(gesuchtevokabel);
					futurI.futurIaktiva();
					
				}				
				void futurIe() {
					ekon = true;
					System.out.println("Futur I e");
					
					new futurI(gesuchtevokabel);
					futurI.futurIaktive();
					
				}
				void futurIi() {
					ikon = true;
					System.out.println("Futur I i");
				}				
				void futurIkons() {
					konskon = true;
					System.out.println("Futur I kons");
				}
	
		//------------------------------------------------------
		//---------------------PASSIV---------------------------
		//------------------------------------------------------
					
				void futurIpassiva() {
					akon = true; 
					System.out.println("Futur I Passiv"); 
					new futurI(gesuchtevokabel);
					futurI.futurIpassiva();
					
				}		
				void futurIpassive() {
					ekon = true;
					System.out.println("Futur I Passiv E");
					
					new futurI(gesuchtevokabel);
					futurI.futurIpassive();
				
				}
				void futurIpassivI() {
					ikon = true;
					System.out.println("Futur I Passiv");
				}
				void futurIpassivKonsGem() {
					konskon = true;
					System.out.println("Futur I Passiv Kons Gem");
				}

	/**-------------------------------------------------------------------------------------------------------------------
	 * --------------------------------------------FUTUR II---------------------------------------------------------------
	 * -------------------------------------------------------------------------------------------------------------------		
	 */

		//-----------------------------------------------------
		//-------------------PASSIV----------------------------
		//-----------------------------------------------------
				
				void futurIIpassiv() {
					sons = true;
					System.out.println("Futur II passiv");
					new futurII(gesuchtevokabel);
					futurII.futurIIpassiv();					
				}

}