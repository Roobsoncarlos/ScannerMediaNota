package forwhile;
import java.util.Scanner;

public class TabuadaWhile {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.println("Deseja gerar a tabuada de algum numero? ");
        String resposta = s.next();
        exampleWhile(s, resposta);
        System.out.println("Obrigado");
        s.close();
    }
    
    public static void exampleWhile(Scanner s, String resposta) {
        while(resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Digite um numero para gerar a tabuada: ");
            int num = s.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " X " + i + " = " + num * i);
            }
            System.out.println("Deseja gerar novamente a tabuada: ");
            resposta = s.next();
        }
    }
}