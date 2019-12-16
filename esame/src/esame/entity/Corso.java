package esame.entity;

import java.util.ArrayList;

public class Corso {
	protected String nomeCorso;
	protected Docente nomeDocente;
	protected int cfu;
	protected ArrayList<Appello> appelli;
	
	public Corso() {
		this.nomeCorso="";
		this.nomeDocente= new Docente();
		this.cfu=0;
		this.appelli= new ArrayList<Appello>();
	}
	
	public Corso(String _corso, Docente _docente, int _cfu, ArrayList<Appello> _appelli) {
		this.nomeCorso= new String(_corso);
		cfu=_cfu;
		nomeDocente= _docente;
		appelli = _appelli;
	}
	
	public String getNomeCorso() {
		return nomeCorso;
	}
	
	public void setNomeCorso(String _corso) {
		nomeCorso = _corso;
	}
	
	
	public void setDocente(Docente d) {
		nomeDocente=d;
	}
	
	public Docente getDocente() {
		return nomeDocente;
	}
	
	public void setCfu(int _cfu) {
		cfu = _cfu;
	}
	
	public int getCfu() {
		return cfu;
	}
	
	public void addAppello(Appello appello) {
		appelli.add(appello);
	}
	
}
