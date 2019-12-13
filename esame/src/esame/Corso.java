package esame;

public class Corso {
	protected String nomeCorso;
	protected Docente nomeDocente;
	protected int cfu;
	
	public Corso() {
		this.nomeCorso="";
		this.nomeDocente= new Docente();
		this.cfu=0;
	}
	
	public Corso(String _corso) {
		this.nomeCorso= new String(_corso);
		this.cfu=cfu;
		nomeDocente=_docente;
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
	
}