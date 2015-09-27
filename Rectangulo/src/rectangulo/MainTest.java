
package rectangulo;

public class MainTest {
public static void main(String[] args) {
        Rectangulo Uno = new Rectangulo(1,1);
        Uno.calculaArea();
        Uno.calculaPerimetro();
        System.out.println("Rectangulo 1"+"\nÁrea:"+Uno.getArea()+"\nPerímetro: "+Uno.getPerimetro());
        
        Rectangulo Dos = new Rectangulo(3,7);
        Dos.calculaArea();
        Dos.calculaPerimetro();
        System.out.println("Rectangulo 2"+"\nÁrea:"+Dos.getArea()+"\nPerímetro: "+Dos.getPerimetro());
        
        Rectangulo Tres = new Rectangulo(6,9);
        Tres.calculaArea();
        Tres.calculaPerimetro();
        System.out.println("Rectangulo 3"+"\nÁrea:"+Tres.getArea()+"\nPerímetro: "+Tres.getPerimetro());
         
        Rectangulo Cuatro = new Rectangulo(1,32);
        Cuatro.calculaArea();
        Cuatro.calculaPerimetro();
        System.out.println("Rectangulo 4"+"\nÁrea:"+Cuatro.getArea()+"\nPerímetro: "+Cuatro.getPerimetro());
        
        Rectangulo Cinco = new Rectangulo(6,3);
        Cinco.calculaArea();
        Cinco.calculaPerimetro();
        System.out.println("Rectangulo 5"+"\nÁrea:"+Cinco.getArea()+"\nPerímetro: "+Cinco.getPerimetro());
  
        Rectangulo Seis = new Rectangulo(-1,2);
        Seis.calculaArea();
        Seis.calculaPerimetro();
        System.out.println("Rectangulo 6"+"\nÁrea:"+Seis.getArea()+"\nPerímetro: "+Seis.getPerimetro());
  
        Rectangulo Siete = new Rectangulo(7,9);
        Siete.calculaArea();
        Siete.calculaPerimetro();
        System.out.println("Rectangulo 7"+"\nÁrea:"+Siete.getArea()+"\nPerímetro: "+Siete.getPerimetro());
  
        Rectangulo Ocho = new Rectangulo(0,4);
        Ocho.calculaArea();
        Uno.calculaPerimetro();
        System.out.println("Rectangulo 8"+"\nÁrea:"+Uno.getArea()+"\nPerímetro: "+Uno.getPerimetro());
  
        Rectangulo Nueve = new Rectangulo(6,6);
        Nueve.calculaArea();
        Nueve.calculaPerimetro();
        System.out.println("Rectangulo 9"+"\nÁrea:"+Nueve.getArea()+"\nPerímetro: "+Nueve.getPerimetro());
  
        Rectangulo Diez = new Rectangulo(12,12);
        Diez.calculaArea();
        Diez.calculaPerimetro();
        System.out.println("Rectangulo 10"+"\nÁrea:"+Diez.getArea()+"\nPerímetro: "+Diez.getPerimetro());
  
        }

}

    
