
package esam;
import java.time.LocalDate;
import java.util.ArrayList;

import esame.control.*;
import esame.entity.*;

public class Main {

	public static void main(String[] args) {
		AppelliManager manager = new AppelliManager();
		ArrayList<Data> dataAppelli = new ArrayList<>();
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Secondo", "Studente", "N45", 33);
		Studente terzo = new Studente("Terzo", "Studente", "N46", 22);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		dataAppelli.add(first); //aggiungo data in array date
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(dataAppelli, false, c);
		
		System.out.println(a);
		
		System.out.println("ciao");
		c.addAppello(a);
		
		manager.prenotaStudente(secondo, a);
		manager.prenotaStudente(terzo, a);
		manager.stampaStudentiPrenotati(a);
	}

} 

