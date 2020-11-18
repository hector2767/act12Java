package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Leer {
    private Scanner sc;

    public void Leer() {
        sc = new Scanner(System.in);
    }

    public int pedirInt(String introduce_el_telefono) {

        int num = 0;
        boolean correcto;
        do {
            correcto = true;
            try {
                System.out.println("Introduce un numero entero");
                num = sc.nextInt();
            } catch (InputMismatchException ex) {
                correcto = false;
                sc.next();
            }
            if (!correcto) {
                System.out.println("valor no aceptado, intente de nuevo ");
            }
        } while (!correcto);
        return num;
    }

    public String pedirString(String introduce_el_nombre) {
        System.out.println("Introduce una cadena");
        String cadena = sc.next();
        return cadena;
    }

}
