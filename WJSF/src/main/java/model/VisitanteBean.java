package model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
public class VisitanteBean
{
	private String nome = "Bruno Vitalino";
	private String telefone;
	
	private String mensagem;

	public void enviarMsg() {
		mensagem = "Visitante: " + nome + " " + telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
