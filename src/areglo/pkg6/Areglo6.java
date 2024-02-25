package areglo.pkg6;

import java.util.Scanner;

public class Areglo6 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        float numero[] = new float[5];
        System.out.println("Guardando los datos del areglo");
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Digita un numero: ");
            numero[i] = entrada.nextFloat();
        }
        System.out.println("\n Imprimiendo el areglo");
        
        for (float i : numero) {
            System.out.println(i);
        }

    }

}
