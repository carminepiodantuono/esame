package esame.control;

import java.util.ArrayList;

import esame.entity.*;

public class AppelliManager {
	
	ArrayList<Corso> listaCorsi;
	ArrayList<Data> dataAppelli;
	
	//costruttore
	public AppelliManager() {
		listaCorsi = new ArrayList<>();
		dataAppelli = new ArrayList<>();
	}
	
	//crea il corso con il nome del corso, il nome del docente, cfu dell'esame
	public Corso creaCorso(String _corso, Docente _docente, int _cfu) {
	
		Corso cor = new Corso(_corso, _docente, _cfu);
		return cor;
	}
	
	//crea un appello con data, stato dell'appello e il nome del corso creato in precedenza
	public Appello creaAppello(ArrayList<Data> date, boolean concluso, Corso corso) {
		Appello app = new Appello(date, concluso);
		
		if(listaCorsi.contains(corso)) {
			corso.addAppello(app); 				//se il corso è inserito nell'array del corso, è possibile inserivi un appello
		}else {
			listaCorsi.add(corso);				//se il corso non è inserito nell'array dei corsi, si aggiunge il corso e poi vi si aggiunge l'appello
			corso.addAppello(app);
		}
		
		corso.addAppello(app);
		return app;
	}
	
	//aggiunge una data di un appello
	public void aggiungiiData(Data data) {
		this.dataAppelli.add(data);
	}
	
	//ritorna un array con le date inizializzate in precedenza
	public ArrayList<Data> listaDate(){
		return this.dataAppelli;
	}
	
	//prenota uno studente per un determinato appello
	public void prenotaStudente(Studente s, Appello appello) {
		if(dataAppelli.isEmpty()) {
			System.out.println("L'appello non ha una data");							//se l'appello non ha date non è possibile prenotarsi
		}else {
		if(appello.getIsClosed()==true) {
			System.out.println("L'appello è chiuso, non è possibile prenotarsi!");		//l'if controlla l'appello è aperto o chiuso
		}else if(!appello.getStudenti().contains(s)) {
			appello.addStudente(s);
		}else {
			System.out.println("Prenotazione già avvenuta, non è possibile  prenotarsi due volte per lo stesso appello!");
		}
	}
	}
	
	//stampa gli studenti prenotati per l'appello
	public void stampaStudentiPrenotati(Appello appello) {
		ArrayList<Studente> studenti= appello.getStudenti();
		
		for(int i=0; i<studenti.size(); i++) {
			System.out.println(studenti.get(i));
		}
	}
	
	
	//chiude un appello
	public void chiudiAppello(Appello appello) {
		appello.setIsClosed(true);
	}
	
	
}
