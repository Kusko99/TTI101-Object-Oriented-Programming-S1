import java.util.Scanner;

public class HelloFulano {
    public static void main(String[] args) {
        String nomeCompleto, nome, sobrenome;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu nome e sobrenome: ");
        nomeCompleto = scanner.nextLine();
        
        int espaco = nomeCompleto.lastIndexOf(" ");
        int tamanho = nomeCompleto.length();
        nome = nomeCompleto.substring(0, espaco);
        sobrenome = nomeCompleto.substring(espaco+1,tamanho);

        System.out.print("Olá, " + nome + ".Seu sobrenome é " + sobrenome + ".");
        
        scanner.close();
    }
}
