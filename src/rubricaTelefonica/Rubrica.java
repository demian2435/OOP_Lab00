package rubricaTelefonica;

import java.util.ArrayList;
import java.util.List;

public class Rubrica {
	private String nome;
	private List<Contatto> rubrica;

	public Rubrica(String nome) {
		this.nome = nome;
		rubrica = new ArrayList<Contatto>();
		rubrica.add(new Contatto("", "", 0));
	}

	public String getName() {
		return nome;
	}

	public String first() {
		return rubrica.get(1).toString();
	}

	public void add(String nome, String cognome, int numero) {
		rubrica.add(new Contatto(nome, cognome, numero));
	}

	public String get(int index) {
		return rubrica.get(index).toString();
	}

	public String find(String cerca) {
		for (Contatto c : rubrica) {
			if (c.getNome().equals(cerca)) {
				return c.toString();
			} else if (c.getCognome().equals(cerca)) {
				return c.toString();
			} else if (Integer.toString(c.getNumero()).equals(cerca)) {
				return c.toString();
			}
		}
		return "Nessun contatto corrispondente";
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();

		result.append("(");
		for (int i = 1; i < rubrica.size(); i++) {
			if (i == rubrica.size() - 1) {
				result.append(rubrica.get(i));
			} else {
				result.append(rubrica.get(i) + ", ");
			}
		}
		result.append(")");

		return result.toString();
	}

}
