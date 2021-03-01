package model.dao;

import model.entity.Evento;
import model.entity.Pessoa;
import model.entity.SalaCafe;
import model.entity.SalaEvento;
import model.entity.Treinamento;

public class PessoaDao {
	private Treinamento treinamento = TreinamentoDao.TREINAMENTO;
	
	public Pessoa getById(long id) {
		for (Pessoa pessoa : treinamento.getParticipantes()) {
			if (pessoa.getId() == id)
				return pessoa;
		}
		return null;
	}
	
	public String getInformacoesDaPessoaCadastrada(Pessoa pessoa) {
		String info = "";
		
		if (treinamento.getParticipantes().contains(pessoa)) {
			Evento evento1 = treinamento.getPrimeiroEvento();
			Evento evento2 = treinamento.getSegundoEvento();
			
			info += pessoa + "\n";
			
			if (evento1.getPessoas().contains(pessoa)) {
				info += "Sala no Evento 1: " + buscarSalaDaPessoa(evento1, pessoa) + "\n";
			}
			
			if (evento2.getPessoas().contains(pessoa)) {
				info += "Sala no Evento 2: " + buscarSalaDaPessoa(evento2, pessoa) + "\n";
			}
			
			if (evento1.getPessoas().contains(pessoa)) {
				info += "Sala de Café no Evento 1: " +  buscarSalaDeCafeDaPessoa(evento1, pessoa) + "\n";
			}
			
			if (evento2.getPessoas().contains(pessoa)) {
				info += "Sala de Café no Evento 2: " +  buscarSalaDeCafeDaPessoa(evento2, pessoa) + "\n";
			}
			
			return info;
		}
		
		return "Pessoa não cadastrada nesse treinamento";
	}
	
	
	
	private SalaEvento buscarSalaDaPessoa(Evento evento, Pessoa pessoa) {
		if (evento.getSalaEvento().getPessoas().contains(pessoa))
			return evento.getSalaEvento();
		else if (evento.getSalaEvento2().getPessoas().contains(pessoa))
			return evento.getSalaEvento2();
		
		return null;
	}
	
	private SalaCafe buscarSalaDeCafeDaPessoa(Evento evento, Pessoa pessoa) {
		if (evento.getSalaCafe().getPessoas().contains(pessoa))
			return evento.getSalaCafe();
		else if (evento.getSalaCafe2().getPessoas().contains(pessoa))
			return evento.getSalaCafe2();
		
		return null;
	}

}
