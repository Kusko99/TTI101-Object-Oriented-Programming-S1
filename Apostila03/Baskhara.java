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
            if(delta > 0){

            }
        }

        scanner.close();
    }
}
