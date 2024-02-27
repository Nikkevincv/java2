package unidad2.ejerciciosNumerosA;
import java.util.Random;
public class ejercicio07 {
    


    public static void main(String[] args) {
        Random random = new Random();

        int dado1, dado2;
        int tiradas = 0;

        do {
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;

            tiradas++;
            System.out.println("Tirada " + tiradas + ": Dado 1 = " + dado1 + ", Dado 2 = " + dado2);
        } while (dado1 != dado2);

        System.out.println("¡Ambos dados tienen el mismo valor después de " + tiradas + " tiradas!");
    }
}

