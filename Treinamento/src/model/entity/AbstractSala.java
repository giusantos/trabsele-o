package model.entity;

import java.util.ArrayList;

public abstract class AbstractSala extends AbstractEntity {

	protected String nome;
	protected ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	protected int lotacao;
	
	public String getNome() {
		return nome;
	}
	
	public boolean verificaSeEstaLivre () {
		if (lotacao > pessoas.size())
			return true;
		return false;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public int getLotacao() {
		return lotacao;
	}

	public void setLotacao(int lotacao) {
		this.lotacao = lotacao;
	}
	
	@Override
	public String toString() {
		return nome;
	}
}
