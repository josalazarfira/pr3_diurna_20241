package co.edu.uniquindio.programacion3.recursividad.practica;

public class E1_EjercicioPractica {

	public static void main(String[] args) {
//		int numero = 123;
//		int resultado = 0;
//		resultado = contarDigitos(numero);
//		System.out.println("");

		String palabra="otorrinolaringologia";
		int indice = 0;
		int vocales =  contarVocales(palabra, indice);
		System.out.println("Vocales: "+ vocales);


	}

	private static int contarVocales(String palabra, int i) {
		if(palabra.length() == i){
			return 0;
		}else {
			if(isVocal(palabra.charAt(i))){
				return contarVocales(palabra, ++i)+1;
			}else{
				return contarVocales(palabra, ++i);
			}
		}
	}

	private static boolean isVocal(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
			return true;
		}else{
			return false;
		}
	}

	private static int contarDigitos(int numero) {
		if(numero < 10){
			return 1;
		}else {
			return contarDigitos(numero/10)+1;
		}
	}

























//	private static int contarDigitos(int numero) {
//		int valorRetorno = 0;
//		if(numero < 10){
//			return 1;
//		}else{
//			valorRetorno = contarDigitos(numero/10);
//			valorRetorno = valorRetorno + 1;
//			return valorRetorno;
//			//return contarDigitos(numero/10)+1;
//		}
//	}

}
