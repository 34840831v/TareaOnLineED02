import java.util.Scanner;

public class Saluda {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		System.out.println("CUAL ES TU NOMBRE");
		String nombre=teclado.nextLine();
		System.out.println(nombre);
	}

}
