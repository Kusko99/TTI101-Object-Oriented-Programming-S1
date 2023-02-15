import java.util.Scanner;

public class PositivoNegativoNeutro {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero > 0){
            System.out.print("O número " + numero + " é postivo");
        }else{
            if (numero < 0){
                System.out.print("O número " + numero + " é negativo");
            }else{
                System.out.print("O número " + numero + " é neutro");
            }
        }

        scanner.close();
    }
}
