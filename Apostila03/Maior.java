import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Maior {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int entradas, maior = 0;

        System.out.print("Quantos números gostaria de digitar: ");
        entradas = scanner.nextInt();

        for(int i = 0; i < entradas ; i++ ){
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            numbers.add(num);
        }

        if(numbers.size() == 1){
            maior = numbers.get(0);
            System.out.print("O maior número da lista " + numbers + " é: " + maior);
        }else{
            for(int i = 0; i < numbers.size()-1; i++){
                if(numbers.get(i) > numbers.get(i+1)){
                    maior = numbers.get(i);
                }else{
                    maior = numbers.get(i+1);
                }
            
            }
            System.out.print("O maior número da lista " + numbers + " é: " + maior);
        }
       

        scanner.close();
    }
}
