
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int esimene = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int teine = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        int kolmas = Integer.valueOf(scanner.nextLine());
        double vaartus = (esimene + teine + kolmas) / 3.0;
        System.out.println("The average is " + vaartus);
    }
}
