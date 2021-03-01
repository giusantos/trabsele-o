package model.dao;

import java.util.ArrayList;

import model.entity.AbstractSala;
import model.entity.Evento;
import model.entity.Pessoa;
import model.entity.Treinamento;

public class TreinamentoDao { /* acesso aos dados */

	public final static Treinamento TREINAMENTO = new Treinamento();

	public void misturarSalasDosEventos() {
		Evento primeiroEvento = TREINAMENTO.getPrimeiroEvento();
		Evento segundoEvento = TREINAMENTO.getSegundoEvento();
		// mistura sala de café 1
		limpaSalasDoSegundoEvento();
		
		misturaPrimeiraMetade(primeiroEvento.getSalaCafe(), segundoEvento.getSalaCafe2());
		misturaSegundaMetade(primeiroEvento.getSalaCafe(), segundoEvento.getSalaCafe());

		// mistura sala de café 2
		misturaPrimeiraMetade(primeiroEvento.getSalaCafe2(), segundoEvento.getSalaCafe());
		misturaSegundaMetade(primeiroEvento.getSalaCafe2(), segundoEvento.getSalaCafe2());

		// Mistura sala de evento 1
		misturaPrimeiraMetade(primeiroEvento.getSalaEvento(), segundoEvento.getSalaEvento2());
		misturaSegundaMetade(primeiroEvento.getSalaEvento(), segundoEvento.getSalaEvento());

		// Mistura sala de evento 2
		misturaPrimeiraMetade(primeiroEvento.getSalaEvento2(), segundoEvento.getSalaEvento());
		misturaSegundaMetade(primeiroEvento.getSalaEvento2(), segundoEvento.getSalaEvento2());
	}
	
	private void limpaSalasDoSegundoEvento() {
		Evento segundoEvento = TREINAMENTO.getSegundoEvento();
		
		segundoEvento.getSalaCafe().getPessoas().clear();
		segundoEvento.getSalaCafe2().getPessoas().clear();
		segundoEvento.getSalaEvento().getPessoas().clear();
		segundoEvento.getSalaEvento2().getPessoas().clear();
	}
	
	private void misturaPrimeiraMetade(AbstractSala sala, AbstractSala salaNoProxEvento) {
		int qtdPessoas = sala.getPessoas().size() - 1;

		if (qtdPessoas % 2 != 0)
			qtdPessoas++;

		int metadeLista = qtdPessoas / 2;

		ArrayList<Pessoa> metadeDasPessoas = new ArrayList<Pessoa>(sala.getPessoas().subList(0, metadeLista));
		salaNoProxEvento.getPessoas().addAll(metadeDasPessoas);
	}

	private void misturaSegundaMetade(AbstractSala sala, AbstractSala salaNoProxEvento) {
		int qtdPessoas = sala.getPessoas().size() - 1;

		if (qtdPessoas % 2 != 0)
			qtdPessoas++;

		int metadeLista = qtdPessoas / 2;

		ArrayList<Pessoa> metadeDasPessoas = new ArrayList<Pessoa>(sala.getPessoas().subList(metadeLista, qtdPessoas));
		salaNoProxEvento.getPessoas().addAll(metadeDasPessoas);
	}

}
