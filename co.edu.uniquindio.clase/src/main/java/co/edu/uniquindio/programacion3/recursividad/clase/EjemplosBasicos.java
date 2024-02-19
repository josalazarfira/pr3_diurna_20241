package co.edu.uniquindio.programacion3.recursividad.clase;

public class EjemplosBasicos {

	
	static int fib = 0;
	public static void main(String[] args) 
	{
//		int n = 5;
//		int i= 1;
////		System.out.println("Contexto de ejecuci�n actual: " +i );
////		++i;
//
//		System.out.println("suma enteros es:  "+ sumaN_Enteros(n));
////		calcularFactorial(n);
////		calcularFactorial_Iteractio(3);
////		System.out.println(fibonacci(n));

//		int[] arreglo = {1,2,2,3,5,2,7};
//		int i = 0;
//		int mayor = 0;
//		System.out.println("El mayor del arreglo es: "+ encontrarMayor(arreglo,i, mayor));

		int[] arreglo = {5,4,3,2,1,5,7,5,5};
		int inicio = 0;
		int fin = arreglo.length;
		int elem = 5;

		numeroApariciones(arreglo, inicio, fin, elem);
	}


	private static int numeroApariciones(int[] arreglo,
									  int inicio,
									  int fin,
									  int elem) {
		if(inicio == fin){
			return 0;
		}else{
			if(arreglo[inicio]== elem){
				return numeroApariciones(arreglo, inicio+1, fin, elem)+1;
			}else{
				return numeroApariciones(arreglo, inicio+1, fin, elem);
			}
		}
	}



	private static int encontrarMayor(int[] arreglo, int i, int mayor) {
		if(i == arreglo.length){
			return  mayor;
		}else{
			if(arreglo[i] > mayor){
				mayor = arreglo[i];
			}
			return encontrarMayor(arreglo, i+1, mayor);
		}
	}


	//-----------------------------------------SUMA DE N N�MEROS ENTEROS--------------------------------------
//--------------------------------------------------------------------------------------------------------	
	//Ejemplo suma de N numeros enteros
	public static int sumaN_Enteros(int n)
	{
		int resultado = 0;
		if(n == 1)
		{
			return 1;
		}
		else
		{
			resultado = sumaN_Enteros(n-1) + n;
			return resultado;
		}
	}

//	public static int sumaN_Enteros(int n) {
//		if(n == 1)
//		{
//			return 1;
//		}
//		else
//		{
//			return sumaN_Enteros(n-1) + n;
//		}
//	}

//-----------------------------------------CALCULAR FACTORIAL DE UN N�MERO--------------------------------
//--------------------------------------------------------------------------------------------------------		
	
	public static int calcularFactorial(int n)
	{
		int resultado = 0;
		
		if(n==1)
		{
			System.out.println("Valor del factorial de "+n+"!= "+1);
			return 1;
		}
		else
		{
			resultado = n * calcularFactorial(n-1);
			System.out.println("Valor del factorial de "+n+"!= "+resultado);
			return resultado;
		}
	}

	
	
//-----------------------------------------CALCULAR FACTORIAL DE UN N�MERO DE FORMA IETRACTIVA------------
//--------------------------------------------------------------------------------------------------------		
	
	public static void calcularFactorial_Iteractio(int n)
	{
		
		int fact = 1;
		
		
		for (int i = 1; i <= n; i++)
		{
			fact = i * fact;
			System.out.println("Valor del factorial de "+i+"!= "+fact);
		}
	}
	
//-----------------------------------------CALCULAR FIBONACCI--------------------------------------
//--------------------------------------------------------------------------------------------------------		
	public static int fibonacci(int n) 
	{
		if(n == 1 || n==0){
			return n;
		}
		else
		{
			return fibonacci(n-1)+ fibonacci(n-2);
		}
	}

}