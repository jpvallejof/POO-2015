
package separanumeros;

import java.util.Scanner;


public class SeparaNumeros {

    public static void main(String[] args) {
       Scanner ingresa = new Scanner(System.in);
       int i,cont;
       double aux, pot, n, digito;
		System.out.println("\nIngrese un número: ");
            n = ingresa.nextDouble();
        
            cont = 1; 
        aux = n;    
    do{
        cont++;
        aux = aux/10;
        System.out.println("\nEl numero tiene: "+ cont+ "digitos");    
    }while(aux>0);
    
    
    	double y;
        y = n;
        int g = 10;
        double m;
    for (i=1; i<cont; i++){
        pot = Math.pow(g, cont-i);
        digito = (y / pot);
        m = digito*pot;
        y = y - m;
        System.out.println("\nEl digito : "+ i+ "es"+digito);
        
    }
    }
    
}

/*public class Separa {

  public static void main(String[] args) {
		
		Scanner ingresa = new Scanner(System.in);

		int numero, d1, d2, d3, d4, d5, c1, c2;

		System.out.println("\nIngrese un número: ");
		numero = ingresa.nextInt();
               
		d1 = numero % 10;
		d2 = numero % 100 / 10;
		d3 = numero % 1000 / 100;
		d4 = numero % 10000 / 1000;
		d5 = numero % 100000 / 10000;

		System.out.println("\nEl número ingresado está compuesto por los siguiente dígitos:\n");
		System.out.printf("%d   %d   %d   %d   %d\n\n", d5, d4, d3, d2, d1);
               
	}

}*/