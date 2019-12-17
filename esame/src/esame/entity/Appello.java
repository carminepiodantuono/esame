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
	
	public Appello(ArrayList<Data> date, boolean concluso) {
		appelli = date;
		isConcluso = concluso;
		studentiPrenotati = new ArrayList<Studente>();
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
	
	public void addData(Data _data) {
		appelli.add(_data);
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		if(isConcluso==true) {
			buff.append("Stato appello: CHIUSO");
		} else {
			buff.append("Stato appello: APERTO");
		}
		return buff.toString();
	}
	
}
