import java.util.Scanner;

public class TwoWord {
    public static void main(String[] args) {
        String stringA, stringB, mainString;
        int indexSpace;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite duas palavras: ");
        mainString = scanner.nextLine();
        indexSpace = mainString.lastIndexOf(" ");
        stringA = mainString.substring(0, indexSpace);
        stringB = mainString.substring(indexSpace+1,mainString.length());
        System.out.println(stringA);
        System.out.print(stringB);

        scanner.close();
    }
}
