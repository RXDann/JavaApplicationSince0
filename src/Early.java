
/**
 * @author rxdann
 */
import java.util.Scanner;

public class Early {

    public static void main(String[] args) {

        System.out.print("Digite seu nome:");
        Scanner nm = new Scanner(System.in);
        System.out.println("\nOlá" + "," + nm.next() + "!"
                + "\nO que deseja fazer?\n"
                + "1 - Calcular a média de sua notas.\n"
                + "2 - Lançar moeda.\n"
        );
        System.out.print("Digite sua opção:");
        Scanner op = new Scanner(System.in);
        switch (op.next()) {
            case "1":
                System.out.println("\nOpção 1.\n");
                break;
            case "2":
                System.out.println("\nOpção 2.\n");
                break;
            default:
                System.out.println("Não válido!");
        }

    }

}