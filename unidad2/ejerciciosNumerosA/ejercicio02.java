package unidad2.ejercicios6numerosAleatorios;
import java.util.Random;
public class ejercicio02 {
  


    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(11); // Genera un número aleatorio entre 0 y 10
            System.out.print(numero + " ");
        }
    }
}
