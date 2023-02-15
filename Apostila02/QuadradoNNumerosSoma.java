import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuadradoNNumerosSoma {
    
    public class Quadrado{
        static int quadrado (int n){
            int resultado;
            resultado = n*n;
            return resultado;
        }
    }

    public class Soma4{
        static int soma4 (int n1, int n2, int n3, int n4){
            int soma = n1+n2+n3+n4;
            return soma;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeDigitar = 0;
        List<Integer> numeros = new ArrayList<Integer>();
        int sum = 0;

        System.out.print("Quantos números você gostaria de digitar: ");
        quantidadeDigitar = scanner.nextInt();

        for (int i=0; i < quantidadeDigitar; i++){
            System.out.print("Digite o proxímo número: ");
            int n = scanner.nextInt();
            numeros.add(n);
        }

        for (int i=0; i< quantidadeDigitar; i++){
            int NQuadrado = Quadrado.quadrado(numeros.get(i));
            sum += NQuadrado;
        }

        System.out.print("A conta com os " + numeros + " é igual a: " + sum);

        scanner.close();
    }
}
