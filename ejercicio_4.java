// Autor: LozanoSoft

import java.io.*;
import java.util.Scanner;

class EjercicioCuatro{

  public static void main(String args[]){

    Scanner scanner = new Scanner(System.in); // Lector de datos

    float num_1, num_2, num_3, maxNum = 0;
    boolean flag = true;

    num_1 = scanner.nextFloat();
    num_2 = scanner.nextFloat();
    num_3 = scanner.nextFloat();

    if(num_1 > num_2 && num_1 > num_3){
      maxNum = num_1;
    }
    else
    if(num_2 > num_1 && num_2 > num_3){
      maxNum = num_2;
    }
    else
    if(num_3 > num_1 && num_3 > num_2){
      maxNum = num_3;
    }
    else{
      flag = false;
    }

    System.out.println((flag) ? ("El número mayor es: " + maxNum) : "No hay un número que predomine.");

  }

}
