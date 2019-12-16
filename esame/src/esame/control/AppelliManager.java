package esame.control;

import java.util.ArrayList;

import esame.entity.*;

public class AppelliManager {
	
	public AppelliManager() {
		
	}
	
	public Corso creaCorso(String _corso, Docente _docente, int _cfu) {
		ArrayList<Appello> appelli = new ArrayList<Appello>();
		Corso bello = new Corso(_corso, _docente, _cfu);
		return bello;
	}
	
	public Appello creaAppello(ArrayList<Data> date, boolean concluso, Corso corso) {
		Appello nonbrutto = new Appello(date, concluso);
		corso.addAppello(nonbrutto);
		return nonbrutto;
	}
	
	public void prenotaStudente(Studente s, Appello appello) {
		appello.addStudente(s);
	}
	
	public void stampaStudentiPrenotati(Appello appello) {
		ArrayList<Studente> studenti= appello.getStudenti();
		
		for(int i=0; i<studenti.size(); i++) {
			System.out.println(studenti.get(i));
		}
	}
	
	
}
