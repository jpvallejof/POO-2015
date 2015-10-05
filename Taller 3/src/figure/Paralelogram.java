/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;

/**
 *
 * @author Vallejo
 */
public class Paralelogram extends SuperCuad{
    public double other = 1;
    //lado del paralelogramo
    
     public void setother(double Other){
            this.other = Other;
        }
        public double getother(){
            return other;
        }
    public double pperimeter(){
	    return super.perimeter(this.other, this.iWidth);
	}
    public double parea(){
	    return this.other*this.iWidth;
	}
}
