package controller;

import model.dao.TreinamentoDao;
import model.entity.AbstractSala;
import model.entity.Evento;
import model.entity.SalaCafe;
import model.entity.SalaEvento;
import model.entity.Treinamento;

public class SalaController {
	
	private Treinamento treinamento = TreinamentoDao.TREINAMENTO;
	
	public void addSalaEvento1(SalaEvento sala) {
		treinamento.getPrimeiroEvento().setSalaEvento(sala);
		
		SalaEvento copiaSala = new SalaEvento();
		copiaSala.setNome(sala.getNome());
		copiaSala.setLotacao(sala.getLotacao());
				
		treinamento.getSegundoEvento().setSalaEvento(copiaSala);
	}
	
	public void addSalaEvento2(SalaEvento sala) {
		treinamento.getPrimeiroEvento().setSalaEvento2(sala);
		
		SalaEvento copiaSala = new SalaEvento();
		copiaSala.setNome(sala.getNome());
		copiaSala.setLotacao(sala.getLotacao());
				
		treinamento.getSegundoEvento().setSalaEvento2(copiaSala);
	}
	
	public void addSalaCafe(SalaCafe sala) {
		treinamento.getPrimeiroEvento().setSalaCafe(sala);
		
		SalaCafe copiaSala = new SalaCafe();
		copiaSala.setNome(sala.getNome());
		copiaSala.setLotacao(sala.getLotacao());
				
		treinamento.getSegundoEvento().setSalaCafe(copiaSala);
	}
	
	public void addSalaCafe2(SalaCafe sala) {
		treinamento.getPrimeiroEvento().setSalaCafe2(sala);
		
		SalaCafe copiaSala = new SalaCafe();
		copiaSala.setNome(sala.getNome());
		copiaSala.setLotacao(sala.getLotacao());
				
		treinamento.getSegundoEvento().setSalaCafe2(copiaSala);
	}
	
	public String getPessoasPorSala(){
		String pessoasDaSala = "";
		
		Evento evento = treinamento.getPrimeiroEvento();
		Evento evento2 = treinamento.getSegundoEvento();
		
		pessoasDaSala += "Salas do Evento 1: \n";
		pessoasDaSala += "Sala 1: " + buscarPessoasDaSala(evento, evento.getSalaEvento()) + "\n";
		pessoasDaSala += "Sala 2: " + buscarPessoasDaSala(evento, evento.getSalaEvento2()) + "\n";
		
		pessoasDaSala += "Salas do Evento 2: \n";
		pessoasDaSala += "Sala 1: " + buscarPessoasDaSala(evento2, evento2.getSalaEvento()) + "\n";
		pessoasDaSala += "Sala 2: " + buscarPessoasDaSala(evento2, evento2.getSalaEvento2()) + "\n";
		
		pessoasDaSala += "Salas de Café do Evento 1: \n";
		pessoasDaSala += "Café 1: " + buscarPessoasDaSala(evento, evento.getSalaCafe()) + "\n";
		pessoasDaSala += "Café 2: " + buscarPessoasDaSala(evento, evento.getSalaCafe2()) + "\n";
		
		pessoasDaSala += "Salas de Café do Evento 2: \n";
		pessoasDaSala += "Café 1: " + buscarPessoasDaSala(evento2, evento2.getSalaCafe()) + "\n";
		pessoasDaSala += "Café 2: " + buscarPessoasDaSala(evento2, evento2.getSalaCafe2()) + "\n";
		
		return pessoasDaSala;
	}
	
	private String buscarPessoasDaSala(Evento evento, AbstractSala sala) {
		if (evento.getSalaCafe().equals(sala)) {
			return evento.getSalaCafe().getPessoas().toString();
			
		} else if (evento.getSalaCafe2().equals(sala)) {
			return evento.getSalaCafe2().getPessoas().toString();
		}
		if (evento.getSalaEvento().equals(sala)) {
			return evento.getSalaEvento().getPessoas().toString();
			
		} else if (evento.getSalaEvento2().equals(sala)) {
			return evento.getSalaEvento2().getPessoas().toString();
		}
		
		return "Nada encontrado";
	}
}
