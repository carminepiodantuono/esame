package esame.entity;

public class Docente {
	protected String nomeDocente;
	
	//costruttore vuoto
	public Docente() {
		this.nomeDocente="";
		
	}
	
	//costruttore
	public Docente(String _docente) {
		this.nomeDocente= new String(_docente);
	}
	
	public String getNomeDocente() {
		return nomeDocente;
	}
	
	public void setNomeDocente(String _docente) {
		nomeDocente = _docente;
	}
	
}
