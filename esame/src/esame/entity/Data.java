package esame.entity;

import java.util.*;

public class Data {
	protected Date data;
	protected Tipologia tipo;
	protected Sede luogo;
	
	
	public Data(Date _data, Tipologia _tipo, Sede _luogo) {
		this.data= new Date();
		luogo=_luogo;
		tipo=_tipo;
	}
	
	public Date getData() {
		return data;
	}
	
	public Tipologia getTipo() {
		return tipo;
	}
	
	public Sede getLuogo() {
		return luogo;
	}
}
