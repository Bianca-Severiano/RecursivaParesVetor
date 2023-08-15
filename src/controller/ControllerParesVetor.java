package controller;

public class ControllerParesVetor {

	public ControllerParesVetor() {
		super();
	}
	
	public int SomaPares (int vet[], int tamanho) {
		int cont = 0;
		if (tamanho == 0) { // Parada: Quando vetor não tiver mais posições a serem consideradas retornaaa 0 para iniciar soma dos pares
			return cont;
		} else {
		    tamanho--;
		    cont = SomaPares(vet, tamanho);
		    if (vet[tamanho]%2 == 0) { // Verifica se valor retornado da função é divisivel por 2 e caso seja soma 1 ao contador, caso não retorna 0 para a soma pois valor não é par
		    	return cont + 1;
		    } else {
		    	return cont;
		    }
		}
		
	}
}
