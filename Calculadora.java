import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
		Integer resultado=0;
		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println("Ingrese su operacion /n 3 para sumar /n 2 para restar /n 1 para multiplicar /n 4 para dividir");
			opcion=teclado.nextInt();
		}while(opcion<1 && opcion>4);
		
		System.out.println("Ingrese el primer numero");
		a=teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		b=teclado.nextInt();
		 
		switch (opcion) {
		case 1:
			resultado=sumar(a,b);
			break;
		case 2:
			resultado=restar(a,b);			
			break;
		case 3:
			resultado=multiplicar(a,b);
			break;
		case 4:
			resultado=dividir(a,b);
			break;

		default:
			break;
		}
		System.out.println("El resultado es "+ resultado.toString());
	}
	public static Integer sumar(Integer a, Integer b) {
		return a+b;
	}
	public static Integer restar(Integer a, Integer b) {
		return a-b;
	}
	public static Integer multiplicar(Integer a, Integer b) {
		return a*b;
	}
	public static Integer dividir(Integer a, Integer b) {
		return a/b;
	}
	
}
