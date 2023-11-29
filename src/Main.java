import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       String nombre, ciudad;
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        nombre = sc.nextLine();

        System.out.println("Hola, " + nombre);

    }
}