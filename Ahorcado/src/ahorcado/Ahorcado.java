package ahorcado;


import java.util.*;
 
public class Ahorcado {
 
public static void main(String[] args) {

String palabras[]={"musica","saludo","correo","corazon","vehiculo","eucalipto",
    "murcielago"};
String palabraFinal = "";

Scanner entrada=new Scanner(System.in);

String palabraJuego= palabras[(int)(Math.random()*palabras.length)];
String letrasPalabras[] =new String[palabraJuego.length()];
//variable para almacenar los * de la palabra
String palabraOculta="";

//array para separar palabra por letras
String palabraresp[]=new String[palabraJuego.length()];

//pasar a asteriscos
for(int i=0;i<palabraJuego.length();i++){
letrasPalabras[i]=String.valueOf(palabraJuego.charAt(i));
palabraOculta=palabraOculta+"*";
palabraresp[i]="*";
 
}
//Juego inicia
System.out.println("Busque la Palabra:");
System.out.println();
//muestro los asteriscos correspondientes a la palabra oculta
System.out.println(palabraOculta);
 

int vidas=5;
//Letras ingredas por el jugador
String letraIngresada[]=new String[100];

//arreglo
for(int q=0;q<letraIngresada.length;q++){
System.out.println("Ingrese una letra: ");
letraIngresada[q]=entrada.nextLine().toLowerCase();
//Comparacion, advertencia letra repetida
if(q>=1){
for(int a=0;a<q;a++){
if(letraIngresada[a].equalsIgnoreCase(letraIngresada[q])){
System.err.println("Ya ingresaste esa letra, intenta de nuevo...");
 
}}}
 
//Si la palabra contiene la letra ingresada
if(palabraJuego.contains(letraIngresada[q])==true){
 
//Gana el juego
if(palabraJuego.equalsIgnoreCase(letraIngresada[q])){
 System.out.println("GANASTE, La palabra oculta era: "+palabraJuego);
System.exit(0);
}

for(int e=0;e<palabraJuego.length();e++){
if(letraIngresada[q].equalsIgnoreCase(letrasPalabras[e])){
palabraresp[e]=letraIngresada[q];
 
}
 
}
//Memoria de cada posicion del array de letras correctas en una variable tipo String
String palabraW="";
for(int z=0;z<palabraJuego.length();z++){
palabraW=palabraW+palabraresp[z];
 
}
palabraFinal=palabraW;
System.out.println(palabraW);
System.out.println();
 
}else{
//La letra no se encuentra
System.out.println("no esta, una vida menos");
vidas--;
//Estado acual de las letras descubiertas hasta el momento
String palabraL="";
for(int z=0;z<palabraJuego.length();z++){
palabraL=palabraL+palabraresp[z];
 
}
System.out.println(palabraL);
System.out.println();

//Termina el juego
if(vidas==0){
System.out.println("GAME OVER!");
System.exit(0);
}
}

//GANA
if(palabraFinal.equalsIgnoreCase(palabraJuego)){

    
System.out.println("GANASTE, La palabra oculta era: "+palabraJuego);
System.exit(0);
}
 
} }
 
}
