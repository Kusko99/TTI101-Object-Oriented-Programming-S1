import java.util.Scanner;

public class AreaRetangulo{
    public static void main(String[] args) {
        double base,altura,area;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do Retângulo: ");
        base = scanner.nextDouble();
        System.out.print("Digite a altura do Retângulo: ");
        altura = scanner.nextDouble();
        area = base*altura;
        System.out.print("Area do Retângulo de base " + base + " e altura " + altura + " é: " + area);

        scanner.close();
    }
}