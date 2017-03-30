import java.util.Scanner;
public class NumerosPares {
	public static void main(String[] args) {
		//variavel que vai armazenar o numero maximo
		int maxNumero; //int para numeros inteiros
		String nome; //String para textos
		int contador = 1;
		//o scanner recupera o valor digitado no tecaldo
		Scanner scan = new Scanner(System.in);
		//usamos o syso para printar textos na tela
		System.out.println("Informe seu nome: ");
		//armazenamos o valor digitado na variavel
		//o next sempre acompanha o tipo da variavel
		nome = scan.next();
		//usamos o syso para printar textos na tela
		System.out.println("Usuário digite um número: ");
		//armazenamos o valor digitado na variavel
		//o next sempre acompanha o tipo da variavel
		maxNumero = scan.nextInt();
		//loop iniciando em 1 até maxNumero
		while(contador <= maxNumero) {
			//se o resto da divisão for zero
			if(contador % 2 == 0) {
				//exibe os numeros pares
				System.out.println(contador + " é par");
			} else {
				//se não, exibe os numeros ipares
				System.out.println(contador + " é impar");
			}
			contador++; //incrementando o contador
		}
	}

}
