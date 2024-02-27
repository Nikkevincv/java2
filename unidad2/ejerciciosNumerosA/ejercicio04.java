package unidad2.ejerciciosNumerosA;
import java.util.Random;
    import java.util.Scanner;
public class ejercicio04 {
    
    

        public static void main(String[] args) {
            Random random = new Random();
            int numeroSecreto = random.nextInt(101); // Genera un número aleatorio entre 0 y 100
            int intentos = 5;
    
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("¡Bienvenido al juego de adivinar el número!");
    
            while (intentos > 0) {
                System.out.print("Introduce un número (entre 0 y 100): ");
                int numeroUsuario = scanner.nextInt();
    
                if (numeroUsuario == numeroSecreto) {
                    System.out.println("¡Felicitaciones! ¡Has adivinado el número secreto!");
                    break;
                } else if (numeroUsuario < numeroSecreto) {
                    System.out.println("El número introducido es menor que el número secreto.");
                } else {
                    System.out.println("El número introducido es mayor que el número secreto.");
                }
    
                intentos--;
                System.out.println("Te quedan " + intentos + " oportunidades.");
            }
    
            if (intentos == 0) {
                System.out.println("¡Has agotado tus oportunidades! El número secreto era: " + numeroSecreto);
            }
    
            scanner.close();
            System.out.println("¡Gracias por jugar!");
        }
    } 
