package esame.control;

import java.util.ArrayList;

import esame.entity.*;

public class AppelliManager {
	
	ArrayList<Corso> listaCorsi = new ArrayList<>();
	
	public AppelliManager() {
		
	}
	
	public Corso creaCorso(String _corso, Docente _docente, int _cfu) {
		ArrayList<Appello> appelli = new ArrayList<Appello>();
		Corso cor = new Corso(_corso, _docente, _cfu);
		return cor;
	}
	
	public Appello creaAppello(ArrayList<Data> date, boolean concluso, Corso corso) {
		Appello app = new Appello(date, concluso);
		
		if(listaCorsi.contains(corso)) {
			corso.addAppello(app);
		}else {
			listaCorsi.add(corso);
			corso.addAppello(app);
		}
		
		corso.addAppello(app);
		return app;
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
