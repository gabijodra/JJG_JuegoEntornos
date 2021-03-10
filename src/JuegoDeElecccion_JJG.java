import java.util.Scanner;

public class JuegoDeElecccion_JJG {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		
		int opcion;
		
		String nombre;
		
		System.out.print(" \n - Escriba su nombre para empezar el juego: ");
		nombre=scanner.next().toUpperCase();
		
		System.out.println("\n ¡¡BIENVENIDO "+nombre+" !! \n");
		
		System.out.println("Empezemos con la historia...\n");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Esta es la hístoria de  "+nombre+" el cual se encontraba tumbado en la cama, un día cualquiera, cuando....");
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1: Se queda 20 minutos mas en la cama.\n"
						+  "2: Se levanto de la cama y se fue a desayunar \n"
						+  "3: De repente se escucho un estruendo. \n");
		
		opcion=scanner.nextInt();
		
		if(opcion<=0 || opcion>3 ) {
			System.out.println("Escoge de nuevo");
			opcion=scanner.nextInt();
		}
		

	}
	
}