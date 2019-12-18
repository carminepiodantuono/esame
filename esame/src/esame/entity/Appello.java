package esame.entity;
import java.util.*;

public class Appello {
	
	ArrayList<Data> appelli;
	public boolean isClosed;
	ArrayList<Studente> studentiPrenotati;
	
	public Appello() {
		appelli = new ArrayList<Data>();
		isClosed = false;
		studentiPrenotati = new ArrayList<Studente>();
	}
	
	public Appello(ArrayList<Data> date, boolean concluso) {
		appelli = date;
		isClosed = concluso;
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
	
	public boolean getIsClosed() {
		return isClosed;
	}
	
	public void setIsClosed(boolean _concluso) {
		isClosed = _concluso;
	}
	
	public void addData(Data _data) {
		appelli.add(_data);
	}
	
	public String toString() {
		StringBuffer buff = new StringBuffer();
		if(isClosed==true) {
			buff.append("Stato appello: CHIUSO");
		} else {
			buff.append("Stato appello: APERTO");
		}
		return buff.toString();
	}
	
	
}
