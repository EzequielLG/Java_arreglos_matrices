// Autor: LozanoSoft

import java.io.*;
import java.util.Scanner;

class EjercicioTres{

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in); // Lector de datos
    int sum = 0;

    for(int i = 0; i < 10; i++){

      int num = scanner.nextInt(); // Entrada de un número
      sum += num;

    }

    System.out.println();

    if(sum > 100){

      int[] arrayValues = new int[5];

      for(int i = 0; i < 5; i++){

        arrayValues[i] = 50 - (5 * i);
        System.out.println(arrayValues[i]);

      }

    }
    else{

      int[] arrayValues = new int[8];

      for(int i = 0; i < 8; i++){

        arrayValues[i] = 30 - (3 * i);
        System.out.println(arrayValues[i]);

      }

    }

  }

}
