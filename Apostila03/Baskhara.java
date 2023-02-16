import java.util.Scanner;
import java.lang.Math;
public class Baskhara {
    public static void main(String[] args) {
        double a,b,c,delta, raiz1, raiz2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o coeficente a: ");
        a = scanner.nextDouble();
        System.out.print("Digite o coefiecente b: ");
        b = scanner.nextDouble();
        System.out.print("Digite o coeficente c: ");
        c = scanner.nextDouble();
        delta = Math.sqrt(Math.pow(b,2)-4.*a*c);

        if(delta < 0){
            System.out.print("Não há raízes");
        }else{
            if(delta == 0){
                raiz1 = (-b*delta)/(2*a);
                System.out.println("A somente uma raiz");
                System.out.print("A raiz é: " + raiz1);
            }else{
                raiz1 = (-b*delta)/(2*a);
                raiz2 = (-b*(-delta))/(2*a);
                System.out.println("A duas raízes");
                System.out.print("As raízes são: " + raiz1 + " e " + raiz2);
            }
        }

        scanner.close();
    }
}
