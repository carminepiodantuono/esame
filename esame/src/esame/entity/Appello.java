package esame.entity;
import java.util.*;

public class Appello {
	
	ArrayList<Data> appelli;
	boolean isConcluso;
	ArrayList<Studente> studentiPrenotati;
	
	public Appello() {
		appelli = new ArrayList<Data>();
		isConcluso = false;
		studentiPrenotati = new ArrayList<Studente>();
	}
	
	public Appello(ArrayList<Data> date, boolean concluso, ArrayList<Studente> _studente) {
		appelli = date;
		isConcluso = concluso;
		studentiPrenotati = _studente;
	}	
	
	public void addStudente(Studente s) {
		studentiPrenotati.add(s);
	}
	
	public ArrayList<Studente> getStudenti(){
		return studentiPrenotati;
	}
	
	public ArrayList<Data> getAppello(){
		return appelli;
	}
	
	public void setAppello(ArrayList<Data> _appelli) {
		appelli = _appelli;
	}
	
	public boolean getIsConcluso() {
		return isConcluso;
	}
	
	public void setIsConcluso(boolean _concluso) {
		isConcluso = _concluso;
	}
	
	
	
}
