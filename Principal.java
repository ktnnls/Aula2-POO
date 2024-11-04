package empresa;

public class Principal {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Mario", "Encanador", new Avaliacao(9,10,3));
		Aluno a2 = new Aluno("Ribamar", "Craki di bola", new Avaliacao(4,1,10));
		
		a1.info();
		a2.info();
		
		
	}
}		
		/*Avaliacao ribamar = new Avaliacao();
		ribamar.n1=8;
		ribamar.n2=3;
		ribamar.n3=7.5;
		Avaliacao jurisclei = new Avaliacao(7,4,10);
				
		System.out.println("================================ MÉDIA ARITMÉTICA DO RIBAMAR: " + ribamar.mediaAritmetica());
		System.out.println("================================ MÉDIA PONDERADA DO RIBAMAR: " + ribamar.mediaPonderada());
		
		System.out.println("================================ MÉDIA ARITMÉTICA DO JURISCLEI: " + jurisclei.mediaAritmetica());
		System.out.println("================================ MÉDIA PONDERADA DO JURISCLEI: " + jurisclei.mediaPonderada());
	}

} */
