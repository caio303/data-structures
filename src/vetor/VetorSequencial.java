package vetor;

import java.util.Arrays;

public class VetorSequencial {
	
	private Aluno[] alunos = new Aluno[100];
	
	private int totalDeAlunos = 0;

	// O(1)
	public void adicionar(Aluno novoAluno) {
		this.garantirEspaco();
		
		alunos[totalDeAlunos] = novoAluno;
		this.totalDeAlunos++;
	}
	
	// O(n)
	public void adicionar(int posicao, Aluno novoAluno) {
		this.garantirEspaco();
		
		if(!posicaoValida(posicao)) throw new IllegalArgumentException("posicao invalida");
		
		for(int i = totalDeAlunos; i > posicao; i--) {
			alunos[i] = alunos[i - 1];
		}
		
		alunos[posicao] = novoAluno;
		this.totalDeAlunos++;
	}

	// O(n)
	public void remover(int posicao) {
		for(int i = posicao; i <= totalDeAlunos; i++) {
			this.alunos[i] = this.alunos[i + 1];
		}
		this.totalDeAlunos--;
	}
	
	// O(n)
	public boolean contem(Aluno aluno) {
		for(int i=0; i<totalDeAlunos; i++) {
			if(this.alunos[i].equals(aluno)) return true;
		}
		return false;
	}
	
	// O(1)
	public Aluno pegar(int posicao) {
		if(!this.posicaoOcupada(posicao)) throw new IllegalArgumentException("posicao invalida");
		
		return this.alunos[posicao];
	}
	
	public int tamanho() {
		return this.totalDeAlunos;
	}

	// Adaptar tamanho do vetor
	private void garantirEspaco() {
		if(totalDeAlunos == this.alunos.length) {
			Aluno[] novoVetor = new Aluno[this.alunos.length * 2];
			for(int i=0; i<this.alunos.length;i++) {
				novoVetor[i] = this.alunos[i];
			}
			this.alunos = novoVetor;
		}
	}
	
	private boolean posicaoValida(int posicao) {
		return posicao >= 0 && posicao <= totalDeAlunos;
	}
	
	private boolean posicaoOcupada(int posicao) {
		return posicao >= 0 && posicao < totalDeAlunos;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(alunos);
	}
}
