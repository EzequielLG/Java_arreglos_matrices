// Autor: LozanoSoft

import java.io.*;
import java.util.Scanner;

class EjercicioUno{

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in); // Lector de datos
    int num = scanner.nextInt(); // Entrada de un número

    System.out.println(); // Salto de línea

    if(num > 20){

      int[] arrayValues = new int[9];

      for(int i = 1; i < 10; i++){

        arrayValues[i - 1] = i * 2;
        System.out.println(arrayValues[i - 1]);

      }

    }
    else{

      int[][] matrixValues = new int[6][2];
      int count = 0;

      for(int i = 1; i < 7; i++){

        for(int j = 1; j < 3; j++){
          
          matrixValues[i - 1][j - 1] = ++count * 3;
          System.out.print(matrixValues[i - 1][j - 1] + " ");

        }

        System.out.println();

      }

    }

  }

}
