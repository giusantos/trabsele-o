package model.entity;

import java.util.ArrayList;

public class Treinamento extends AbstractEntity{
	
	private String nome;
	
	private Evento primeiroEvento;
	private Evento segundoEvento;

	private ArrayList<Pessoa> participantes = new ArrayList<Pessoa>();
	
	public Treinamento() {
		primeiroEvento = new Evento();
		segundoEvento = new Evento();
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Evento getPrimeiroEvento() {
		return primeiroEvento;
	}

	public void setPrimeiroEvento(Evento primeiroEvento) {
		this.primeiroEvento = primeiroEvento;
	}

	public Evento getSegundoEvento() {
		return segundoEvento;
	}

	public void setSegundoEvento(Evento segundoEvento) {
		this.segundoEvento = segundoEvento;
	}

	public ArrayList<Pessoa> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Pessoa> participantes) {
		this.participantes = participantes;
	}


}
