package model.dao;

import java.util.ArrayList;

import model.entity.Evento;
import model.entity.Pessoa;

public class EventoDao {
	
	
	public boolean cadastrarPessoaNaSalaDoEvento(Evento evento, Pessoa pessoa) {
		boolean salasDeCafeLivres = evento.getSalaCafe().verificaSeEstaLivre()
				|| evento.getSalaCafe2().verificaSeEstaLivre();

		boolean salasDoEventoLivres = evento.getSalaEvento().verificaSeEstaLivre()
				|| evento.getSalaEvento2().verificaSeEstaLivre();

		if (salasDeCafeLivres && salasDoEventoLivres) {

			int qtdPessoasSalaEvento1 = evento.getSalaEvento().getPessoas().size();
			int qtdPessoasSalaEvento2 = evento.getSalaEvento2().getPessoas().size();

			if (qtdPessoasSalaEvento1 - qtdPessoasSalaEvento2 < 1) {
				
				evento.getPessoas().add(pessoa);
				evento.getSalaEvento().getPessoas().add(pessoa);
				cadastrarNaSalaDeCafeDoEvento(pessoa, evento);
				return true;

				// cadastrar na sala 2
			} else if (qtdPessoasSalaEvento2 - qtdPessoasSalaEvento1 < 1) {
				
				evento.getPessoas().add(pessoa);
				evento.getSalaEvento2().getPessoas().add(pessoa);
				cadastrarNaSalaDeCafeDoEvento(pessoa, evento);
				return true;
			}
		}
		return false;
	}

	private void cadastrarNaSalaDeCafeDoEvento(Pessoa pessoa, Evento evento) {

		int qtdPessoasSalaCafe1 = evento.getSalaCafe().getPessoas().size();
		int qtdPessoasSalaCafe2 = evento.getSalaCafe2().getPessoas().size();

		if (qtdPessoasSalaCafe1 - qtdPessoasSalaCafe2 < 1) {

			evento.getSalaCafe().getPessoas().add(pessoa);

			// cadastrar na sala cafe 1
		} else if (qtdPessoasSalaCafe2 - qtdPessoasSalaCafe1 < 1) {

			evento.getSalaCafe2().getPessoas().add(pessoa);

		}
	}
	
}
