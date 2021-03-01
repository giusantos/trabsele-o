package controller;

import model.dao.EventoDao;
import model.dao.PessoaDao;
import model.dao.TreinamentoDao;
import model.entity.Pessoa;
import model.entity.Treinamento;

public class PessoaController {
	
	private EventoDao eventoDao = new EventoDao();
	private TreinamentoDao treinamentoDao = new TreinamentoDao();
	private Treinamento treinamento = TreinamentoDao.TREINAMENTO;
	private PessoaDao pessoaDao = new PessoaDao();
	
	public String cadastrarPessoa(Pessoa pessoa) {
		boolean cadastrouNoPrimeiroEvento = eventoDao.cadastrarPessoaNaSalaDoEvento(treinamento.getPrimeiroEvento(), pessoa);
		boolean cadastrouNoSegundoEvento = eventoDao.cadastrarPessoaNaSalaDoEvento(treinamento.getSegundoEvento(), pessoa);
		treinamentoDao.misturarSalasDosEventos();
		
		if (cadastrouNoPrimeiroEvento || cadastrouNoSegundoEvento) {
			treinamento.getParticipantes().add(pessoa);
			return "Pessoa Cadastrada";
		}
		
		return "Não foi possível cadastrar";
	}
	
	public String getPessoaPorId(long id) {
		Pessoa pessoa = pessoaDao.getById(id);
		if (pessoa != null) {
			return pessoaDao.getInformacoesDaPessoaCadastrada(pessoa);
		}
		
		return "Nada encontrado";
	}
}
