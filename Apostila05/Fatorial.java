import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        int fatorial = numero;
        for(int i = fatorial-1; i > 0; i--){
            fatorial = fatorial*i;
        }
        System.out.println("O Fatorial de " + numero + " é " + fatorial);

        scanner.close();
    }
}
