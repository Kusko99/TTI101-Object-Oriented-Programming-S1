import java.util.Scanner;
public class BigBoy {
    public static void main(String[] args) {
        int numero, soma = 0, quantidade = 0, maior = Integer.MAX_VALUE, menor = Integer.MIN_VALUE, media;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if(numero > 0){
                soma += numero;
                quantidade += 1;
                if(numero > maior){
                    maior = numero;
                }
                if(numero < menor){
                    menor = numero;
                }
            }
        }while(numero > 0);
        media = soma/quantidade;
        scanner.close();
        System.out.println("A soma é: " + soma);
        System.out.println("A quantidade é: " + quantidade);
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
        System.out.println("A média é: " + media);
    }
}
