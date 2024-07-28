
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int esimene = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int teine = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int kolmas = Integer.valueOf(scanner.nextLine());
        int value = esimene + teine + kolmas;
        System.out.println("The sum of the numbers is " + value );

    }
}
