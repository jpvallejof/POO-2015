/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;


    public class Rectangle extends SuperCuad{

    
	public double perimeter(){
		return super.perimeter(this.iLenght, this.iWidth);
	}
        public double recarea(){
		return super.area(this.iLenght, this.iWidth);
	}
       }
    

