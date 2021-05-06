import java.util.Scanner;

public class Caixa {
	
	public static void main(String[] args) {
		
		int valor;
		int nota100 = 100;
		int nota50 = 50;
		int nota20 = 20;
		int nota10 = 10;
		int nota5 = 5;
		int nota2 = 2;
		int nota1 = 1;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o valor desejado. Valor mínimo: R$1,00");
		valor = sc.nextInt();
		
		if(valor >=1) {
			if(valor >= nota100) {
				nota100 = valor / 100;
				valor = valor % 100;
				System.out.println(nota100 + " notas de R$100,00");
			}
			if(valor >= nota50) {
				nota50 = valor / 50;
				valor = valor % 50;
				System.out.println(nota50 + " notas de R$50,00");
			}
			if(valor >= nota20) {
				nota20 = valor / 20;
				valor = valor % 20;
				System.out.println(nota20 + " notas de R$20,00");
			}
			if(valor >= nota10) {
				nota10 = valor / 10;
				valor = valor % 10;
				System.out.println(nota10 + " notas de R$10,00");
			}
			if(valor >= nota5) {
				nota5 = valor / 5;
				valor = valor % 5;
				System.out.println(nota5 + " notas de R$5,00");
			}
			if(valor >= nota2) {
				nota5 = valor / 2;
				valor = valor % 2;
				System.out.println(nota2 + " notas de R$2,00");
			}
			if(valor >= nota1) {
				nota1 = valor / 1;
				valor = valor % 1;
				System.out.println(nota1 + " notas de R$1,00");
			}
		}else{
		System.out.println("Saque não realizado");
		}			
	}	
}
		
		