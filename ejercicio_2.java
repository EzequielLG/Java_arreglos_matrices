// Autor: LozanoSoft

import java.io.*;
import java.util.Scanner;

class EjercicioDos{

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in); // Lector de datos
    int[] arrayValues = new int[9];

    int sum = 0;

    for(int i = 1; i < 10; i++){

      int num = scanner.nextInt(); // Entrada de un número

      arrayValues[i - 1] = num;
      sum += arrayValues[i - 1];

    }

    System.out.println();

    if(sum > 30){ // Promedio de 3 calificaciones

      float qual_1, qual_2, qual_3, average;

      qual_1 = scanner.nextFloat();
      qual_2 = scanner.nextFloat();
      qual_3 = scanner.nextFloat();

      average = (qual_1 + qual_2 + qual_3) / 3;

      System.out.println("El promedio es: " + average);

    }
    else{ // IVA de una cantidad

      double quantity, iva;

      quantity = scanner.nextFloat();
      iva = quantity * 0.16; // IVA del 16%

      System.out.println("El IVA es: " + iva);

    }

  }

}
