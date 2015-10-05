
package figure;


public class SuperCuad {

    public double iLenght = 1;
    public double iWidth = 1;
      
    
        public void setLenght(double Lenght){
            this.iLenght = Lenght;
        }
        public double getLenght(){
            return iLenght;
        }
        public void setWidth(double Width){
            this.iWidth = Width;
        }
        public double getWidth(){
            return iWidth;
        }
        public double perimeter(double x, double y){
        return x+x+y+y;
    }
         
       public double area(double s, double t) 
    {
        return s*t;
    
    }
       
       
	}
