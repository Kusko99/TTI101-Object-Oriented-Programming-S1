import java.util.Scanner;

public class Eleitores {
    public static void main(String[] args) {
        int totalEleitores, votosNulos, votosBrancos;
        double porcentagemInvalidos;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade total de eleitores: ");
        totalEleitores = scanner.nextInt();
        System.out.print("Digite a quantidade de votos brancos: ");
        votosBrancos = scanner.nextInt();
        System.out.print("Digite a quantidade de votos nulos: ");
        votosNulos = scanner.nextInt();

        porcentagemInvalidos = ((votosBrancos+votosNulos) * 100)/totalEleitores;
        System.out.print("A a porcentagem de votos nulos e brancos é: " + porcentagemInvalidos + "%");

        scanner.close();
    }
}
