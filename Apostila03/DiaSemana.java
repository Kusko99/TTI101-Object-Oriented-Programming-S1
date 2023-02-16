import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {

        int dia;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("Digite um número interio entre 1 e 7 para descobrir o dia da semana: ");
            dia = scanner.nextInt();
        }while( dia < 1 || dia > 7);

        switch(dia){
            case 1:
            System.out.print("Domingo pé de cachimbo");
            break;
            case 2:
            System.out.print("Segunda, o pior dia");
            break;
            case 3:
            System.out.print("Um terço de Terça-Feira");
            break;
            case 4:
            System.out.print("Quarta, o meio da semana");
            break;
            case 5:
            System.out.print("Quinta, o dia que não saiu da quinta série");
            break;
            case 6:
            System.out.print("SEXTOUUUU");
            break;
            case 7:
            System.out.print("Sabádo, dia do soninho bão");
            break;
        }

        scanner.close();
        
    }
}
