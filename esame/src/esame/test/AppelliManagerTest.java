package esame.test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import esame.control.AppelliManager;
import esame.entity.Appello;
import esame.entity.Corso;
import esame.entity.Data;
import esame.entity.Docente;
import esame.entity.Sede;
import esame.entity.Studente;
import esame.entity.Tipologia;

class AppelliManagerTest {

	@Test
	void test01UnoStudentePrenotatoAUnAppello() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Primo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		manager.aggiungiiData(first); //aggiungo data in array date
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		

		c.addAppello(a);
		
		manager.prenotaStudente(secondo, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test02DueStudentiPrenotatiAUnAppello() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		Docente primo = new Docente("Primo");
		Studente primoS = new Studente("Primo", "Studente", "N48", 44);
		Studente secondo = new Studente("Secondo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		manager.aggiungiiData(first); //aggiungo data in array date
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		

		c.addAppello(a);
		
		manager.prenotaStudente(secondo, a);
		manager.prenotaStudente(primoS, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test03NessunoStudentePrenotato() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		Docente primo = new Docente("Primo");
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		manager.aggiungiiData(first); //aggiungo data in array date 
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), true, c);
		

		c.addAppello(a);
		
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test04DueAppelliPerUnCorsoConUnPrenotato() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Secondo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		manager.aggiungiiData(first);
		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		Appello a1 = manager.creaAppello(manager.listaDate(), false, c);
		

		c.addAppello(a);
		c.addAppello(a1);
		
		manager.prenotaStudente(secondo, a);
		manager.prenotaStudente(secondo, a1);
		
		
		manager.stampaStudentiPrenotati(a);
		manager.stampaStudentiPrenotati(a1);
	}

	@Test
	void test05StudentePrenotatoDueVoltePerLoStessoAppello() throws Exception {
		AppelliManager manager = new AppelliManager();
	
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Primo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		manager.aggiungiiData(first); //aggiungo data in array date		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		

		c.addAppello(a);
		
		
		manager.prenotaStudente(secondo, a);
		manager.prenotaStudente(secondo, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test06StudenteCercaDiPrenotarsiAdUnAppelloChiuso() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Primo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		manager.aggiungiiData(first);
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		
		c.addAppello(a);
		manager.chiudiAppello(a);

	
		
		manager.prenotaStudente(secondo, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test07StudenteCercaDiPrenotarsiAdUnAppelloSenzaData() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Primo", "Studente", "N45", 33);
		

		
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		
		c.addAppello(a);

	
		
		manager.prenotaStudente(secondo, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test08APiùDatePerLoStessoAppello() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Primo", "Studente", "N45", 33);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		Data second = new Data(LocalDate.of(2016, 2, 1), Tipologia.Orale, Sede.Laboratorio);
		
		manager.aggiungiiData(first); //aggiungo data in array date
		manager.aggiungiiData(second); //aggiungo data in array date
		

		
		Corso c = manager.creaCorso("corso1", primo, 3);

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		
		c.addAppello(a);

	
		
		manager.prenotaStudente(secondo, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	@Test
	void test09DueStudentiCercanoDiPrenotarsiAdUnAppelloChiuso() throws Exception {
		AppelliManager manager = new AppelliManager();
		
		Docente primo = new Docente("Primo");
		Studente secondo = new Studente("Primo", "Studente", "N45", 33);
		Studente terzo = new Studente("Secondo", "Studente", "N66", 69);
		Data first = new Data(LocalDate.of(2016, 1, 1), Tipologia.Calcolatore, Sede.Aula);
		
		manager.aggiungiiData(first);
		Corso c = manager.creaCorso("corso1", primo, 3);
		

		
		Appello a = manager.creaAppello(manager.listaDate(), false, c);
		
		c.addAppello(a);
		manager.chiudiAppello(a);

	
		manager.prenotaStudente(terzo, a);
		manager.prenotaStudente(secondo, a);
		
		manager.stampaStudentiPrenotati(a);
	}
	
	
}

