package view;
import controller.ControllerParesVetor;

public class PublicParesVetor {

	public static void main(String[] args) {
		int vet[] = {6, 5, 8, 9, 10};
		int tamanho = vet.length;
		
		ControllerParesVetor cp = new ControllerParesVetor();
		
		int res = cp.SomaPares(vet, tamanho);
		System.out.println(res);

	}

}
