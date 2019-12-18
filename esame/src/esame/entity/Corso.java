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
		this.appelli = new ArrayList<Appello>();
	}
	
	//costruttore
	public Corso(String _corso, Docente _docente, int _cfu) {
		nomeCorso = _corso;
		cfu=_cfu;
		nomeDocente= _docente;
		this.appelli = new ArrayList<Appello>();
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
	
	public void setAppelli(ArrayList<Appello> _appelli) {
		appelli = _appelli;
	}
	
	
	//aggiunge un appello all'array di appelli
	public void addAppello(Appello a) {
		appelli.add(a);
	}
	
}
