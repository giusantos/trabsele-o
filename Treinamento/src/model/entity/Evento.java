package model.entity;

import java.util.ArrayList;

public class Evento extends AbstractEntity{

	private SalaEvento salaEvento;
	private SalaEvento salaEvento2;

	private SalaCafe salaCafe;
	private SalaCafe salaCafe2;

	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

	public SalaEvento getSalaEvento() {
		return salaEvento;
	}

	public void setSalaEvento(SalaEvento salaEvento) {
		this.salaEvento = salaEvento;
	}

	public SalaEvento getSalaEvento2() {
		return salaEvento2;
	}

	public void setSalaEvento2(SalaEvento salaEvento2) {
		this.salaEvento2 = salaEvento2;
	}

	public SalaCafe getSalaCafe() {
		return salaCafe;
	}

	public void setSalaCafe(SalaCafe salaCafe) {
		this.salaCafe = salaCafe;
	}

	public SalaCafe getSalaCafe2() {
		return salaCafe2;
	}

	public void setSalaCafe2(SalaCafe salaCafe2) {
		this.salaCafe2 = salaCafe2;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
	}

}
