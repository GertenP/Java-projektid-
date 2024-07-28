
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int esimene = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int teine = Integer.valueOf(scanner.nextLine());
        int vaartus = esimene * teine;
        System.out.println(esimene + " * " + teine + " = " + vaartus);

    }
}
