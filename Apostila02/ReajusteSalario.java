import java.util.Scanner;

public class ReajusteSalario{
    public static void main(String[] args) {
        double salario,reajuste;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        salario = scanner.nextDouble();
        System.out.print("DIgite qual será o reajuste em porcentagem: ");
        reajuste = scanner.nextDouble();
        reajuste = reajuste*0.01;
        salario = salario+(salario*reajuste);
        System.out.print("O salário reajustado será de: " + salario);

        scanner.close();
    }
}