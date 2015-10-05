/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figure;



public class TestShapes {
    public static void main(String[] args) {
        Rectangle Uno = new Rectangle();
        Uno.setLenght(3);
        Uno.setWidth(7);
        System.out.println("Rectangulo 1"+"\nÁrea:"+Uno.recarea()+"\nPerímetro: "+Uno.perimeter());
        
        TriangleRectangle Dos = new TriangleRectangle();
        Dos.setBase(5);
        Dos.setHeight(4);
        System.out.println("Triangulo Rectangulo 2"+"\nÁrea:"+Dos.triarea()+"\nPerímetro: "+Dos.triperimeter());
        
        TriangleIsos Tres = new TriangleIsos();
        Tres.setBase(10);
        Tres.setHeight(2);
        System.out.println("Triangulo Isosceles 3"+"\nÁrea:"+Tres.triarea()+"\nPerímetro: "+Tres.isoperimeter());
         
        Paralelogram Cuatro = new Paralelogram();
        Cuatro.setother(8);
        Tres.setHeight(1);
        System.out.println("Triangulo Isosceles 3"+"\nÁrea:"+Cuatro.parea()+"\nPerímetro: "+Cuatro.pperimeter());
        
    
}
}
