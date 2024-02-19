package co.edu.uniquindio.programacion3.recursividad.clase;

import co.edu.uniquindio.programacion3.recursividad.clase.model.Clase2;
import co.edu.uniquindio.programacion3.recursividad.clase.model.Estudiante;

public class Parametros_PorReferencia
{
	
	
	public static void main(String[] args) 
	{
		//Paso por referencia
		Estudiante estudiante = new Estudiante();
		estudiante.setEdad(22);
		System.out.println("Valor del objeto antes de modificar: "+estudiante.getEdad());
		
		Clase2 clase2 = new Clase2();
		clase2.cambiarValor(estudiante);
		System.out.println("Valor del objeto al cambiarlo: "+estudiante.getEdad());
	}

}
