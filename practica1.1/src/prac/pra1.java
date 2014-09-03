package prac;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class pra1 {
	public static void main(String[] args) {
		
             pra1 Proyecto = new pra1();
	Proyecto.menu();	
	}
			
		//(1)Jugar una Patida	
	public void Jugar_una_Patida(){
	
	}

	//(2)Seleccionar el numero de tokens a jugar
	public void Seleccionar(){
		
		}


	//(3) Mostrar las reglas del juego
	public void Reglas(){
		System.out.println("(1) Guard:\n" +
				"Permite adivinar la mano del rival (cartas del 2-8) si adivina, el jugador rival sale del juego.\n" +
				"(2) Priest:\n" +
				"Permite ver la mano del jugador rival\n" +
				"(3) Baron:\n" +
				"Compara manos con el rival, el jugador con la carta mas baja sale del juego. En caso de empate\n" +
				"no sucede nada. \n" +
				"(4) Handmaid\n" +
				"El jugador que utiliza esta carta es inmune a los ataques de los demas por un (1) turno. \n" +
				"(5) Prince\n" +
				"Permite “botar” la mano del jugador o la del rival. Y da una carta nueva del deck. \n" +
				"(6) King\n" +
				"Intercambia manos entre jugadores.\n" +
				"(7) Countess\n" +
				"Si el jugador tiene un Prince o King en su mano y la Countess debe jugar la Countess. \n" +
				"(8) Princess\n" +
				"Si el jugador juega esta carta pierde el juego. ");
						}

	
	
	//(4)Salida
	public void Salida(){
		
		}
	
	

	//para leer desde teclado
	public double lee(){
		double num;
		try{
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader br = new BufferedReader(isr);
			String sdato;
			sdato = br.readLine();
			num = Double.parseDouble(sdato);
		}
		catch(IOException ioe){
			num=0.0;
		}
		return num;
		}

	//para  leer un entero
	public int leeint(){
		int num;
		try{
			InputStreamReader isr = new InputStreamReader (System.in);
			BufferedReader br = new BufferedReader(isr);
			String sdato;
			sdato = br.readLine();
			num = Integer.parseInt(sdato);
		}
		catch(IOException ioe){
			num=0;
		}
		return num;
		}
	
	
	//para salir del programa
	public int Fuera(){
		int sal; 
		System.out.println("\n\n\nSi deseas regresar al menu ingrese [1]");
		sal=leeint();
		return sal;
		}




	//despliega menu
	public void menu(){
		int a;
		int p;
		do{
		do{
		System.out.println("\n\n\t\t\tBienvenido a Love Letter\n\n");
		System.out.println("\t1.-Jugar una Patida\n\t2.-Seleccionar el numero de tokens a jugar\n\t3.-Mostrar las reglas del juego\n\t4.-Salir.");
		System.out.println("\n\nEscoja un numero :");
		a=leeint();
		}while(a<1 || a>4);
		switch(a){
			case 1:
			Jugar_una_Patida();  //manda a llamara a cada uno de los metodos
			p=Fuera();
			break;
			case 2:
			Seleccionar();
			p=Fuera();
			break;
			case 3:
			Reglas();
			p=Fuera();
			break;
			case 4:
			Salida();
			p=Fuera();
			break;
			default:
			System.out.println("Opcion incorrecta");
			p=1;
			break;
			}
		}while(p==1);
}
}