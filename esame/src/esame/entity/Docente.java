package esame;

public class Docente {
	protected String nomeDocente;
	
	public Docente() {
		this.nomeDocente="";
		
	}
	
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
