package model.entity;

import java.util.ArrayList;

public class SalaCafe extends AbstractSala {
	
	public SalaCafe() {

	}

	public SalaCafe(String nome, int lotacao) {
		this.nome = nome;
		this.lotacao = lotacao;
	}
}