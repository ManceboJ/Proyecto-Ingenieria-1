import java.util.Scanner;
import java.util.HashMap;

public class ListaUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String id, psw;		// Variables utilizadas para validaci�n de condiciones de longitud/existencia
		char [] arr;
		char fin;
		HashMap<String, String> usuarios = new HashMap<String, String>();  //Creaci�n de variable de almacenamiento de usuarios
		//  Bucle por el cual pulsando la 'S' o la 's' al final del registro se continua registrando mas usuarios
		do{		
			// Introducci�n de id y validaci�n del mismo
			do{		
			System.out.print("Indroduzca el id de usuario, debe contener 8 caractres: ");
			id = sc.nextLine();
			arr = id.toCharArray();	
			// Comprobaci�n de que id no existe ya. Si existe se solicita un nuevo id.
			while(usuarios.containsKey(id)) { 		 
				System.out.print("El id introducido ya existe, introduzca un nuevo id de 8 caracteres: ");
				id = sc.nextLine();
				arr = id.toCharArray();
			}
		}while(arr.length != 8); 		
		
		// Introducci�n de contrase�a y validaci�n de la misma
		do {
			System.out.print("Introduzca la contrase�a para el nuevo id, debe contener 8 caracteres: ");
			psw = sc.nextLine();
			arr = psw.toCharArray();
		}while(arr.length != 8); 	
		
		usuarios.put(id,psw); 			// Registro de id y contrase�a
		System.out.println("Usuario registrado correctamente.");
		System.out.print("Para registrar mas usuarios pulse la tecla 'S', para terminar pulse cualquuier otra letra:  ");
		fin = sc.next().charAt(0);
		id = sc.nextLine(); // Lectura de teclado para limpiar intro
		}while(fin =='s' || fin =='S');    
		
	//  Comprobaci�n de que se guardan correctamente los id/psw
		System.out.println("Lista de id / contrase�as registradas: ");  
		System.out.println(usuarios); // imprimir por pantalla todos los id, contrase�a
		
		
		 /* Codigo para iniciar sesi�n
		  * 
		  * 
		  * 
		  * 
		  
		String nom, pword;
		do {
		do {
		System.out.print("Introduzca su id de usuario: ");
		nom = sc.next();
		}while(!usuarios.containsKey(nom));
		pword = "0";
		for(int i=0; i<3 && !pword.equals(usuarios.get(nom)); i++){
		System.out.print("Introduzca su contrase�a: ");
		pword = sc.next();
		}
		}while(!pword.equals(usuarios.get(nom)));
		System.out.println("Iniciando sesi�n.");
		
		  */
		sc.close();

	}

}
