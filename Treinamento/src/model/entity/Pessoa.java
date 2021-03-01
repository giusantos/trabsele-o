package model.entity;

public class Pessoa extends AbstractEntity {
	
	private static int increment = 0;
	
	private String nome;
	private String sobrenome;

	public Pessoa() {							/** const **/
		incrementId();
	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;		
		incrementId();
	}											/** const **/

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private void incrementId() {
		id = increment;
		increment++;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + ", nome: " + nome + " " + sobrenome;
	}
}