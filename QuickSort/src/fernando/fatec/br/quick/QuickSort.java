package fernando.fatec.br.quick;

public class QuickSort {
	
	public QuickSort() {
		super();
	}
	
	public void ordenar(int[] vet, int ini, int fim) {
		if (ini < fim) {
			int pivo = dividir(vet, ini, fim);
			ordenar(vet, ini, pivo - 1);
			ordenar(vet, pivo + 1, fim);
		}
	}
 	
	private int dividir(int[] vetor, int inicio, int fim) {
		
		int pivo = vetor[inicio];
		
		int pontEsquerda = inicio + 1;
		int pontDireita = fim;
		
		while(pontEsquerda <= pontDireita) {
			while(pontEsquerda <= pontDireita && vetor[pontEsquerda] <= pivo) {
				pontEsquerda++;
			}
			
			while(pontEsquerda <= pontDireita && vetor[pontDireita] >= pivo) {
				pontDireita--;
			}
			
			if(pontEsquerda < pontDireita) {
				trocar(vetor, pontEsquerda, pontDireita);
				pontEsquerda++;
				pontDireita--;
			}
		}
		
		trocar(vetor, inicio, pontDireita);
		return pontDireita;
	}

	private void trocar(int[] vt, int i, int j) {
		int temp = vt[i];
		vt[i] = vt[j];
		vt[j] = temp;
	}
}