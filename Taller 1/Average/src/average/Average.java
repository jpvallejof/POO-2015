package average;

import java.util.Scanner;

public class Average {

    private void promedio(Scanner ingresa){
    int n;
    int sumar = 0;
    int count = 0; 
    
    do{
        n = ingresa.nextInt();
        sumar+= n;
        count++;  
    }while(n!=9999);
    int t = sumar - 9999;
    int u = count - 1;
    System.out.println("El promedio es:  " + t/u);
}
    
  public static void main(String[] args) {
	Scanner ingresa = new Scanner (System.in);
        System.out.println("Ingrese los números (9999 para dejar de ingresar)");
        Average prom = new Average();
        prom.promedio(ingresa);
	}

}