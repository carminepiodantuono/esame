package esame.control;

import java.util.ArrayList;

import esame.entity.*;

public class AppelliManager {
	
	ArrayList<Corso> listaCorsi = new ArrayList<>();
	ArrayList<Data> dataAppelli;
	
	public AppelliManager() {
		dataAppelli = new ArrayList<>();
	}
	
	public Corso creaCorso(String _corso, Docente _docente, int _cfu) {
	
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
	
	public void aggiungiiData(Data data) {
		this.dataAppelli.add(data);
	}
	
	public ArrayList<Data> listaDate(){
		return this.dataAppelli;
	}
	
	public void prenotaStudente(Studente s, Appello appello) {
		if(dataAppelli.isEmpty()) {
			System.out.println("L'appello non ha una data");
		}else {
		if(appello.getIsClosed()==true) {
			System.out.println("L'appello è chiuso, non è possibile prenotarsi!");
		}else if(!appello.getStudenti().contains(s)) {
			appello.addStudente(s);
		}else {
			System.out.println("Prenotazione già avvenuta, non è possibile  prenotarsi due volte per lo stesso appello!");
		}
	}
	}
	
	public void stampaStudentiPrenotati(Appello appello) {
		ArrayList<Studente> studenti= appello.getStudenti();
		
		for(int i=0; i<studenti.size(); i++) {
			System.out.println(studenti.get(i));
		}
	}
	
	public void chiudiAppello(Appello appello) {
		appello.setIsClosed(true);
	}
	
	
}
