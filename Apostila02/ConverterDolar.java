import java.util.Scanner;

public class ConverterDolar {
    static public void main (String[] args){

        double cotacaoDolar, valorDolar, valorReais;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação atual do Dolár:");
        cotacaoDolar = scanner.nextDouble();

        System.out.print("Digite a quantidade de doláres que gostaria de converter:");
        valorDolar = scanner.nextDouble();
        
        valorReais = valorDolar*cotacaoDolar;
        System.out.println("$" + valorDolar + " doláres na cotação atual de $ " + cotacaoDolar + " é igual a: R$" + valorReais);

        scanner.close();
    }
}
