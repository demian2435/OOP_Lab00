package rubricaTelefonica;

public class Contatto {

	private String nome;
	private String cognome;
	private int numero;

	public Contatto(String nome, String cognome, int numero) {
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public int getNumero() {
		return numero;
	}

	@Override
	public String toString() {
		return nome + " " + cognome + " " + numero;
	}

}
