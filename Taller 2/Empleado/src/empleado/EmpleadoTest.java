
package empleado;


public class EmpleadoTest {
    
    public static void main (String[] args){
	double aumento = 0;
        Empleado EmpleadoUno    = new Empleado("Andres","Guerra",650000);
	Empleado EmpleadoDos    = new Empleado("Gabriela","Puertas",980000);
	Empleado EmpleadoTres   = new Empleado("Pedro","Rodriguez",1100000);
	Empleado EmpleadoCuatro = new Empleado("Rosa","Insuasty",-1890000);
	Empleado EmpleadoCinco  = new Empleado("Indira","Piraquive",12750000);
	
	double salarioMes1  = EmpleadoUno.getSalario();
	double salarioMes2  = EmpleadoDos.getSalario();
	double salarioMes3  = EmpleadoTres.getSalario();
	double salarioMes4  = EmpleadoCuatro.getSalario();
	double salarioMes5  = EmpleadoCinco.getSalario();
			
	salarioMes1 = Empleado.incremento(aumento, salarioMes1);
	salarioMes2 = Empleado.incremento(aumento, salarioMes2);
	salarioMes3 = Empleado.incremento(aumento, salarioMes3);
	salarioMes4 = Empleado.incremento(aumento, salarioMes4);
	salarioMes5 = Empleado.incremento(aumento, salarioMes5);
			
	if (aumento == 0){
        System.out.println("Salario Anual Empleados");
        }
	System.out.printf("Empleado 1: "+EmpleadoUno.getNombre()+" "+EmpleadoUno.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes1*12));
        System.out.printf("Empleado 2: "+EmpleadoDos.getNombre()+" "+EmpleadoDos.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes2*12));
	System.out.printf("Empleado 3: "+EmpleadoTres.getNombre()+" "+EmpleadoTres.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes3*12));
	System.out.printf("Empleado 4: "+EmpleadoCuatro.getNombre()+" "+EmpleadoCuatro.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes4*12));
	System.out.printf("Empleado 5: "+EmpleadoCinco.getNombre()+" "+EmpleadoCinco.getApellido()+" "+"Salario anual: $"+"%.2f\n\n",(salarioMes5*12));
			
	for (int i = 0; i < 5; i++){
	aumento = 10;		
	salarioMes1 = Empleado.incremento(aumento, salarioMes1);
	salarioMes2 = Empleado.incremento(aumento, salarioMes2);
	salarioMes3 = Empleado.incremento(aumento, salarioMes3);
	salarioMes4 = Empleado.incremento(aumento, salarioMes4);
	salarioMes5 = Empleado.incremento(aumento, salarioMes5);
			
	if (aumento == 10){
        System.out.println("Incremento del 10%");
        }
	System.out.printf("Empleado 1: "+EmpleadoUno.getNombre()+" "+EmpleadoUno.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes1*12));
        System.out.printf("Empleado 2: "+EmpleadoDos.getNombre()+" "+EmpleadoDos.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes2*12));
	System.out.printf("Empleado 3: "+EmpleadoTres.getNombre()+" "+EmpleadoTres.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes3*12));
	System.out.printf("Empleado 4: "+EmpleadoCuatro.getNombre()+" "+EmpleadoCuatro.getApellido()+" "+"Salario anual: $"+"%.2f\n",(salarioMes4*12));
	System.out.printf("Empleado 5: "+EmpleadoCinco.getNombre()+" "+EmpleadoCinco.getApellido()+" "+"Salario anual: $"+"%.2f\n\n",(salarioMes5*12));
		}	
	}
}
