import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExampleList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            int num = input.nextInt();
            numbers.add(num);
        }

        System.out.println("Numbers entered: " + numbers);

        input.close();
    }
}