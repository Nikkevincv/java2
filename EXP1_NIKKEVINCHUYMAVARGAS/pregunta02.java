package EXP1_NIKKEVINCHUYMAVARGAS;

import java.util.Scanner;

public class pregunta02 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int introducciones = 0;
        int numero;
        int numeroAnterior = 0;
        int maxRepeticiones = 0;
        int repeticiones = 0;
        int numeroMasRepetido = 0;

        do {
            System.out.println("Ingrese un número (0 para finalizar): ");
            numero = scanner.nextInt();

            if (numero != 0) {
                introducciones++;

                if (numero == numeroAnterior) {
                    repeticiones++;

                    if (repeticiones > maxRepeticiones) {
                        maxRepeticiones = repeticiones;
                        numeroMasRepetido = numero;
                    }
                } else {
                    repeticiones = 1;
                }

                numeroAnterior = numero;
            }
        } while (numero != 0);

        System.out.println("El número más repetido es el " + numeroMasRepetido + " y se ha escrito " + maxRepeticiones + " veces.");
        System.out.println("Se han realizado un total de " + introducciones + " introducciones.");
    }
}

