package atm;
import java.util.Scanner;

public class ATM {

    public void BBilletes(int cantidad){
    int CincuentaMil = 0;
    int VeinteMil = 0;
    int DiezMil = 0;
    int CincoMil = 0;
    int DosMil = 0;
    int Mil = 0;
    int Quin = 0;
    int Dos = 0;
    int Cien = 0;
    int Cinc = 0;
    
    CincuentaMil = cantidad/50000;
    cantidad=cantidad -(CincuentaMil*50000);
    VeinteMil = cantidad/20000;
    cantidad=cantidad -(VeinteMil*20000);
    DiezMil = cantidad/10000;
    cantidad=cantidad -(DiezMil*10000);
    CincoMil = cantidad/5000;
    cantidad=cantidad -(CincoMil*5000);
    DosMil = cantidad/2000;
    cantidad=cantidad -(DosMil*2000);
    Mil = cantidad/1000;
    cantidad=cantidad -(Mil*1000);
    Quin = cantidad/500;
    cantidad=cantidad -(Quin*500);
    Dos = cantidad/200;
    cantidad=cantidad -(Dos*200);
    Cien = cantidad/100;
    cantidad=cantidad -(Cien*100);
    Cinc = cantidad/50;
    cantidad=cantidad -(Cinc*50);
    
    System.out.println();
    if(CincuentaMil>0){
        System.out.println("Billetes de 50 Mil:"+CincuentaMil);
    }
    if(VeinteMil>0){
        System.out.println("Billetes de 20 Mil:"+VeinteMil);
    }
    if(DiezMil>0){
        System.out.println("Billetes de 10 Mil:"+DiezMil);
    }
    if(CincoMil>0){
        System.out.println("Billetes de 5 Mil:"+CincoMil);
    }
    if(DosMil>0){
        System.out.println("Billetes de 2 Mil:"+DosMil);
    }
    if(Mil>0){
        System.out.println("Billetes de Mil:"+Mil);
    }
    if(Quin>0){
        System.out.println("Monedas de Quinientos:"+Quin);
    }
    if(Dos>0){
        System.out.println("Monedas de Doscientos:"+Dos);
    }
    if(Cien>0){
        System.out.println("Monedas de Cien:"+Cien);
    }
    if(Cinc>0){
        System.out.println("Monedas de Cincuenta:"+Cinc);
    }
    
    
}
    public static void main(String[] args) {
        
         Scanner a = new Scanner(System.in);
        System.out.println("ingrese el numero: ");
        int numero = a.nextInt();
        ATM cajero = new ATM();
        cajero.BBilletes(numero);
    }
    
}
