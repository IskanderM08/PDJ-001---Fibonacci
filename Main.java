// Problema: Realizar un programa que por medio de la recursividad genere los números de la sucesión de Fibonacci según la posición indicada.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int repetidor = 1, continuar, posicion = -1, i = 0;

    System.out.println("Bienvenido al programa diseñado para obtener los números de la sucesión de Fibonacci");

    do {
      do {
        continuar = 2;
        System.out.println(
            "Ingrese la posición de un número de la sucesión de Fibonacci para obtener todos los números hasta esa posición: ");

        try {
          posicion = reader.nextInt();
          if (posicion < 0) {
            System.out.println("Error, Debe ingresar un número entero mayor a -1");
          }
        } catch (Exception e) {
          System.out.println("Error, Debe ingresar un número entero mayor a -1");
          reader.next();
        }
      } while (posicion < 0);

      posicion++;

      do {
        System.out.println(fibonacci(i));
        i++;
      } while (i < posicion);

      do {
        i = 0;
        posicion = -1;
        System.out.println("¿Desea repetir el programa?");
        System.out
            .println("Teclee (1) para repetir el programa\nTeclee cualquier número entero excepto (1) para salir");

        try {
          repetidor = reader.nextInt();
          if (repetidor == 1) {
            continuar = 3;
          } else {
            continuar = 3;
          }
        } catch (Exception e) {
          System.out.println("Error, Debe ingresar un número entero como opción para repetir o salir ");
          reader.next();
        }
      } while (continuar == 2);

    } while (repetidor == 1);
  }

  public static int fibonacci(int posicion) {
    if (posicion == 0) {
      return 0;
    } else {
      if (posicion == 1) {
        return 1;
      } else {
        return fibonacci(posicion - 1) + fibonacci(posicion - 2);
      }

    }
  }

}
