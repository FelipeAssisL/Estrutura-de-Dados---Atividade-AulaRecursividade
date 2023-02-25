package View;
import Controller.OperacoesController;

public class Main {

	public static void main(String[] args) {
		
		OperacoesController OC = new OperacoesController();
		
		int A = 3;
		int B = 4;
		
		int soma = OC.Soma(A, B);
		System.out.println("Resuldado de A * B = " +soma);
		
		int resto = OC.Resto(A, B);
		System.out.println("Resto da divisão de A/B = "+resto);
		
		int vetor[] = {2,7,1,9,6};
		int tamanho = vetor.length;
		int vetorpar = OC.VetorPar(vetor, tamanho);
		
		System.out.println("Quantidade de nºs pares no vetor: "+vetorpar);
	}
}
