package fin.coop1504.tallerJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import fin.coop1504.tallerJava.excepciones.ExcepcionValidacion;

public class AplicacionTaller {

	public static void main(String[] args) {
/*
		String cadena = "Hola Mundo ";

		System.out.println(cadena.concat("Tierra"));
		System.out.println(cadena);

		System.out.println("-----------Clase StringBuffer-----------");

		StringBuffer cadenaEspecial = new StringBuffer("Hola Mundo");
		cadenaEspecial.append("Tierra");
		System.out.println(cadenaEspecial.toString());

		System.out.println("-----------Invertir cadena-----------");

		for (int i = cadena.length() - 1; i >= 0; i--) {
			System.out.print(cadena.charAt(i));
		}

		System.out.println("\n -----------Imprimir cadena for resumido-----------");
		for (char a : cadena.toCharArray()) {
			System.out.print(a);
		}

		System.out.println("\n -----------Invertir cadena con reverse-----------");
		System.out.println(cadenaEspecial.reverse());

		System.out.println("\n -----------ARREGLO ESTATICO-----------");

		String[] cadenas = new String[4];// 1 forma para declarar e inicializar
		cadenas[0] = "Karen";
		cadenas[1] = "Byron";
		cadenas[2] = "NOmbre1";
		cadenas[3] = "Nombre2";

		String[] cadenas2 = { "java", "C++", "xxx" };// 2da forma declarar inicializar

		// impresion de arreglo
		for (String cad : cadenas) {
			System.out.println(cad);
		}

		for (String cad : cadenas2) {
			System.out.println(cad);
		}

		System.out.println("\n -----------ARREGLO DINAMICO-----------");

		// con clase vector
		Vector<String> vector = new Vector();
		vector.add("cadena 1");
		vector.add("cadena 2");
		vector.add("cadena 3");

		System.out.println(vector.size());

		// con arrayList
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(20);
		lista.add(30);

		System.out.println(lista.size());

		// recorrido con forEach de arraylist

		lista.forEach(elemento -> {
			if (elemento.equals(20))
				System.out.println(elemento + 20);
			else

				System.out.println(elemento);
		});
		
		//Vector crea nuevo objeto
		System.out.println("\n -----------OBTENER VALOR DE CLASE VECTOR-----------");
		String cadenaVector = vector.get(0);
		
		System.out.println(cadenaVector);
		
		System.out.println("\n -----------OBTENER VALOR DE CLASE ARRAYLIST-----------");
		//Arraylist envia el mismo objeto
		Integer numeroarrayList = lista.get(0);
		System.out.println(numeroarrayList);
		*/
		
		validarDatos("41");
		
		try {
			validarDatosEspecificos("");
		} catch (ExcepcionValidacion e) {
			System.err.println("Codigo error: " + e.getCodigo() + " - Mensaje error: " + e.getMensajeTecnico());
			e.printStackTrace();
		}finally {
			System.out.println("Finally ejecuta este bloque con o sin Error");
		}
		
		
	}
	
	public static void validarDatos(String anios) {
		
		Integer edad = Integer.parseInt(anios);
		System.out.println(edad);
	}
	
	//utilizando la clase ExceptionValidation q creamos
	public static void validarDatosEspecificos(String dato) throws ExcepcionValidacion {
		if (dato == null || dato.isEmpty()){
			//forma 1
//			ExcepcionValidacion error = new ExcepcionValidacion("001","Error al validar el dato");
//			throw error; //throw propaga la excepcion
			
			//forma2 sin crear el objeto
			throw new ExcepcionValidacion("001","Error al validar el dato");
		}
	}

}
