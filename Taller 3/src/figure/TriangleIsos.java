/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;

public class TriangleIsos extends SuperTriangle{
        
        public double isoperimeter(){
            double h;
            h = Math.sqrt(Math.pow(this.iBase, 2)+Math.pow(this.iHeight, 2));
            return this.iBase + 2*h;
	}
        
}
