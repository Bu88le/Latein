package logic;

public class Formauswahl {

	String gv, gvs;


	public Formauswahl(String gv) {
		this.gv = gv;
		aussortierungPassivGrob();
	}


	// \/\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/PASSIV-GROB/\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	private void aussortierungPassivGrob() {

		// If-Schleifen überprüfuen die gesuchte Vokabel auf typische
		// Passivendungen in der Vergangenheit auf das charakteristische
		// " " +Endung

		if (gv.contains(" ")) {

			if (gv.endsWith(" sum") || gv.endsWith(" es") || gv.endsWith(" est") || gv.endsWith(" sumus")
					|| gv.endsWith(" estis") || gv.endsWith(" sunt")) {

				tempusPerfektPassivIndikativ();

			} else if (gv.endsWith(" eram") || gv.endsWith(" eras") || gv.endsWith(" erat") || gv.endsWith(" eramus")
					|| gv.endsWith(" eratis") || gv.endsWith(" erant")) {

				tempusPlusquamperfektPassivIndikativ();

			} else if (gv.endsWith(" ero") || gv.endsWith(" eris") || gv.endsWith(" erit") || gv.endsWith(" erimus")
					|| gv.endsWith(" eritis") || gv.endsWith(" erunt")) {

				tempusFuturIIPassivIndikativ();

			} else if (gv.endsWith(" sim") || gv.endsWith("s is") || gv.endsWith(" sit") || gv.endsWith(" simus")
					|| gv.endsWith(" sitis") || gv.endsWith(" sint")) {

				tempusPerfektPassivKonjunktiv();

			} else if (gv.endsWith(" essem") || gv.endsWith(" esses") || gv.endsWith(" esset")
					|| gv.endsWith(" essemus") || gv.endsWith(" essetis") || gv.endsWith(" essent")) {

				tempusPlusquamperfektPassivKonjunktiv();

			} else {

				aussortierungPassivFein();
			}
		} else {

			aussortierungPassivFein();
		}
	}


	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/PASSIV-FEIN/\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/
	// /\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\//\/\/

	private void aussortierungPassivFein() {

		// Prüft die gesuchte Vokabel auf Passiv-Endungen
		if (gv.endsWith("or") || gv.endsWith("ris") || gv.endsWith("tur") || gv.endsWith("mur") || gv.endsWith("mini")
				|| gv.endsWith("ntur") || gv.endsWith("er") || gv.endsWith("ar")) {

			//@formatter:off
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--IMPERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--

				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				// ::--::--::--::--::--::--Konjunktiv::--::--::--::--::--::--
				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				/* Überprüft auf Endungen für:
				 *  1) Tempus: Imperfekt
				 *  2) Modus: Konjunktiv
				 *  3) Genus verbi: Passiv
				 */ 
			
				if (gv.endsWith("rer") || gv.endsWith("reris") || gv.endsWith("retur") || gv.endsWith("remur")
						|| gv.endsWith("remini") || gv.endsWith("rentur")) {
	
					
					if (gv.endsWith("erer") || gv.endsWith("ereris")
							|| gv.endsWith("eretur") || gv.endsWith("eremur")
							|| gv.endsWith("eremini") || gv.endsWith("erentur")) {
	
						tempusImperfektPassivKonjunktivEKonjugation();
	
					} else if (gv.endsWith("arer") || gv.endsWith("areris")
							|| gv.endsWith("aretur") || gv.endsWith("aremur")
							|| gv.endsWith("aremini") || gv.endsWith("arentur")) {
	
						tempusImperfektPassivKonjunktivAKonjugation();
	
					} else if (gv.endsWith("irer") || gv.endsWith("ireris")
							|| gv.endsWith("iretur") || gv.endsWith("iremur")
							|| gv.endsWith("iremini") || gv.endsWith("irentur")) {
	
						tempusImperfektPassivKonjunktivIKonjugation();
					} else {
						tempusPräsensPassivKonjunktivAKonjugation();
					}
					
					
				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
				// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
				/* Überprüft auf Endungen für:
				 *   1) Tempus: Imperfekt
				 *   2) Modus: Indikativ
				 *   3) Genus verbi: Passiv
				 */

				} else if (gv.endsWith("bar") || gv.endsWith("baris")
						|| gv.endsWith("batur") || gv.endsWith("bamur")
						|| gv.endsWith("bamini") || gv.endsWith("bantur")) {
	
					if (gv.endsWith("abar") || gv.endsWith("abaris")
							|| gv.endsWith("abatur") || gv.endsWith("abamur")
							|| gv.endsWith("abamini") || gv.endsWith("abantur")) {
						
						tempusImperfektPassivIndikativAKonjugation();
	
					} else if (gv.endsWith("iebar") || gv.endsWith("iebaris")
							|| gv.endsWith("iebatur") || gv.endsWith("iebamur")
							|| gv.endsWith("iebamini") || gv.endsWith("iebantur")) {
						
						tempusImperfektPassivIndikativIKonjugation();
	
					} else if (gv.endsWith("ebar") || gv.endsWith("ebaris")
							|| gv.endsWith("ebatur") || gv.endsWith("ebamur")
							|| gv.endsWith("ebamini") || gv.endsWith("ebantur")) {
						
						tempusImperfektPassivIndikativEKonjugation();
					}

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--Futur I::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--

					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
					/* Überprüft auf Endungen für:
					 *  1) Tempus: Futur I
					 *  2) Modus: Indikativ
					 * 	3) Genus verbi: Passiv
					 */

					} else if (gv.endsWith("abor") || gv.endsWith("aberis")
							|| gv.endsWith("abitur") || gv.endsWith("abimur")
							|| gv.endsWith("abimini") || gv.endsWith("abuntur")) {
						
						tempusFuturIPassivIndikativAKonjugation();
		
					} else if (gv.endsWith("ebor") || gv.endsWith("eberis")
							|| gv.endsWith("ebitur") || gv.endsWith("ebimur")
							|| gv.endsWith("ebimini") || gv.endsWith("ebuntur")) {
						
						tempusFuturIPassivIndikativEKonjugation();
		
					} else if(gv.endsWith("iar") || gv.endsWith("ieris")
							|| gv.endsWith("ietur") || gv.endsWith("iemur")
							|| gv.endsWith("iemini") || gv.endsWith("ientur")) {
						
						tempusFuturIPassivIndikativIKonjugation();
						
					}else if (gv.endsWith("ar") || gv.endsWith("eris")
							|| gv.endsWith("etur") || gv.endsWith("emur")
							|| gv.endsWith("emini") || gv.endsWith("entur")
							|| gv.endsWith("er")) {
		
							tempusFuturIPassivIndikativKonsKOnjugation();
						

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PRÄSENS::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
					/* Überprüft auf Endungen für:
					 *  1) Tempus: Präsens
					 *  2) Modus: Konjunktiv
					 * 	3) Genus verbi: Passiv
					 */

					} else if (gv.endsWith("earis") || gv.endsWith("eatur")
							|| gv.endsWith("eamur") || gv.endsWith("eamini")
							|| gv.endsWith("eantur") || gv.endsWith("ear")) {
						
						tempusPräsensPassivKonjunktivEKonjugation();
		
					} else if (gv.endsWith("iaris") || gv.endsWith("iatur")
							|| gv.endsWith("iamur") || gv.endsWith("iamini")
							|| gv.endsWith("iantur")) {
						
						tempusPräsensPassivKonjunktivIKonjugation();
		
					} else if (gv.endsWith("er") || gv.endsWith("eris")
							|| gv.endsWith("etur") || gv.endsWith("emur")
							|| gv.endsWith("emini") || gv.endsWith("entur")) {
						
						tempusPräsensPassivKonjunktivAKonjugation();
						
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					
					/* Überprüft auf Endungen für:
					 *  1) Tempus: Präsens
					 *  2) Modus: Konjunktiv
					 * 	3) Genus verbi: Passiv
					 */

					} else if (gv.endsWith("or") || gv.endsWith("ris")
							|| gv.endsWith("tur") || gv.endsWith("mur")
							|| gv.endsWith("mini") || gv.endsWith("ntur")) {
		
						if (gv.endsWith("eor") || gv.endsWith("eris") || gv.endsWith("etur")
								|| gv.endsWith("emur") || gv.endsWith("emini")
								|| gv.endsWith("entur")) {
							
							tempusPräsensPassivIndikativEKonjugation();
			
						} else if (gv.endsWith("ior") || gv.endsWith("iris")
								|| gv.endsWith("itur") || gv.endsWith("imur")
								|| gv.endsWith("imini") || gv.endsWith("iuntur")) {
							
							tempusPräsensPassivIndikativIKonjugation();
			
						} else if (gv.endsWith("aris") || gv.endsWith("atur")
								|| gv.endsWith("amur") || gv.endsWith("amini")
								|| gv.endsWith("antur") || gv.endsWith("or")) {
							
							tempusPräsensPassivIndikativAKonjugation();
			
						} else if (gv.endsWith("untur")) {
							
							tempusPräsensPassivIndikativKonsKonjugation();
						}
					}

			/*
			 * Wenn keine Passiv-Endung vorhanden ist -> Suche nach
			 * Aktivendungen
			 */

		} else {
			aussortierungAktiv();
		}
	}
	
	void aussortierungAktiv() {	

		
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PLUSQUAMPERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
							
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--

					/* Überprüft auf Endungen für:
					 *  1) Tempus: Plusquamperfekt
					 *  2) Modus: Indikativ
					 *  3) Genus verbi: Aktiv
					 */
					
					if (gv.endsWith("eram") || gv.endsWith("eras") || gv.endsWith("erat") ||
							gv.endsWith("eramus") || gv.endsWith("eratis") || gv.endsWith("erant")) {
						
						if (gv.endsWith("averam") || gv.endsWith("averas") ||
								gv.endsWith("averat") || gv.endsWith("averamus") ||
								gv.endsWith("averatis") || gv.endsWith("averant")) {
							
							tempusPlusquamperfektAktivIndikativAKonjugation();
							
						}else if (gv.endsWith("iveram") || gv.endsWith("iveras") ||
								gv.endsWith("iverat") || gv.endsWith("iveramus") ||
								gv.endsWith("iveratis") || gv.endsWith("iverant")) {
						
							tempusPlusquamperfektAktivIndikativIKonjugation();
							
						}else if (gv.endsWith("ueram") || gv.endsWith("ueras") ||
								gv.endsWith("uerat") || gv.endsWith("ueramus") ||
								gv.endsWith("ueratis") || gv.endsWith("uerant")) {
							
							tempusPlusquamperfektAktivIndikativEKonjugation();
							
						}else if (gv.endsWith("seram")|| gv.endsWith("seras") ||
								gv.endsWith("serat") || gv.endsWith("seramus") ||
								gv.endsWith("seratis") || gv.endsWith("serant")){
							
							tempusPlusquamperfektAktivIndikativEKonjugation();
							
						}else { 
							
							tempusPlusquamperfektAktivIndikativKonsKonjugation();
						}
		
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
					// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--
					// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--

					/* Überprüft auf Endungen für:
					 *  1) Tempus: PLusquamperfekt
					 *  2) Modus: Konjunktiv
					 *  3) Genus verbi: Aktiv
					 */
									
					}else if (gv.endsWith("issem") || gv.endsWith("isses") || 
							gv.endsWith("isset") || gv.endsWith("issemus") ||
							gv.endsWith("issetis") || gv.endsWith("issent")) {
						
						if (gv.endsWith("avissem") || gv.endsWith("avisses") ||
								gv.endsWith("avisset") || gv.endsWith("avissemus") ||
								gv.endsWith("avissetis") || gv.endsWith("avissent")) {
							
							tempusPlusquamperfektAktivKonjunktivAKonjugation();
							
						}else if (gv.endsWith("uissem") || gv.endsWith("uisses") ||
								gv.endsWith("uisset") || gv.endsWith("uissemus") ||
								gv.endsWith("uissetis") || gv.endsWith("uissent")) {
							
							tempusPlusquamperfektAktivKonjunktivEKonjugation();
							
						}else if(gv.endsWith("ivissem") || gv.endsWith("ivisses") ||
								gv.endsWith("ivisset") || gv.endsWith("ivissemus") ||
								gv.endsWith("ivissetis") || gv.endsWith("ivissent")) {
							
							tempusPlusquamperfektAktivKonjunktivIKonjugation();
							
						}else if (gv.endsWith("sissem") || gv.endsWith("sisses") ||
								gv.endsWith("sisset") || gv.endsWith("sissemus") ||
								gv.endsWith("sissetis") || gv.endsWith("sissent")){
							
							tempusPlusquamperfektAktivKonjunktivEKonjugation();

						}else {
							
							tempusPlusquamperfektAktivKonjunktivKonsKonjugation();
							
						}
			

		
					
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--IMPERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
										
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						
						/* Überprüft auf Endungen für:
						 *  1) Tempus: Imperfekt
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */
			
						}else if (gv.endsWith("bam") || gv.endsWith("bas") ||
								gv.endsWith("bat") || gv.endsWith("bamus") ||
								gv.endsWith("batis") || gv.endsWith("bant")) {
							
								if (gv.endsWith("abam") || gv.endsWith("abas") ||
										gv.endsWith("abat") || gv.endsWith("abamus") ||
										gv.endsWith("abatis") || gv.endsWith("abant")) {
									
									tempusImperfektAktivIndikativAKonjugation();
									
								}else if (gv.endsWith("iebam") || gv.endsWith("iebas") ||
										gv.endsWith("iebat") || gv.endsWith("iebamus") ||
										gv.endsWith("iebatis") || gv.endsWith("iebant")) {
									
									tempusImperfektAktivIndikativIKonjugation();
									
								}else if (gv.endsWith("ebam") || gv.endsWith("ebas") ||
										gv.endsWith("ebat") || gv.endsWith("ebamus") ||
										gv.endsWith("ebatis") || gv.endsWith("ebant")) {
									
									tempusImperfektAktivIndikativEKonjugation();
									
								}
		
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						
						/* Überprüft auf Endungen für:
						 *  1) Tempus: Imperfekt
						 *  2) Modus: Konjunktiv
						 *  3) Genus verbi: Aktiv
						 */
				
						}else if (gv.endsWith("rem") || gv.endsWith("res") || 
								gv.endsWith("ret") || gv.endsWith("remus") ||
								gv.endsWith("retis") || gv.endsWith("rent")) {
							
							if (gv.endsWith("arem") || gv.endsWith("ares") ||
									gv.endsWith("aret") || gv.endsWith("aremus") ||
									gv.endsWith("aretis") || gv.endsWith("arent")) {
							
								tempusImperfektAktivKonjunktivAKonjugation();
								
							}else if(gv.endsWith("irem") || gv.endsWith("ires") ||
									gv.endsWith("iret") || gv.endsWith("iremus") ||
									gv.endsWith("iretis") || gv.endsWith("irent")) {
								
								tempusImperfektAktivKonjunktivIKonjugation();
								
							}else {
								
								tempusImperfektAktivKonjunktivEUndKonsKonjugation();
								
							}
			
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--FUTUR I::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
														
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
							
						/* Überprüft auf Endungen für:
						 *  1) Tempus: Futur I
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */
			
						}else if (gv.endsWith("bo") || gv.endsWith("bis") ||
								gv.endsWith("bit") || gv.endsWith("bimus") ||
								gv.endsWith("bitis") || gv.endsWith("bunt")) {
							
							if (gv.endsWith("abo") || gv.endsWith("abis") ||
									gv.endsWith("abit") || gv.endsWith("abimus") ||
									gv.endsWith("abitis") || gv.endsWith("abunt")) {
								
								tempusFuturIAktivIndikativAKonjugation();
								
							}else if (gv.endsWith("ebo") || gv.endsWith("ebis") ||
									gv.endsWith("ebit") || gv.endsWith("ebimus") ||
									gv.endsWith("ebitis") || gv.endsWith("ebunt")) {
								
								tempusFuturIAktivIndikativEKonjugation();
								
							}else if (gv.endsWith("ibo") || gv.endsWith("ibis") ||
									gv.endsWith("ibit") || gv.endsWith("ibimus") ||
									gv.endsWith("ibitis") || gv.endsWith("ibunt")) {
								
								tempusFuturIAktivIndikativIKonjugation();
								
							}
						
						} else if (gv.endsWith("am") || gv.endsWith("es") ||
								gv.endsWith("et") || gv.endsWith("emus") ||
								gv.endsWith("etis") || gv.endsWith("ent")) {
							
							tempusFuturIAktivIndikativKonsKonjugation();
			
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PERFEKT::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																		
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
											
						/* Überprüft auf Endungen für:
						 *  1) Tempus: Perfekt
						 *  2) Modus: Konjunktiv
						 *  3) Genus verbi: Aktiv
						 */
			
						}else if (gv.endsWith("ero") || gv.endsWith("erim") ||
								gv.endsWith("eris") || gv.endsWith("erit") ||
								gv.endsWith("erimus") || gv.endsWith("eritis") ||
								gv.endsWith("erint")) {
							
							
							if (gv.endsWith("avero") || gv.endsWith("averim") ||
									gv.endsWith("averis") || gv.endsWith("averit") ||
									gv.endsWith("averimus") || gv.endsWith("averitis") ||
									gv.endsWith("averint")) {
								
								tempusPerfektAktivKonjunktivAKonjugation();
							
								
							}else if (gv.endsWith("uerim") || gv.endsWith("uero") ||
									gv.endsWith("ueris") || gv.endsWith("uerit") ||
									gv.endsWith("uerimus") || gv.endsWith("ueritis") ||
									gv.endsWith("uerint")) {
								
								tempusPerfektAktivKonjunktivEKonjugation();
							
								
							}else if (gv.endsWith("ivero") || gv.endsWith("iverim") ||
									gv.endsWith("iveris") || gv.endsWith("iverit") ||
									gv.endsWith("iverimus") || gv.endsWith("iveritis") ||
									gv.endsWith("iverint")) {
								
								tempusPerfektAktivKonjunktivIKonjugation();
								
							}else if (gv.endsWith("sero") || gv.endsWith("seris") ||
									gv.endsWith("serit") || gv.endsWith("serimus") ||
									gv.endsWith("seritis") || gv.endsWith("serint") ||
									gv.endsWith("serim")){
								
								tempusPerfektAktivKonjunktivEKonjugation();
								
							}else {
								
								tempusPerfektAktivKonjunktivKonsKonjugation();
							}

			
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
											
						/* Überprüft auf Endungen für:
						 *  1) Tempus: Perfekt
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */

						}else if ( gv.endsWith("i") || gv.endsWith("isti") ||
								gv.endsWith("it") || gv.endsWith("imus") ||
								gv.endsWith("itis") || gv.endsWith("erunt")) {
							
							
								if (gv.endsWith("avi") || gv.endsWith("avisti") ||
										gv.endsWith("avit") || gv.endsWith("avimus") ||
										gv.endsWith("avitis") || gv.endsWith("averunt")) {
									
									tempusPerfektAktivIndikativAKonjugation();
								
									
								}else if (gv.endsWith("ui") || gv.endsWith("uisti") ||
										gv.endsWith("uit") || gv.endsWith("uimus") ||
										gv.endsWith("uistis") || gv.endsWith("uerunt")) {
									
									tempusPerfektAktivIndikativEKonjugation();

									
								}else if (gv.endsWith("ivi") || gv.endsWith("ivisti") ||
										gv.endsWith("ivit") || gv.endsWith("ivimus") ||
										gv.endsWith("ivitis") || gv.endsWith("iverunt")) {
									
									tempusPerfektAktivIndikativIKonjugation();
									
								}else if (gv.endsWith("si") || gv.endsWith("sisti") ||
										gv.endsWith("sit") || gv.endsWith("simus") ||
										gv.endsWith("sitis") || gv.endsWith("serunt")) {
									
									tempusPerfektAktivIndikativEKonjugation();
									
								}else {
									
									tempusPerfektAktivIndikativKonsKonjugation();
								}
						
			 
			
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--PRÄSENS::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																							
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																
						/* Überprüft auf Endungen für:
						 *  1) Tempus: Präsens
						 *  2) Modus: Konjunktiv
						 *  3) Genus verbi: Aktiv
						 */
		
					
						}else if (gv.endsWith("em") || gv.endsWith("es") ||
								gv.endsWith("et") || gv.endsWith("emus") ||
								gv.endsWith("etis") || gv.endsWith("ament")) {
							
							tempusPräsensAktivKonjunktivAKonjugation();
							
						}else if (gv.endsWith("am") || gv.endsWith("as") ||
								gv.endsWith("at") || gv.endsWith("amus") ||
								gv.endsWith("atis") || gv.endsWith("ant")) {
							
							if (gv.endsWith("iam") || gv.endsWith("ias") ||
									gv.endsWith("iat") || gv.endsWith("iamus") ||
									gv.endsWith("iatis") || gv.endsWith("iant")) {
								
								tempusPräsensAktivKonjunktivIKonjugation();
								
							}else if(gv.endsWith("eam") || gv.endsWith("eas") ||
									gv.endsWith("eat") || gv.endsWith("eamus") ||
									gv.endsWith("eatis") || gv.endsWith("eant")) {
								
								tempusPräsensAktivKonjunktivEKonjugation();
								
							}else {
								tempusPräsensAktivKonjunktivKonsKonjugation();
							}
				
		
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
						// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--
						// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--
																
						/* Überprüft auf Endungen für:
						 *  1) Tempus: Präsens
						 *  2) Modus: Indikativ
						 *  3) Genus verbi: Aktiv
						 */
		
				
						}else if (gv.endsWith("eo") || gv.endsWith("es") || 
								gv.endsWith("et") || gv.endsWith("emus") ||
								gv.endsWith("etis") || gv.endsWith("ent")) {
					
							tempusPräsensAktivIndikativEKonjugation();
					
						}else if (gv.endsWith("io") || gv.endsWith("is") ||
								gv.endsWith("it") || gv.endsWith("imus") ||
								gv.endsWith("itis") || gv.endsWith("iunt")) {
					
							tempusPräsensAktivIndikativIKonjugation();
					
						}else if (gv.endsWith("o") || gv.endsWith("as") ||
								gv.endsWith("at") || gv.endsWith("amus") ||
								gv.endsWith("atis") || gv.endsWith("ant")) {
					
							tempusPräsensAktivIndikativAKonjugation();
						}else if (gv.endsWith("unt")) {
					
							tempusPräsensAktivIndikativKonsKonjugation();
						}else {
				
						}
	}

	//@formatter:off
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--PRÄSENS::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPräsensAktivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Indikativ - A Konjugation");
					
					if (gv.endsWith("o")) {
						gvs = gv.substring(0, gv.length()-1);
						new Auswahl(gvs);
					}else if (gv.endsWith("as") || gv.endsWith("at")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("amus") || gv.endsWith("atis")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ant")) {
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else {
						tempusPräsensAktivKonjunktivAKonjugation();
					}
					
				}
				
				private void tempusPräsensAktivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Indikativ - E Konjugation");
					
					if (gv.endsWith("eo") || gv.endsWith("es") || gv.endsWith("et")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("emus") || gv.endsWith("etis")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else if (gv.endsWith("ent")) {
						gvs = gv.substring(0, gv.length()-3);
						new Auswahl(gvs);
					}else {
						tempusPräsensAktivKonjunktivEKonjugation();
					}
				}
				
				private void tempusPräsensAktivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Indikativ - I Konjugation");
					
					if (gv.endsWith("io")||gv.endsWith("is") || gv.endsWith("it")) {
						gvs = gv.substring(0, gv.length()-2);
						new Auswahl(gvs);
					}else if (gv.endsWith("imus") || gv.endsWith("itis") || gv.endsWith("iunt")) {
						gvs = gv.substring(0, gv.length()-4);
						new Auswahl(gvs);
					}else {
						tempusPräsensAktivKonjunktivIKonjugation();
					}
					
				}
				
				private void tempusPräsensAktivIndikativKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Indikativ - Kons Konjugation");
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPräsensAktivKonjunktivAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensAktivKonjunktivIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensAktivKonjunktivEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensAktivKonjunktivKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPräsensPassivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensPassivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensPassivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensPassivIndikativKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPräsensPassivKonjunktivAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensPassivKonjunktivEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPräsensPassivKonjunktivIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--IMPERFEKT::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusImperfektAktivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektAktivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektAktivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusImperfektAktivKonjunktivAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektAktivKonjunktivIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektAktivKonjunktivEUndKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusImperfektPassivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektPassivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektPassivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusImperfektPassivKonjunktivAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektPassivKonjunktivEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusImperfektPassivKonjunktivIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--FUTURI::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusFuturIAktivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusFuturIAktivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusFuturIAktivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusFuturIAktivIndikativKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusFuturIPassivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusFuturIPassivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusFuturIPassivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusFuturIPassivIndikativKonsKOnjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--PERFEKT::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPerfektAktivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPerfektAktivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPerfektAktivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPerfektAktivIndikativKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
				private void tempusPerfektAktivKonjunktivAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPerfektAktivKonjunktivEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPerfektAktivKonjunktivIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPerfektAktivKonjunktivKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPerfektPassivIndikativ() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPerfektPassivKonjunktiv() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--PLUSQUAMPERFEKT::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--

				private void tempusPlusquamperfektAktivIndikativAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPlusquamperfektAktivIndikativEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPlusquamperfektAktivIndikativIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPlusquamperfektAktivIndikativKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPlusquamperfektAktivKonjunktivAKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPlusquamperfektAktivKonjunktivEKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPlusquamperfektAktivKonjunktivIKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
				
				private void tempusPlusquamperfektAktivKonjunktivKonsKonjugation() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPlusquamperfektPassivIndikativ() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--KONJUNKTIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusPlusquamperfektPassivKonjunktiv() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
	
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--FUTUR II::--::--::--::--::--::--::--::--
	// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--AKTIV::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				/* Methode nicht vorhanden, da Endungen identich mit:
				 * tempusPerfektAktivKonjunktiv 
				 */
	
	

		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--PASSIV::--::--::--::--::--::--::--
		// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
	

			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--INDIKATIV::--::--::--::--::--::--::--
			// ::--::--::--::--::--::--::--::--::--::--::--::--::--::--::--
				
				private void tempusFuturIIPassivIndikativ() {
					System.out.println("Präsens - Aktiv - Konjunktiv - A Konjugation");
					
				}
			















}
