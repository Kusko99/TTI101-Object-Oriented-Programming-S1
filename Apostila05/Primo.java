import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        int numero, divisores=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        for(int i = 1; i <= numero;i++){
            if(numero%i == 0){
                divisores +=1;
            }
        }
        if(divisores <= 2){
            System.out.print(numero + " é primo");
        }else{
            System.out.print(numero + " não é primo");
        }
        scanner.close();
    }
}
