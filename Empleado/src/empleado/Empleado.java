
package empleado;


public class Empleado {

    String nombre;
    String apellido;
    double salario;
    
    public Empleado(String nombre, String apellido, double salario){
       this.nombre=nombre;
       this.apellido=apellido;
       if(salario<=0){
       this.salario=0;
       }else{
       this.salario=salario;
       }
    }   
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public void setSalario(double salario){
        this.salario=salario;
    }
    public String getNombre(){
	return nombre;
    }
	
    public String getApellido(){
    return apellido;

    }
    public double getSalario(){
    return salario;
    }
    
    public static double incremento(double aumento, double salario){
    return salario*(1+aumento/100);
        
    }
}
   
    

