package controleFluxos;
import java.util.Scanner;
public class mediaNota {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		double nota1, nota2, nota3, nota4, media;
		
		System.out.println("Ola digite seu nome:");
		nome = scanner.next();
		System.out.println("Ola " + nome + " seja bem vindo(a)");
		
		System.out.println("Digite a primeira nota: ");
		nota1 = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = scanner.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = scanner.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		nota4 = scanner.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 7) {
			System.out.println("Parabens voce foi aprovado");
		} else if (media >= 5 && media < 6) {
			System.out.println("Recuperacao");
		}else {
			System.out.println("Voce foi reprovado(a)");
		}
		
		scanner.close();
	}

}
