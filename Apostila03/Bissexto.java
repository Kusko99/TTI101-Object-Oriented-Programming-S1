import java.util.Scanner;

public class Bissexto{
    public static void main(String[] args) {
        int ano;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ano: ");
        ano = scanner.nextInt();

        if((ano%4 == 0 && ano%100 != 0) || ano%400 == 0){
            System.out.print("O ano de " + ano + " é bissexto");
        }else{
            System.out.print("O ano de " + ano + " não é bissexto");
        }

        scanner.close();
    }
}