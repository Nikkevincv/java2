package unidad2.ejerciciosNumerosA;
import java.util.Random;
public class ejercicio05 {
    


    public static void main(String[] args) {
        Random random = new Random();
        int contador = 0;

        System.out.println("Generando números aleatorios pares hasta llegar al 24...");

        while (true) {
            int numero = random.nextInt(51) * 2; // Genera un número aleatorio par entre 0 y 100

            System.out.println(numero);
            contador++;

            if (numero == 24) {
                break;
            }
        }

        System.out.println("Se han generado " + contador + " números en total.");
    }
}

