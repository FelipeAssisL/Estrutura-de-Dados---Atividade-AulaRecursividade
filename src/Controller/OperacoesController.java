package Controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}
	
	public int Soma(int A,int B) {
		if (B == 0) { //CONDIÇÃO DE PARADA
			return 0;
		} else {
			B = B-1;
			return A + Soma(A,B); //CHAMADA DA FUNÇÃO
		}
	}
	
	public int Resto(int A, int B) {
		if(A<B) { //CONDIÇÃO DE PARADA
			return A;
		}else {
			A = A - B;
			return Resto(A, B); //CHAMADA DA FUNÇÃO
		}
	}
	
	public int VetorPar(int[]vetor, int tamanho) {
		if(tamanho == 0) { //CONDIÇÃO DE PARADA
			return 0;
		} else {
			int FimVet = tamanho - 1;
			int valor = vetor[FimVet];
			int soma = 0;
			if(valor %2 == 0) {
				soma = soma + 1;
			}
			return soma + VetorPar(vetor, tamanho-1); //CHAMADA DA FUNÇÃO
		}
	}
}
