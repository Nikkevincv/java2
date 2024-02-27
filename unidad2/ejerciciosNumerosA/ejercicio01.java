package unidad2.ejerciciosNumerosA;
import java.util.Random;
public class ejercicio01 {

    public static void main(String[] args) {
        String[] palos = {"picas", "corazones", "diamantes", "tréboles"};
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        Random random = new Random();
        int paloIndex = random.nextInt(palos.length);
        int cartaIndex = random.nextInt(cartas.length);

        String palo = palos[paloIndex];
        String carta = cartas[cartaIndex];

        System.out.println("La carta seleccionada al azar es: " + carta + " de " + palo);
    }
}

