package esame.control;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import esame.entity.Appello;
import esame.entity.Corso;
import esame.entity.Data;
import esame.entity.Docente;
import esame.entity.Sede;
import esame.entity.Studente;
import esame.entity.Tipologia;

class AppelliManagerTest {

	@Test
	void test01UnoStudentePrenotatoAUnAppello() {
		AppelliManager manager = new AppelliManager();
		ArrayList<Data> dataAppelli = new ArrayList<>();
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Primo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		dataAppelli.add(first); //aggiungo data in array date
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(dataAppelli, true, c);
		

		c.addAppello(a);
		
		manager.prenotaStudente(secondo, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test02DueStudentiPrenotatiAUnAppello() {
		AppelliManager manager = new AppelliManager();
		ArrayList<Data> dataAppelli = new ArrayList<>();
		
		Docente primo = new Docente("Primo");
		Studente primoS = new Studente("Primo", "Studente", "N48", 44);
		Studente secondo = new Studente("Secondo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		dataAppelli.add(first); //aggiungo data in array date
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(dataAppelli, true, c);
		

		c.addAppello(a);
		
		manager.prenotaStudente(secondo, a);
		manager.prenotaStudente(primoS, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test03NessunoStudentePrenotato() {
		AppelliManager manager = new AppelliManager();
		ArrayList<Data> dataAppelli = new ArrayList<>();
		
		Docente primo = new Docente("Primo");
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		dataAppelli.add(first); //aggiungo data in array date
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(dataAppelli, true, c);
		

		c.addAppello(a);
		
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test04DueAppelliPerUnCorsoConUnPrenotato() {
		AppelliManager manager = new AppelliManager();
		ArrayList<Data> dataAppelli = new ArrayList<>();
		
		Docente primo = new Docente("Primo");
		Studente primoS = new Studente("Primo", "Studente", "N48", 44);
		Studente secondo = new Studente("Secondo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		dataAppelli.add(first); //aggiungo data in array date
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(dataAppelli, true, c);
		Appello a1 = manager.creaAppello(dataAppelli, true, c);
		

		c.addAppello(a);
		c.addAppello(a1);
		
		manager.prenotaStudente(secondo, a);
		manager.prenotaStudente(secondo, a1);
		
		
		manager.stampaStudentiPrenotati(a);
		manager.stampaStudentiPrenotati(a1);
	}


}
