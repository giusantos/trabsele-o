package main;

import java.util.Scanner;

import controller.PessoaController;
import controller.SalaController;
import model.dao.PessoaDao;
import model.dao.TreinamentoDao;
import model.entity.Evento;
import model.entity.Pessoa;
import model.entity.SalaCafe;
import model.entity.SalaEvento;
import model.entity.Treinamento;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		

		Evento primeiroEvento = new Evento();
		Evento segundoEvento = new Evento();

		Treinamento treinamento = TreinamentoDao.TREINAMENTO;

		PessoaController pessoaController = new PessoaController();
		SalaController salaController = new SalaController();
		
//		System.out.println("************************");
//		System.out.println("MENU DO TREINAMENTO: ");
//		System.out.println("************************");
//		System.out.println("************************");
//		System.out.println("************************");
//		System.out.println("Informe a sala 1: ");
//		System.out.println("************************");
//		
//		String nomeSala1;
//		
//		nomeSala1 = scan.next();
//		
//		System.out.println("Informe a lotação máxima da sala 1: ");
//		
//		int lotacaoSala1 = scan.nextInt(); 
//		SalaEvento salaEvento1 = new SalaEvento(nomeSala1, lotacaoSala1);
//		salaController.addSalaEvento1(salaEvento1);
//				
//		System.out.println("Informe a sala 2: ");
//		
//		String nomeSala2 = scan.next(); 
//		
//		System.out.println("Informe a lotação máxima da sala 2: ");
//		
//		int lotacaoSala2 = scan.nextInt(); 
//		SalaEvento salaEvento2 = new SalaEvento(nomeSala2, lotacaoSala2); 
//		salaController.addSalaEvento2(salaEvento2);
//
//		System.out.println("Informe a sala de café 1: ");
//		
//		String nomeSalaC1 = scan.next(); 
//		
//		System.out.println("Informe a lotação máxima da sala de café 1: ");
//		
//		int lotacaoC1 = scan.nextInt(); 
//		
//		SalaCafe salaCafe = new SalaCafe(nomeSalaC1, lotacaoC1); 
//		salaController.addSalaCafe(salaCafe);
//
//		System.out.println("Informe a sala de café 2: ");
//		
//		String nomeSalaC2 = scan.next(); 
//		
//		System.out.println("Informe a lotação máxima da sala de café 2: ");
//		
//		int lotacaoC2 = scan.nextInt(); 
//		
//		SalaCafe salaCafe2 = new SalaCafe(nomeSalaC2, lotacaoC2); 
//		salaController.addSalaCafe2(salaCafe2);
		
		criaDadosFalsos();
		int opcao = -1;
		
		while (opcao != 4) {

			System.out.println("************************");
			System.out.println("MENU DO TREINAMENTO: Selecione uma opção ");
			System.out.println("************************");
			System.out.println("************************");
			System.out.println("1 - Cadastrar Participantes: ");
			System.out.println("************************");
			System.out.println("2 - Consultar: ");
			System.out.println("************************");
			System.out.println("3 - Sair: ");
			System.out.println("************************");
			System.out.println("************************");

			opcao = scan.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("Informe o nome do participante: ");
				
				String nome = scan.next(); 
				
				System.out.println("Informe o sobrenome do participante: ");
				
				String sobrenome = scan.next(); 

				Pessoa novaPessoa = new Pessoa();
				novaPessoa.setNome(nome);
				novaPessoa.setSobrenome(sobrenome);
				
				System.out.println(pessoaController.cadastrarPessoa(novaPessoa));
				
				break;
			case 2:
				System.out.println("************************");
				System.out.println("CONSULTAR: ");
				System.out.println("************************");
				System.out.println("************************");
				System.out.println("1 - Todos os Participantes: ");
				System.out.println("************************");
				System.out.println("2 - Participante por ID: ");
				System.out.println("************************");
				System.out.println("3 - Salas: ");
				System.out.println("************************");
				System.out.println("4 - Voltar: ");
				System.out.println("************************");
				System.out.println("************************");

				int consulta = scan.nextInt();

				switch (consulta) {
				case 1:
					for (Pessoa pessoa : treinamento.getParticipantes())
						System.out.println(pessoa + "\n");
					break;
				case 2:
					System.out.println("Insira o ID da pessoa:");
					int id = scan.nextInt();
					System.out.println(pessoaController.getPessoaPorId(id));
					break;
				case 3:
					System.out.println(salaController.getPessoasPorSala());
					break;
				case 4:
					break;
				default:
					System.out.println("Opção inválida");
				}
				break;
			case 3:
				break;
			default:
				System.out.println("Opção inválida");
			}
		}
	}

	static void criaDadosFalsos() {
		Treinamento treinamento = TreinamentoDao.TREINAMENTO;
		PessoaController pessoaController = new PessoaController();
		SalaController salaController = new SalaController();

		SalaCafe salaCafe1 = new SalaCafe();
		salaCafe1.setNome("Sala de café vermelha");
		salaCafe1.setLotacao(2);

		SalaCafe salaCafe2 = new SalaCafe();
		salaCafe2.setNome("Sala de café azul");
		salaCafe2.setLotacao(2);

		SalaEvento salaEvento1 = new SalaEvento();
		salaEvento1.setNome("Sala Evento verde");
		salaEvento1.setLotacao(2);

		SalaEvento salaEvento2 = new SalaEvento();
		salaEvento2.setNome("Sala Evento roxa");
		salaEvento2.setLotacao(2);

		salaController.addSalaCafe(salaCafe1);
		salaController.addSalaCafe2(salaCafe2);

		salaController.addSalaEvento1(salaEvento1);
		salaController.addSalaEvento2(salaEvento2);

		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Gabriel");
		pessoa1.setSobrenome("Jesus");

		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("João");
		pessoa2.setSobrenome("Vitor");

		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("Julia");
		pessoa3.setSobrenome("Maria");

		Pessoa pessoa4 = new Pessoa();
		pessoa4.setNome("Mariana");
		pessoa4.setSobrenome("da Silva");

		pessoaController.cadastrarPessoa(pessoa1);
		pessoaController.cadastrarPessoa(pessoa2);
		pessoaController.cadastrarPessoa(pessoa3);
		pessoaController.cadastrarPessoa(pessoa4);
	}

}