import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		double salario = 0;
		
		
		System.out.println("Informe seu sal�rio: ");
		salario = sc.nextDouble();
		
		double result = salario/1212.00;

		System.out.printf("Voc� recebe %.2f",result);
		System.out.print(" Sal�rio(s) min�mo(s)");
		
		sc.close();
	}

}
