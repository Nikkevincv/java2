package unidad2.ejercicios6numerosAleatorios;
import java.util.Random;
public class ejercicio03 {
   
    public static void main(String[] args) {
        Random random = new Random();
        int min = 199;
        int max = 100;
        int suma = 0;

        for (int i = 0; i < 50; i++) {
            int numero = random.nextInt(100) + 100; // Genera un número aleatorio entre 100 y 199
            System.out.print(numero + " ");

            if (numero < min) {
                min = numero;
            }

            if (numero > max) {
                max = numero;
            }

            suma += numero;
        }

        double media = (double) suma / 50;

        System.out.println("\nMínimo: " + min);
        System.out.println("Máximo: " + max);
        System.out.println("Media: " + media);
    }
}

