
package rectangulo;

public class Rectangulo {

   private double largo;
   private double ancho;
   private double area;
   private double perimetro;
        
    public Rectangulo(double largo, double ancho){
         if ((largo <= 0.0) || (largo > 20.0)) {
           System.out.println("Solo valores entre 1 y 20");
                    
        }else{
            if  ((ancho <= 0.0) || (ancho > 20.0)) {
            System.out.println("Solo valores entre 1 y 20");
                 
            }else{            
                this.largo = largo;
                this.ancho = ancho;
    }}}
    public double getPerimetro() {
     return perimetro;
        }
    public void calculaPerimetro(){
        perimetro = largo+largo+ancho+ancho;
    }
         
    public double getArea()  {
        return area;
    }
    public void calculaArea() 
    {
        area = largo*ancho;
    }
     
    public double getLargo(){
        return largo;
    }
    public double getAncho(){
        return ancho;
    }

    public void setLargo(double largo) {
        if ((largo <= 0.0) || (largo > 20.0)) {
           System.out.println("Solo valores entre 1 y 20");
        } else {
            this.largo = largo;
        }

    }
  
    public void setAncho(double ancho) {
        if ((ancho <= 0.0) || (ancho > 20.0)) {
            System.out.println("Solo valores entre 1 y 20");
        } else {
            this.ancho = ancho;
        }
    }
    
public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(1, 1);
        rectangulo.calculaArea();
        rectangulo.calculaPerimetro();
        rectangulo.getPerimetro();
        rectangulo.getArea();
        System.out.println("Area:"+rectangulo.getArea());
        System.out.println("Perimetro:"+rectangulo.getPerimetro());
        }

}