
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        int esimene = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int teine = Integer.valueOf(scanner.nextLine());
        System.out.println(esimene + " + " + teine + " = " + (esimene + teine));
        System.out.println(esimene + " - " + teine + " = " + (esimene - teine));
        System.out.println(esimene + " * " + teine + " = " + (esimene * teine));
        System.out.println(esimene + " / " + teine + " = " + ((esimene * 1.0) / (teine * 1.0)));

    }
}
