package primos;

import java.util.Scanner;

public class Primos {

  
    public static void main(String[] args) {
           
        int numero;
   Scanner a = new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        numero = a.nextInt();
    
 
    int arreg[] = new int[numero];
        for(int cont = 2;cont<numero;cont++){
          arreg[cont] = cont;
          
        }
        for(int cont = 2;cont<numero;cont++){
            if(arreg[cont]!=0){
          for(int aux=2*cont;aux<numero;aux=aux+cont){
              arreg[aux]=0;
          }
          
        }
        }
        for(int cont = 2;cont<numero;cont++){
        if(arreg[cont] != 0 ){
          System.out.println(arreg[cont]+"\n");
        }
}

}
    }
    




