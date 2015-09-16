package punto.pkg1.taller;
import java.util.*;
        

public class Punto1Taller {


    public static void main(String[] args) {
        
    Scanner num = new Scanner(System.in);                
    int num1, num2;
     
    System.out.println("Ingrese los numeros");
    num1 = num.nextInt();
    num2 = num.nextInt();
    
    if (num1>num2)
    {System.out.println(num1 + " es mayor que " + num2);
    }else{
      System.out.println(num2 + " es mayor que " + num1);
    }
    if(num1%2==0){  
             System.out.println(num1+" es par");  
        }else{  
            System.out.println(num1+" es impar");  
        }        
    if(num2%2==0){  
             System.out.println(num2+" es par");  
        }else{  
            System.out.println(num2+" es impar");  
        }
        int resto;
    
        int mult;
    mult = num1%num2;
     
    if (mult==0){
      System.out.println(num1 + " es múltiplo de " + num2);
    }else{
      System.out.println(num1 + " nO es múltiplo de " + num2);
    }
    }
    
}
