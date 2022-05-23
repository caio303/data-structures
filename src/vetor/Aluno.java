package vetor;

public class Aluno {
	
	public String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno) obj;
		return this.nome.equals(outro.nome);
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
}
