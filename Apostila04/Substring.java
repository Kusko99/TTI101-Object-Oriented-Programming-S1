import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        int a,b;
        String string;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        string = scanner.nextLine();
        do{
        System.out.print("Digite um número: ");
        a = scanner.nextInt();
        System.out.print("Digite outro número: ");
        b = scanner.nextInt();
        }while(a > b || b > string.length());

        String newString = string.substring(a, b);
        System.out.print(newString);

        scanner.close();
    }
}
