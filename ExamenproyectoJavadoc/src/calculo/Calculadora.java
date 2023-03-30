package calculo;

import java.util.Scanner;
/***/
public class Calculadora {

	public static void main(String[] args) {
		obtenerCalculo();
	}
	
	public static void obtenerCalculo() {
		Scanner lectura = new Scanner (System.in);
		System.out.println("Ingrese el número de una de las operaciones: ");
		System.out.println("1 - Suma ");
		System.out.println("1 - Resta ");
		System.out.println("3 - Divide");
		System.out.println("4 - Tabla de multiplicar ");
		String calculoS = lectura.next();
		solicitaDatosyRealizaCalculo(calculoS);
	}
	
	public static void solicitaDatosyRealizaCalculo(final String operacion) {
		String numero1 ="";
		String numero2 ="";
		Scanner lectura =null;
		Calculo calculo =null;
		switch (operacion) {
        case "1": 
        	System.out.println ("Ha seleccionado sumar"); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese los números a sumar: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		System.out.println("Numero 2: ");
    		numero2 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.setNumero2(Integer.parseInt(numero2));
    		System.out.println("El resultado es: "+ calculo.sumaNumeros());
        break;
        
        case "2":
        	System.out.println ("Ha seleccionado restar"); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese los números a restar: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		System.out.println("Numero 2: ");
    		numero2 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.setNumero2(Integer.parseInt(numero2));
    		System.out.println("El resultado es: "+ calculo.restaNumeros());
        break;

        case "3": 
        	System.out.println ("Ha seleccionado dividir "); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese los números a dividir: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		System.out.println("Numero 2: ");
    		numero2 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.setNumero2(Integer.parseInt(numero2));
    		try {
    			System.out.println("El resultado es: "+ calculo.divideNumeros());
    		} catch (Exception e) {
    			System.out.println("Ha dado error "+e.getMessage());
    		}
        break;
        case "4":
        	System.out.println ("Ha seleccionado obtener la tabla de multiplicar "); 
        	lectura = new Scanner (System.in);
    		System.out.println("Ingrese el número a obtener su tabla: ");
    		System.out.println("Numero 1: ");
    		numero1 = lectura.next();
    		calculo = new Calculo(Integer.parseInt(numero1));
    		calculo.muestraTablaMultiplicar();
	        break;
        default: System.out.println ("No existe el calculo solicitado");
        
        break;
	} 
	System.out.println("Finalizadoción del cálculo");
	}

}
