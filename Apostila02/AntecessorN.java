import java.util.Scanner;

public class AntecessorN {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Digite um valor inteiro: ");
            n = scanner.nextInt();
        }while(n <= 0);

        n =  n -1;
        System.out.print("O antecessor é: " + n);
        
        scanner.close();
    }
}
