import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("¿CUAL ES TU NOMBRE?");
		String nombre=teclado.nextLine();
		System.out.println("HOLA " + nombre);
		String clase_nombre;
		clase_nombre=nombre;
		System.out.println("El contenido de la variable clase_nombre es: " + clase_nombre);
		}

}
