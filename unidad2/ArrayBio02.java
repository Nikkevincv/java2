package unidad2;

public class ArrayBio02 {
    public static void main(String[] args) {
        int fila,columna; //i,j
        int[][] n = {{20,4},{67,33},{0,7}};

        for (fila  = 0; fila < 3; fila++) {
            System.out.print("fila" + fila);
            for (columna = 0; columna < 2; columna++){
                System.out.printf("%10d",n[fila][columna]);
            }
            System.out.println();
        }
    }
}
