package org.springTest;

import java.util.ArrayList;
import java.util.List;

public class ObjetoDTO {
	private List<Objeto1> lista = new ArrayList<>();
	private Objeto1 obj1;
	private Objeto2 obj2;

	public Objeto2 getObj2() {
		return obj2;
	}

	public void setObj2(Objeto2 obj2) {
		this.obj2 = obj2;
	}

	public Objeto1 getObj1() {
		return obj1;
	}

	public void setObj1(Objeto1 obj1) {
		this.obj1 = obj1;
	}

	public List<Objeto1> getLista() {
		return lista;
	}

	public void setLista(List<Objeto1> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "ObjetoDTO [lista=" + lista + ", obj1=" + obj1 + ", obj2=" + obj2 + "]";
	}
	
}
