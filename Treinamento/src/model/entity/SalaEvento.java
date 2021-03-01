package model.entity;

public class SalaEvento extends AbstractSala {
	
	public SalaEvento() {
		
	}
	
	public SalaEvento(String nome, int lotacao) {
		this.nome = nome;
		this.lotacao = lotacao;
	}
}
