package model;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class VisitanteBean
{
	private String nome = "Bruno Vitalino";

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
