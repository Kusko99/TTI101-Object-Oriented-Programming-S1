import java.util.Scanner;

public class IdadeDias {
    public static void main(String[] args) {
        int idadeDias, idadeAnos;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua idade em anos: ");
        idadeAnos = scanner.nextInt();

        idadeDias = idadeAnos*365;
        System.out.print("Sua idade em dias é igual a: " + idadeDias);
        
        scanner.close();
    }
}
