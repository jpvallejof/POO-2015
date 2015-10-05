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
public class SuperTriangle {
    public double iBase = 1;
    public double iHeight = 1;
    public double getBase(){
	  return this.iBase;
	}	
	public double getHeight(){
	  return this.iHeight;
	}
	
        public void setBase(double Base){
	  this.iBase = Base; 
		  }
		
	public void setHeight(double Height){
	  this.iHeight = Height; 
}
        public double triarea(){
            return ((this.iBase * this.iHeight)/2);
	}
        
        
}
