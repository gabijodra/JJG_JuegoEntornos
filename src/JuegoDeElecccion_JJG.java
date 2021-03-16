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
		
		System.out.println("Esta es la hístoria de "+nombre+" el cual se encontraba tumbado en la cama, un día cualquiera, cuando....");
		
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
	  
		} if (opcion == 1) {

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Al quedarse 20 minutillos mas en la cama " + nombre +" pensó que no pasaría nada,\n"
					+ "ya que solía hacerlo a menudo arriesgandose a llegar tarde, pero \n"
					+ "esta vez sería un ruido lo que cambiaría todo." );

			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("1:" + nombre + " se levanta para ver que ha pasado, cree haber oído a su gato gritar de dolor de alguna manera.\n"
					+  "2:" + nombre + " como de costumbre se queda durmiendo, habrá sido su gato jugando con alguna zapatilla.");

			opcion=scanner.nextInt();

			if(opcion<=0 || opcion>3 ) {
				System.out.println("Escoge de nuevo");
				opcion=scanner.nextInt();
			}
			if (opcion == 1) {

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("En efecto se trataba de su gato juan muerto encima de la encimera de la cocina,\n" 
									+  nombre + " desesperado llama al veterinario, paralizado por los nervios,\n" 
									+ "miedo y desolación al presenciar tal imagen de su mejor amigo.");
			
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("1:El veterinario coge el telefono y se dirije rapidamente a casa de " + nombre + ".\n"
								 + "2:El veterinario no coge el telefono por lo que " + nombre + " decide reanimar el mismo a su amigo.");

				opcion=scanner.nextInt();

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				
				if(opcion<=0 || opcion>3 ) {
					System.out.println("Escoge de nuevo");
					opcion=scanner.nextInt();
				}
				
				if (opcion == 1) {
					System.out.println("Al llegar hacia casa de " + nombre + ", el veterinario se pierde antes de llegar,\n" 
				                       + "por lo que el gato de " + nombre + " muere, lo sentimos.");
					
				}if (opcion == 2) {
					System.out.println("Gracias a Dios el veterinario ha llegado a tiempo a tu casa y el gato de\n " 
										+ nombre + " ha conseguido sobrevivir, felicidades.");
					
				}

			} if (opcion == 2) {

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Finalmente " + nombre + " se despierta cuatro horas más tarde, " + nombre +  " ha desperdiciado el día,\n"
						 + "la cocina huele raro, es a su gato muerto, " + nombre +  " no tendrá la conciencia tranquila de por vida\n" 
						 + "su mejor amigo ha muerto por su culpa.");
				
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("1:" + nombre + " sigue su vida con normalidad.\n"
								 + "2:" + nombre + " decide acabar con su vida en compensación hacia su gato.");

				opcion=scanner.nextInt();

				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				
				if(opcion<=0 || opcion>3 ) {
					System.out.println("Escoge de nuevo");
					opcion=scanner.nextInt();
				}
				
				if (opcion == 1) {
					System.out.println("Lo sentimos, pero usted no tiene sentimientos.");
					
				}if (opcion == 2) {
					System.out.println("No hay que ser tan radical, pero hay que levantarse a tiempo.");
					
				}

			}

			}

		  }	
		}
