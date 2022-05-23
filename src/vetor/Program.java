package vetor;

public class Program {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Jorge");
		Aluno a2 = new Aluno("Caio");
		Aluno a3 = new Aluno("Danillo");
		
		VetorSequencial vetor = new VetorSequencial();
		
		vetor.adicionar(a1);
		vetor.adicionar(a2);

		vetor.adicionar(1,a3);
		
		vetor.adicionar(a3);
		
		System.out.println(vetor);
		
		for(int i=0; i<300; i++) {
			vetor.adicionar(new Aluno("Carlos " + i ));
		}
		
		System.out.println(vetor);
		System.out.println(vetor.tamanho());
	}

}
