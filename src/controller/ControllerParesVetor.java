package controller;

public class ControllerParesVetor {

	public ControllerParesVetor() {
		super();
	}
	
	public int SomaPares (int vet[], int tamanho) {
		int cont = 0;
		if (tamanho == 0) { // Parada: Quando vetor n�o tiver mais posi��es a serem consideradas retornaaa 0 para iniciar soma dos pares
			return cont;
		} else {
		    tamanho--;
		    cont = SomaPares(vet, tamanho);
		    if (vet[tamanho]%2 == 0) { // Verifica se valor retornado da fun��o � divisivel por 2 e caso seja soma 1 ao contador, caso n�o retorna 0 para a soma pois valor n�o � par
		    	return cont + 1;
		    } else {
		    	return cont;
		    }
		}
		
	}
}
